
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

class ReservationSystem {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Usage: ReservationSystem resortsFile.dat");
            return;
        }
        try {
            Scanner s = new Scanner(new File(args[0]));
    
            String thomas = s.nextLine();
            while (!hasOnlyHyphens(thomas)) {
                thomas = s.nextLine();
            }

            ArrayList<Resort> resorts = new ArrayList<Resort>();

            /* Jordan's way: */
            while (true) {
                try {
                    Resort r = new Resort(s);
                    resorts.add(r);
                    System.out.println("Our resort is: " + r);
                } catch (Exception e) {
                    break;
                }
            }

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
