package Mthread;

public class Drive {
    public static void main(String[] args) {
        
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        Bus b3 = new Bus();

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);
        Thread t3 = new Thread(b3);

        t1.start();
        t2.start();
        t3.start();
    }
}
