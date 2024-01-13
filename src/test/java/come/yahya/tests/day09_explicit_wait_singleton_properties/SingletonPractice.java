package come.yahya.tests.day09_explicit_wait_singleton_properties;

import come.yahya.utility.Driver;
import org.junit.jupiter.api.Test;
public class SingletonPractice {

    @Test
    public void testOutDriverUtilityClass(){

        Driver.getDriver().get("https://google.com");
//        Driver.getDriver();
//        Driver.getDriver();
//        Driver.getDriver();
    }

    @Test
    public void testSingleton(){

        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
    }
}
