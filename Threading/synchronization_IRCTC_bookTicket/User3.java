package synchronization_IRCTC_bookTicket;

public class User3 extends Thread {
    IRCTC i;
	User3(){
		
	}
	User3(IRCTC i){
		this.i=i;	
	}
	public void run() {
		i.bookTicket(4);
	}

}
