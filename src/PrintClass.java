import java.util.ArrayList;
import java.util.Scanner;

public class PrintClass {

	TicketInfo orderData = null;
	ArrayList<TicketInfo> ticketList = null;

	public void PrintOut(TicketInfo orderData, ArrayList<TicketInfo> ticketList) {

		System.out.printf("Stop ticketing. Thank you\n");
		System.out.printf("===================== LOTTE WORLD =====================\n");
		for (int index = 0; index < ticketList.size(); index++) {

			if (ticketList.get(index).getTicketType() == 1) {
				System.out.printf("All\t");
			} else if (ticketList.get(index).getTicketType() == 2) {
				System.out.printf("Park\t");
			}
			if (ticketList.get(index).getTicketTime() == 1) {
				System.out.printf("1Day\t");
			} else if (ticketList.get(index).getTicketTime() == 2) {
				System.out.printf("After4\t");
			}

			if (ticketList.get(index).getManAge() < 3) {
				System.out.printf("Baby\t");
			} else if (ticketList.get(index).getManAge() >= 3 && ticketList.get(index).getManAge() < 12) {
				System.out.printf("Child\t");
			} else if (ticketList.get(index).getManAge() >= 12 && ticketList.get(index).getManAge() < 18) {
				System.out.printf("Youth\t");
			} else if (ticketList.get(index).getManAge() >= 18 && ticketList.get(index).getManAge() < 65) {
				System.out.printf("Adult\t");
			} else if (ticketList.get(index).getManAge() >= 65) {
				System.out.printf("Senior\t");
			}

			System.out.printf(" X\t%d\t", FinalValue.QTY);
			System.out.printf("%d\t", ticketList.get(index).getPriceSpecialOffer());

			if (ticketList.get(index).getSpecialOffer() == 1) {
				System.out.printf("None\n");
			} else if (ticketList.get(index).getSpecialOffer() == 2) {
				System.out.printf("Disabled\n");
			} else if (ticketList.get(index).getSpecialOffer() == 3) {
				System.out.printf("Veteran\n");
			} else if (ticketList.get(index).getSpecialOffer() == 4) {
				System.out.printf("Military\n");
			} else if (ticketList.get(index).getSpecialOffer() == 5) {
				System.out.printf("Pregnant\n");
			} else if (ticketList.get(index).getSpecialOffer() == 6) {
				System.out.printf("MultiChild\n");
			}

			orderData.setTotalPrice(orderData.getTotalPrice() + ticketList.get(index).getPriceSpecialOffer());
		}

		System.out.printf("The total price is %d\n", orderData.getTotalPrice());
		orderData.setTotalPrice(0);
		System.out.printf("=======================================================\n");
		System.out.printf("\n");

		Scanner scanner = new Scanner(System.in);
		System.out.printf("To continue or not(1.New Order, 2.Exit)\n");
		orderData.setNewOrExit(scanner.nextInt());

	}
}
