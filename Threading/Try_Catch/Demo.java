package Try_Catch;

public class Demo {
    
    static void fun() {
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("Fun Exception "+e);
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (Exception e) {
            System.out.println("Exception Catch "+e);
        }
    }
}
