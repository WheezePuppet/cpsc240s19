
import java.util.Hashtable;
import java.util.Enumeration;

public class Heroes {
    public static void main(String args[]) {

        Hashtable<String,String> heroes = new Hashtable<String,String>();
        heroes.put("Superman","Clark Kent");
        heroes.put("Batman","Stephen Davies");
        heroes.put("Iron Man","Tony Stark");
        heroes.put("Elastigirl","Helen Incredible");
        heroes.put("Batman","Bruce Wayne");   // overwrites previous value.
        
        // Doesn't bomb, but does return null.
        System.out.println("The Hulk is really " + heroes.get("The Hulk"));

        Enumeration<String> keys = heroes.keys();
        while (keys.hasMoreElements()) {
            String hero = keys.nextElement();
            String realName = heroes.get(hero);
            System.out.println("(Pssstt..." + hero + " is really " +
                realName + ")");
        }
        
    }
}
