import java.util.Scanner;

public class NewTicket {
	
	TicketInfo orderData = null;
	
	int ContinueOrNot(TicketInfo orderData) {	
		Scanner scanner = new Scanner(System.in);
		System.out.printf("To continue or not(1.New Order, 2.Exit)\n");
		orderData.setContinueOrNot(scanner.nextInt());
		return orderData.getContinueOrNot();
	}
		
	int NewOrExit(TicketInfo orderData) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("To continue or not(1.New Order, 2.Exit)\n");
		orderData.setNewOrExit(scanner.nextInt());
		return orderData.getNewOrExit();
	}
	
}
