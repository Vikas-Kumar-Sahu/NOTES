public class GetIdExp extends Thread {

    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        GetIdExp g1 = new GetIdExp();
        System.out.println("id of t1 : "+g1.getId());
        System.out.println("Name of t1 : "+g1.getName());
        g1.start();
        g1.setName("First Thread");
        System.out.println("Name of t1 : "+g1.getName());
    }
}
