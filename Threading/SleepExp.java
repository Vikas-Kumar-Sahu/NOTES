public class SleepExp extends Thread {
    public void run() {
        for (int i=1; i<5; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepExp t1 = new SleepExp();
        SleepExp t2 = new SleepExp();
        t1.start();
        t2.start();
    }
}
