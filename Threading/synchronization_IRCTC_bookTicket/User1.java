package synchronization_IRCTC_bookTicket;

public class User1 extends Thread {
    IRCTC i;
	User1(){
		
	}
	User1(IRCTC i){
		this.i=i;	
	}
	public void run() {
		
		i.bookTicket(2);
	}
}
