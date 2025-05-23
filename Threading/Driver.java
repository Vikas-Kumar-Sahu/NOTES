import java.io.IOException;
import java.nio.CharBuffer;

public class Driver {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        Bus b3 = new Bus();
        Thread t1 = new Thread((Runnable) b1);
        Thread t2 = new Thread((Runnable) b2);
        Thread t3 = new Thread((Runnable) b3);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Vehicle {
    public void startVehicle() {
        System.out.println("Start the Vehicle");
    }
}

class Bus extends Vehicle implements Readable {

    public void run() {
        startVehicle();
        drive();
    }
     
    public void drive() {
        System.out.println("drive Strats");
        for (int i=0; i<=4; i++)
            System.out.println("Car completed "+i+" km");
        System.out.println("drive Ends");
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

}

