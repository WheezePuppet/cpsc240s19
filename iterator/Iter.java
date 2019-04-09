
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Iter {
    public static void main(String args[]) {

        // Demonstrating a function that iterates through a collection of
        // items, yet is agnostic with respect to what particular type of
        // collection it is:
        ArrayList<String> people = new ArrayList<String>();
        people.add("Rae");
        people.add("Lizzy");
        people.add("TJ");
        people.add("Johnny");
        printMsg("love", people.iterator());        

        Set<String> activities = new HashSet<String>();
        activities.add("martial arts");
        activities.add("videogames");
        activities.add("videogames");
        activities.add("videogames");
        activities.add("running");
        activities.add("videogames");
        activities.add("biking");
        activities.add("biking");
        activities.add("biking");
        activities.add("biking");
        activities.add("biking");
        activities.add("biking");
        printMsg("do", activities.iterator());        

        Hashtable<String,String> heroes = new Hashtable<String,String>();
        heroes.put("Batman","Bruce");
        heroes.put("Superman","Clark");
        heroes.put("Wonder Woman","Diana");
        heroes.put("Iron Man","Tony");
        printMsg("admire",heroes.keySet().iterator());
        printMsg("am acquainted with",heroes.values().iterator());

        // Demonstrating simultaneous ierators on the same collection that do
        // not interfere with each other:
        Iterator<String> i1 = people.iterator();
        System.out.println("i1 just gave me: " + i1.next());
        System.out.println("i1 just gave me: " + i1.next());
        Iterator<String> i2 = people.iterator();
        System.out.println("i1 just gave me: " + i1.next());
        System.out.println("i2 just gave me: " + i2.next());
        System.out.println("i2 just gave me: " + i2.next());
        System.out.println("i2 just gave me: " + i2.next());
        System.out.println("i1 just gave me: " + i1.next());
        System.out.println("i2 just gave me: " + i2.next());

    }


    private static void printMsg(String verb, Iterator<String> names) {
        while (names.hasNext()) {
            System.out.println("I " + verb + " " + names.next() + "!");
        }
    }
    
}
