package Try_Catch;
import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) throws Throwable {
        Vehicle v = new Vehicle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        try {
            int age = sc.nextInt();
            v.age = age;
            if (age > 100){
                throw new MyException("Aged");
            }
            System.out.println("Your Age : "+v.age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.gc();
            v.finalize();
        }
    }
}

class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}

class Vehicle {
    int age;
    Vehicle() {

    }
    Vehicle(int age) {
        this.age = age;
    }

    protected void finalize() throws Throwable {
        try {
            System.out.println("Inside finalize method of Demo Class.");
        } 
        catch (Throwable e) {
            throw e;
        } 
        finally {
            System.out.println("Calling finalize method of the Object class");
    
        // Calling finalize() of Object class
            super.finalize();
        }
      }
}
