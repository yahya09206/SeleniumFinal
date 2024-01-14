package come.yahya.tests.day10_driver_method_practice_properties;

import come.yahya.utility.ConfigReader;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadTest {

    @Test
    public void testInitialRead() throws IOException {

        // Open a connection to the file using FileInputStream object
        FileInputStream in = new FileInputStream("config.properties");

        // Create empty properties object
        Properties properties = new Properties();

        // Load the FileInputStream into the Properties Object
        properties.load(in);

        // close the connection by calling slow method of FileInputStream object
        in.close();

        // Now actually read from the properties file using its key
        String helloValue = properties.getProperty("hello");
        System.out.println("helloValue = " + helloValue);

        // read from file without saving into variable
        System.out.println("properties.getProperty(\"message\") = " + properties.getProperty("message"));

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
    }

    @Test
    public void testReadWithTryCatch(){

        try {
            FileInputStream input = new FileInputStream("config.properties");
            Properties properties = new Properties();
            properties.load(input);
            // this will throw IOException, its parent of FileNotFoundException
            input.close();
            System.out.println("properties.getProperty(\"hello\") = " + properties.getProperty("hello"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testReadingUsingUtilityClass(){

        System.out.println("ConfigReader.read(\"hello\") = " + ConfigReader.read("hello"));
        System.out.println("ConfigReader.read(\"weborder_username\") = " + ConfigReader.read("weborder_username"));
    }
}
