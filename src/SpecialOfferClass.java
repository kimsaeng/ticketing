import java.util.Scanner;

public class SpecialOfferClass {

	TicketInfo orderData = null;

	int SpecialOfferQuestion(TicketInfo orderData) {
		System.out.printf("Special Offer\n1.None\n2.Disabled\n3.Veteran\n4.Military\n5.Pregnant\n6.MultiChild\n");
		Scanner scanner = new Scanner(System.in);
		orderData.setSpecialOffer(scanner.nextInt());
		return orderData.getSpecialOffer();
	}

	int SpecialOffer(TicketInfo orderData) {
		if (orderData.getManAge() >= 65) {
			orderData.setSpecialOffer(1);
		}
		if (orderData.getSpecialOffer() == 1) {
			orderData.setPriceSpecialOffer(orderData.getPrice());
		} else if (orderData.getSpecialOffer() == 2) {
			orderData.setPriceSpecialOffer((int) (orderData.getPrice() * FinalValue.DISABLED_DC_RATE));
		} else if (orderData.getSpecialOffer() == 3) {
			orderData.setPriceSpecialOffer((int) (orderData.getPrice() * FinalValue.VETERAN_DC_RATE));
		} else if (orderData.getTicketType() == 1 && orderData.getSpecialOffer() == 4) {
			orderData.setPriceSpecialOffer((int) (orderData.getPrice() * FinalValue.MILITARY_DC_RATE));
		} else if (orderData.getTicketType() == 1 && orderData.getSpecialOffer() == 5) {
			orderData.setPriceSpecialOffer((int) (orderData.getPrice() * FinalValue.PREGNANT_DC_RATE));
		} else if (orderData.getTicketType() == 1 && orderData.getSpecialOffer() == 6) {
			orderData.setPriceSpecialOffer((int) (orderData.getPrice() * FinalValue.MULTICHILD_DC_RATE));
		}

		System.out.printf("The ticket price is : %d\n", orderData.getPriceSpecialOffer());
		System.out.printf("Thank you\n");
		return orderData.getPriceSpecialOffer();
	}
}
