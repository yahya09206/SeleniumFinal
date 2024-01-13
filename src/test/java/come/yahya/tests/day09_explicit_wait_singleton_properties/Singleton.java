package come.yahya.tests.day09_explicit_wait_singleton_properties;

/**
 * We want this class to only create one object
 * We want to block creation of more than one object
 */
public class Singleton {

    // variable obj
    private static Singleton obj;

    private Singleton(){

    }

    public static Singleton getObj(){

        // check if obj exist = use current one
        if (obj == null){
            System.out.println("Object has not been created, creating one now");
            obj = new Singleton();
            return obj;
        } else {
            System.out.println("You already have object, use that existing object");
            return obj;
        }
    }
}
