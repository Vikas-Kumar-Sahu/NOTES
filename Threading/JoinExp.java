public class JoinExp extends Thread {
    public void run() {
        for (int i=1; i<4; i++)
            System.out.println("running thread "+i);
    }
    public static void main(String[] args) throws InterruptedException {
        JoinExp t1 = new JoinExp();
        JoinExp t2 = new JoinExp();
        JoinExp t3 = new JoinExp();

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
