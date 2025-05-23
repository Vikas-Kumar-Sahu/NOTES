package synchronization_IRCTC_bookTicket;

public class Driver {
    public static void main(String[] args) {
		IRCTC i=new IRCTC();
		
		User1 u1=new User1(i);
		User2 u2=new User2(i);
		User3 u3=new User3(i);
		
		u1.start();
		u2.start();
		u3.start();
		
	}
}
