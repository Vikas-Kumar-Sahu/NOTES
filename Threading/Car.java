public class Car extends Thread {

    public void run() {
        drive();
    }

    public void drive() {
        System.out.println("drive Strats");
        for (int i=0; i<=4; i++)
            System.out.println("Car completed "+i+" km");
    }
}

class Driver {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.start();
        c2.start();
    }
}