package Mthread;

public class Bus extends main implements Runnable {

    @Override
    public void run() {
        star();
        drive();
    }

    public void drive() {
        System.out.println("Drive Start");
        for (int i=0; i<=3; i++) 
            System.out.println("Bus completed "+i+" km");
        System.out.println("Drive Ends");
    }
    
}
