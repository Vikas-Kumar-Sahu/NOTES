package synchronization_IRCTC_bookTicket;

public class User2 extends Thread {
    IRCTC i;
	User2(){
		
	}
	User2(IRCTC i){
		this.i=i;	
	}
	public void run() {
		i.bookTicket(10);
	}
}
