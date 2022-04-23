import java.util.Scanner;

public class TicketType {

	OrderData data = null;
	Scanner scanner = new Scanner(System.in);

	int type(OrderData data) {
		System.out.printf("Select Type of Tickets\n1.All\n2.Park\n");
		data.setTicketType(scanner.nextInt());
		return data.getTicketType();
	}

	int time(OrderData data) {
		System.out.printf("Select Time of Tickets\n1.Day\n2.After4\n");
		data.setTicketTime(scanner.nextInt());
		return data.getTicketTime();
	}
}
