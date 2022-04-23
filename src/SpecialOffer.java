import java.util.Scanner;

public class SpecialOffer {
	Scanner scanner = new Scanner(System.in);
	OrderData data = null;

	int specialOfferNum(OrderData data) {
		System.out.printf(
				"Select your Special Offer\n1.None\n2.Disabled\n3.Veteran\n4.Military\n5.Pregnant\n6.MultiChild\n");
		data.setSpecialOffer(scanner.nextInt());
		return data.getSpecialOffer();
	}

	int discountRate(OrderData data) {
		if (data.getManAge() >= 65) {
			data.setSpecialOffer(1);
		}
		if (data.getSpecialOffer() == 1) {
			data.setPriceSpecialOffer(data.getPrice());
		} else if (data.getSpecialOffer() == 2) {
			data.setPriceSpecialOffer((int) (data.getPrice() * FinalVar.DISABLED_DC_RATE));
		} else if (data.getSpecialOffer() == 3) {
			data.setPriceSpecialOffer((int) (data.getPrice() * FinalVar.VETERAN_DC_RATE));
		} else if (data.getTicketType() == 1 && data.getSpecialOffer() == 4) {
			data.setPriceSpecialOffer((int) (data.getPrice() * FinalVar.MILITARY_DC_RATE));
		} else if (data.getTicketType() == 1 && data.getSpecialOffer() == 5) {
			data.setPriceSpecialOffer((int) (data.getPrice() * FinalVar.PREGNANT_DC_RATE));
		} else if (data.getTicketType() == 1 && data.getSpecialOffer() == 6) {
			data.setPriceSpecialOffer((int) (data.getPrice() * FinalVar.MULTICHILD_DC_RATE));
		}
		
		data.setTicketPrice(data.getPriceSpecialOffer()*data.getQty());
		System.out.printf("The ticket price is : %d\n", data.getTicketPrice());
		System.out.printf("Thank you\n");
		return data.getTicketPrice();
	}


}
	
