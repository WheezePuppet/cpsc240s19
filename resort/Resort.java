
import java.util.Scanner;
import java.io.File;

class Resort {
    private String name;
    private String phone;
    private int rating;
    private int cost;
    private String description;

    public Resort(Scanner s) {

        name = s.nextLine();
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

        // Make sure all the above worked.
        System.out.println("name = " + name);
        System.out.println("phone = " + phone);
        System.out.println("rating = " + rating);
        System.out.println("cost = " + cost);
        System.out.println("description = " + description);
    }


    public static void main(String args[]) {
        try {
            Scanner s = new Scanner(new File("westword.dat"));
            Resort r = new Resort(s);
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
