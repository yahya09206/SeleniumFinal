package come.yahya.tests.day09_explicit_wait_singleton_properties;

import org.junit.jupiter.api.Test;

public class SingletonPractice {

    @Test
    public void testSingleton(){

        Singleton s1 = new Singleton();
        s1.word = "abc";
    }
}
