package come.yahya.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // Declare Properties object at class level so it can be accessible in static method
    private static Properties properties = new Properties();

    // we want to only load the file once, so we can use static block
    static {
        try {
            FileInputStream input = new FileInputStream("config.properties");
            properties.load(input);
            // this will throw IOException, its parent of FileNotFoundException
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param key
     * @return
     */
    public static String read(String key){
        return properties.getProperty(key);
    }
}
