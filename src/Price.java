import java.util.Scanner;

public class Price {

	Scanner scanner = new Scanner(System.in);
	OrderData data = null;

	int manAge(OrderData data) {
		System.out.printf("Input your social security number\n");
		String ManAgeStr = scanner.next();
		data.setAgeYear(Integer.parseInt(ManAgeStr.substring(0, 2)));

		if (data.getAgeYear() <= 22) {
			data.setAgeYear(data.getAgeYear() + 2000);
		} else {
			data.setAgeYear(data.getAgeYear() + 1900);
		}

		data.setBirthDay(Integer.parseInt(ManAgeStr.substring(2, 6)));
		data.setManAge(FinalVar.THIS_YEAR - data.getAgeYear());
		if (data.getBirthDay() >= FinalVar.TODAY) {
			data.setManAge(data.getManAge());
		} else {
			data.setManAge(data.getManAge() - 1);
		}
		return data.getManAge();
	}

	int priceFormula(OrderData data) {
		if (data.getManAge() < 1) {
			data.setPrice(FinalVar.FREE_OF_CHARGE);
		} else if (data.getManAge() >= 1 && data.getManAge() < 3) {
			System.out.printf("baby rides? 1.yes 2.no\n");
			data.setRidesOrNot(scanner.nextInt());
			if (data.getRidesOrNot() == 1) {
				data.setPrice(FinalVar.BABY);
			} else if (data.getRidesOrNot() == 2) {
				data.setPrice(FinalVar.FREE_OF_CHARGE);
			}
		} else if (data.getTicketType() == 1 && data.getTicketTime() == 1 && data.getManAge() >= 3
				&& data.getManAge() < 12) {
			data.setPrice(FinalVar.ALL_CHILD_1DAY);
		} else if (data.getTicketType() == 1 && data.getTicketTime() == 1 && data.getManAge() >= 12
				&& data.getManAge() < 18) {
			data.setPrice(FinalVar.ALL_YOUTH_1DAY);
		} else if (data.getTicketType() == 1 && data.getTicketTime() == 1 && data.getManAge() >= 18
				&& data.getManAge() < 65) {
			data.setPrice(FinalVar.ALL_ADULT_1DAY);
		} else if (data.getTicketType() == 1 && data.getTicketTime() == 1 && data.getManAge() >= 65) {
			data.setPrice(FinalVar.ALL_CHILD_1DAY);

		} else if (data.getTicketType() == 1 && data.getTicketTime() == 2 && data.getManAge() >= 3
				&& data.getManAge() < 12) {
			data.setPrice(FinalVar.ALL_CHILD_AFTER4);
		} else if (data.getTicketType() == 1 && data.getTicketTime() == 2 && data.getManAge() >= 12
				&& data.getManAge() < 18) {
			data.setPrice(FinalVar.ALL_YOUTH_AFTER4);
		} else if (data.getTicketType() == 1 && data.getTicketTime() == 2 && data.getManAge() >= 18
				&& data.getManAge() < 65) {
			data.setPrice(FinalVar.ALL_ADULT_AFTER4);
		} else if (data.getTicketType() == 1 && data.getTicketTime() == 2 && data.getManAge() >= 65) {
			data.setPrice(FinalVar.ALL_CHILD_AFTER4);

		} else if (data.getTicketType() == 2 && data.getTicketTime() == 1 && data.getManAge() >= 3
				&& data.getManAge() < 12) {
			data.setPrice(FinalVar.PARK_CHILD_1DAY);
		} else if (data.getTicketType() == 2 && data.getTicketTime() == 1 && data.getManAge() >= 12
				&& data.getManAge() < 18) {
			data.setPrice(FinalVar.PARK_YOUTH_1DAY);
		} else if (data.getTicketType() == 2 && data.getTicketTime() == 1 && data.getManAge() >= 18
				&& data.getManAge() < 65) {
			data.setPrice(FinalVar.PARK_ADULT_1DAY);
		} else if (data.getTicketType() == 2 && data.getTicketTime() == 1 && data.getManAge() >= 65) {
			data.setPrice(FinalVar.PARK_CHILD_1DAY);

		} else if (data.getTicketType() == 2 && data.getTicketTime() == 2 && data.getManAge() >= 3
				&& data.getManAge() < 12) {
			data.setPrice(FinalVar.PARK_CHILD_AFTER4);
		} else if (data.getTicketType() == 2 && data.getTicketTime() == 2 && data.getManAge() >= 12
				&& data.getManAge() < 18) {
			data.setPrice(FinalVar.PARK_YOUTH_AFTER4);
		} else if (data.getTicketType() == 2 && data.getTicketTime() == 2 && data.getManAge() >= 18
				&& data.getManAge() < 65) {
			data.setPrice(FinalVar.PARK_ADULT_AFTER4);
		} else if (data.getTicketType() == 2 && data.getTicketTime() == 2 && data.getManAge() >= 65) {
			data.setPrice(FinalVar.PARK_CHILD_AFTER4);
		}
		return data.getPrice();
	}

	int qty(OrderData data) {
		System.out.printf("How many tickets?(Max 10)\n");
		data.setQty(scanner.nextInt());
		return data.getQty();
	}
}
