package Try_Catch;

public class Dummy {

    // public static void main(String[] args) throws InterruptedException {
    //     Thread.sleep(500);
    //     System.out.println("Hello Buddy");
    // }

    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("Caught in main.");
        }
    }
}
