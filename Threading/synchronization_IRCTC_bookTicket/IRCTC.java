package synchronization_IRCTC_bookTicket;

public class IRCTC {
    static int no_of_seats=20;
	
	public synchronized void bookTicket(int user_seat) {
		System.out.println("Ticket Booking Starts");
		if(no_of_seats>=user_seat) {
			for(int i=1;i<=10;i++) {
				System.out.println("Ticket Booking time passed: "+i+"seconds");
			}
			no_of_seats--;
		System.out.println("Ticket is Booked Successfully");
		}
		else {
			System.out.println("Ticket is NOT Booked Successfully");
		}
		
	}
}
