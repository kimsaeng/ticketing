import java.util.ArrayList;

public class Print {

	public void PrintOut(OrderData data, ArrayList<OrderData> list) {

		System.out.printf("Stop Ticketing. Thank You!\n");
		System.out.printf("===================== LOTTE WORLD =====================\n");

		for (int index = 0; index < list.size(); index++) {
			System.out.printf("%s\t", list.get(index).ticketTypeToString());
			System.out.printf("%s\t", list.get(index).ticketTimeToString());
			System.out.printf("%s\t", list.get(index).manAgeToString());
			System.out.printf(" X\t%d\t", list.get(index).getQty());
			System.out.printf("%d\t", list.get(index).getTicketPrice());
			System.out.printf("%s\n", list.get(index).specialOfferToString());

			data.setTotalPrice(data.getTotalPrice() + list.get(index).getPriceSpecialOffer());
		}

		System.out.printf("The total price is %d\n", data.getTotalPrice());
		data.setTotalPrice(0);
		System.out.printf("=======================================================\n");
		System.out.printf("\n");
	}
}
