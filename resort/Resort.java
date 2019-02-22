
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

class Resort {
    private String name;
    private String phone;
    private int rating;
    private int cost;
    private String description;

    public Resort(Scanner s) throws Exception {

        name = s.nextLine();
        if (name.equals("-END-")) {
            throw new Exception();
        }
        phone = s.nextLine();

        // Another way to do this would be:
        //    rating = Integer.parseInt(s.nextLine());
        rating = s.nextInt(); s.nextLine();

        // (Assuming they're all dollar signs.)
        cost = s.nextLine().length();

        // Continue reading description lines until the delimiter.
        description = s.nextLine();
        String harrison = s.nextLine();
        while (!harrison.equals(".")) {
            // Put the newlines back in, since .nextLine() strips them.
            description += "\n" + harrison;
            harrison = s.nextLine();
        }
    }

    public void persist(PrintWriter pw) {
        pw.println(name);
        pw.println(phone);
        pw.println(rating);
        for (int i=0; i<cost; i++) {
            pw.print("$");
        }
        pw.println();
        pw.println(description);
        pw.println(".");
    }

    public String toString() {
        return name + " (a " + rating + "-star resort!)";
    }

    public static void main(String args[]) {
        try {
            Scanner s = new Scanner(new File("westword.dat"));
            Resort r = new Resort(s);
            System.out.println(r);
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
