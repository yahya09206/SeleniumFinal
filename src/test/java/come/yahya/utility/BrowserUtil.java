package come.yahya.utility;

public class BrowserUtil {

    // try catch for timing
    public static void waitFor(int seconds){

        // Multiply by 1000 to get seconds
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            // print out error
            e.printStackTrace();
        }
    }
}
