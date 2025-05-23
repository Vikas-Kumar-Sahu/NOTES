public class YieldExp extends Thread {
    public void run() {
        for (int i=0; i<3 ; i++)
            System.out.println(Thread.currentThread().getName() + " in control");
    }
    public static void main(String[] args) {
        YieldExp y1 = new YieldExp();
        YieldExp y2 = new YieldExp();
        y1.start();
        y2.start();
        try {
            for (int i=0; i<3 ; i++) {
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + " in control");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
