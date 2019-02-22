
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;

class ReservationSystem {

    private ArrayList<Resort> resorts = new ArrayList<Resort>();

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Usage: ReservationSystem resortsFile.dat");
            return;
        }
        try {
            Scanner s = new Scanner(new File(args[0]));
            ReservationSystem rs = new ReservationSystem(s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ReservationSystem(Scanner s) {

        try {
            String thomas = s.nextLine();
            while (!hasOnlyHyphens(thomas)) {
                thomas = s.nextLine();
            }

            /* Jordan's way: */
/*
            while (true) {
                try {
                    Resort r = new Resort(s);
                    resorts.add(r);
                    System.out.println("Our resort is: " + r);
                } catch (Exception e) {
                    break;
                }
            }
*/

            /* Stephen's way: */
            try {
                while (true) {
                    Resort r = new Resort(s);
                    resorts.add(r);
                    System.out.println("Our resort is: " + r);
                }
            } catch (Exception e) {
            }

            System.out.println("What reservation do you want to make?");

            PrintWriter pw = new PrintWriter(new File("output.dat"));
            for (Resort r: resorts) {
                r.persist(pw);
            }
            pw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static boolean hasOnlyHyphens(String s) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '-') {
            } else {
                return false;
            }
        }
        return true;
    }

}
