
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;

public class Weird {
    public static void main(String args[]) {
        ArrayList<String> lsd = new ArrayList<String>();
        ArrayList<String> baddies = new ArrayList<String>();
        String guys[] = {"Butch","Bruce","MacLaine","Sinatra","Martin"};
        String grades[] = { "A", "A-", "B+", "B", "B-", "C+", "C", "C-",
            "D+", "D", "F" }; 
        String things[] = {
            "hive", "cave", "nest", "dam",
            "ear", "eye", "nose", "mouth",
            "bagel", "danish", "donut", "pastry",
            "put", "let", "give", "take",
            "Stephen", "is", "on", "drugs" };
        Hashtable<String, String> stars = new Hashtable<String, String>();
        stars.put("Norris","Chuck");
        stars.put("Bruce","Lee");
        stars.put("Jackie","Chan");
        stars.put("Sinatra","Frank");
        stars.put("Sammy","Davis, Jr.");
        baddies.add("Jafar");
        baddies.add("Gaston");
        baddies.add("Scar");
        baddies.add("Ursula");
        baddies.add("Cruella");

        Iterator<String> a = baddies.iterator();
        Iterator<String> b = Arrays.asList(guys).iterator();
        Iterator<String> c = Arrays.asList(things).iterator();
        Iterator<String> d = Arrays.asList(grades).iterator();
        Iterator<String> e = Arrays.asList(guys).iterator();
        Iterator<String> f = baddies.iterator();
        Iterator<String> g = baddies.iterator();
        Iterator<String> h = Arrays.asList(things).iterator();
        Iterator<String> i = Arrays.asList(things).iterator();
        Iterator<String> j = Arrays.asList(grades).iterator();

        craziness(h,i);
        for (int z=0; z<8; z++) {
            h.next();
            j.next();
        }
        a.next();
        b.next();
        c.next();
        b.next();
        f.next();
        i.next();
        a.next();
        a.next();
        a.next();
        g.next();
        a.next();
        f.next();
        h.next();
        b.next();
        e.next();
        lsd.add(stars.get(b.next()));
        lsd.add(stars.get(e.next()));
        lsd.add(f.next());
        lsd.add(h.next());
        lsd.add(i.next());
        craziness(h,i);
        lsd.add(i.next());
        i.next();
        i.next();
        i.next();
        lsd.add(i.next());
        c.next();
        lsd.add(d.next());
        c.next();
        lsd.add(c.next());

        for (String acid: lsd) {
            System.out.print(acid + " ");
        }
        System.out.println();
    }

    static void craziness(Iterator a, Iterator b) {
        for (int i=0; i<4; i++) {
            a.next();
            b.next();
        }
    }
}
