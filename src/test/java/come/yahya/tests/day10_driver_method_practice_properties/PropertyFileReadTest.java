package come.yahya.tests.day10_driver_method_practice_properties;

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

        // Now actaully read from the properties file using its key
        String helloValue = properties.getProperty("hello");
        System.out.println("helloValue = " + helloValue);
    }
}
