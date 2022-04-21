import java.util.Scanner;

public class Calculation {
	
	TicketInfo orderData = null;
	
	int ManAge(TicketInfo orderData) {	
		System.out.printf("Input your social security number\n");
			Scanner scanner = new Scanner(System.in);
			String ManAgeStr = scanner.next();
			orderData.setAgeYear(Integer.parseInt(ManAgeStr.substring(0, 2)));

			if (orderData.getAgeYear() <= 22) {
				orderData.setAgeYear(orderData.getAgeYear() + 2000);
			} else {
				orderData.setAgeYear(orderData.getAgeYear() + 1900);
			}

			orderData.setBirthDay(Integer.parseInt(ManAgeStr.substring(2, 6)));
			orderData.setManAge(FinalValue.THIS_YEAR - orderData.getAgeYear());
			if (orderData.getBirthDay() >= FinalValue.TODAY) {
				orderData.setManAge(orderData.getManAge());
			} else {
				orderData.setManAge(orderData.getManAge() - 1);
			}
		return orderData.getManAge();
	}

	int TicketPrice(TicketInfo orderData) { 
		if (orderData.getManAge() < 1) {
			orderData.setPrice(FinalValue.FREE_OF_CHARGE);
		} else if (orderData.getManAge() >= 1 && orderData.getManAge() < 3) {
			System.out.printf("baby rides? 1.yes 2.no\n");
		    Scanner scanner = new Scanner(System.in);
			orderData.setRidesOrNot(scanner.nextInt());
			if (orderData.getRidesOrNot() == 1) {
				orderData.setPrice(FinalValue.BABY);
			} else if (orderData.getRidesOrNot() == 2) {
				orderData.setPrice(FinalValue.FREE_OF_CHARGE);
			}
		} else if (orderData.getTicketType() == 1 && orderData.getTicketTime() == 1 && orderData.getManAge() >= 3
				&& orderData.getManAge() < 12) {
			orderData.setPrice(FinalValue.ALL_CHILD_1DAY);
		} else if (orderData.getTicketType() == 1 && orderData.getTicketTime() == 1 && orderData.getManAge() >= 12
				&& orderData.getManAge() < 18) {
			orderData.setPrice(FinalValue.ALL_YOUTH_1DAY);
		} else if (orderData.getTicketType() == 1 && orderData.getTicketTime() == 1 && orderData.getManAge() >= 18
				&& orderData.getManAge() < 65) {
			orderData.setPrice(FinalValue.ALL_ADULT_1DAY);
		} else if (orderData.getTicketType() == 1 && orderData.getTicketTime() == 1 && orderData.getManAge() >= 65) {
			orderData.setPrice(FinalValue.ALL_CHILD_1DAY);

		} else if (orderData.getTicketType() == 1 && orderData.getTicketTime() == 2 && orderData.getManAge() >= 3
				&& orderData.getManAge() < 12) {
			orderData.setPrice(FinalValue.ALL_CHILD_AFTER4);
		} else if (orderData.getTicketType() == 1 && orderData.getTicketTime() == 2 && orderData.getManAge() >= 12
				&& orderData.getManAge() < 18) {
			orderData.setPrice(FinalValue.ALL_YOUTH_AFTER4);
		} else if (orderData.getTicketType() == 1 && orderData.getTicketTime() == 2 && orderData.getManAge() >= 18
				&& orderData.getManAge() < 65) {
			orderData.setPrice(FinalValue.ALL_ADULT_AFTER4);
		} else if (orderData.getTicketType() == 1 && orderData.getTicketTime() == 2 && orderData.getManAge() >= 65) {
			orderData.setPrice(FinalValue.ALL_CHILD_AFTER4);

		} else if (orderData.getTicketType() == 2 && orderData.getTicketTime() == 1 && orderData.getManAge() >= 3
				&& orderData.getManAge() < 12) {
			orderData.setPrice(FinalValue.PARK_CHILD_1DAY);
		} else if (orderData.getTicketType() == 2 && orderData.getTicketTime() == 1 && orderData.getManAge() >= 12
				&& orderData.getManAge() < 18) {
			orderData.setPrice(FinalValue.PARK_YOUTH_1DAY);
		} else if (orderData.getTicketType() == 2 && orderData.getTicketTime() == 1 && orderData.getManAge() >= 18
				&& orderData.getManAge() < 65) {
			orderData.setPrice(FinalValue.PARK_ADULT_1DAY);
		} else if (orderData.getTicketType() == 2 && orderData.getTicketTime() == 1 && orderData.getManAge() >= 65) {
			orderData.setPrice(FinalValue.PARK_CHILD_1DAY);

		} else if (orderData.getTicketType() == 2 && orderData.getTicketTime() == 2 && orderData.getManAge() >= 3
				&& orderData.getManAge() < 12) {
			orderData.setPrice(FinalValue.PARK_CHILD_AFTER4);
		} else if (orderData.getTicketType() == 2 && orderData.getTicketTime() == 2 && orderData.getManAge() >= 12
				&& orderData.getManAge() < 18) {
			orderData.setPrice(FinalValue.PARK_YOUTH_AFTER4);
		} else if (orderData.getTicketType() == 2 && orderData.getTicketTime() == 2 && orderData.getManAge() >= 18
				&& orderData.getManAge() < 65) {
			orderData.setPrice(FinalValue.PARK_ADULT_AFTER4);
		} else if (orderData.getTicketType() == 2 && orderData.getTicketTime() == 2 && orderData.getManAge() >= 65) {
			orderData.setPrice(FinalValue.PARK_CHILD_AFTER4);
		}
		return orderData.getPrice();
	}

	void TicketQTY() { // Tickets QTY(fixed)
		System.out.printf("How many tickets? (max 10)\n");
		System.out.printf("1\n");
	}
}
