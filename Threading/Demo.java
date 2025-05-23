public class Demo extends Thread {
    public void run() {
        drive();
    }

    public void drive() {
        System.out.println("start the vehicle");
    }
}

class MThread {
    public static void main(String[] args) {
        
        Demo d = new Demo();
        d.start();
        // for (int i=0; i<=5; i++){
        //     Demo D = new Demo();
        //     Thread t = new Thread(D);
        //     t.start();
        // }
        
    }
}