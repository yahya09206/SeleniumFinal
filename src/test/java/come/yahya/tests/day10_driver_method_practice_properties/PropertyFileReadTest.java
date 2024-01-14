package come.yahya.tests.day10_driver_method_practice_properties;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PropertyFileReadTest {

    @Test
    public void testInitialRead() throws FileNotFoundException {

        // Open a connection to the file using FileInputStream object
        FileInputStream in = new FileInputStream("config.properties");
    }
}
