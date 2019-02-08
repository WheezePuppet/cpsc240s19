
import java.util.Hashtable;

public class Configuration {


    /* Stuff general to Singleton pattern classes.  */
    private static Configuration theInstance;
    
    public static synchronized Configuration instance() {
        if (theInstance == null) {
            theInstance = new Configuration();
        }
        return theInstance;
    }



    /* Stuff specific to the Configuration example (note the constructor is
     * private, though, which *is* part of the Singleton pattern.)
     */
    private Hashtable<String,String> params;

    private Configuration() {
        params = new Hashtable<String,String>();
        /*
         * open the preferences.txt file
         * read all the key value pairs line by line
         * break each one on a "=" sign
         * put the corresponding key/value pair into "params"
         * close the file
         */
    }

    public String getParamValue(String param) {
        return params.get(param);
    }
}


/*
 * Sample client code:
 *
 * String bgColor = Configuration.instance().getParamValue("color");
 */
