import java.util.Scanner;

public class TicketTypeClass {
	
	TicketInfo orderData = null;
	int TicketType(TicketInfo orderData) {
		System.out.printf("Select Type of Tickets\n1.All\n2.Park\n");
		Scanner scanner = new Scanner(System.in);
		orderData.setTicketType(scanner.nextInt()); 
	    return orderData.getTicketType();
	   }

	int TicketTime(TicketInfo orderData) {
		System.out.printf("Select Time of Tickets\n1.Day\n2.After4\n");
		Scanner scanner = new Scanner(System.in);
		orderData.setTicketTime(scanner.nextInt());
		return orderData.getTicketTime();
	}
}
