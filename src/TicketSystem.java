import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketSystem {


	void startSystem() throws IOException {

		TicketInfo orderData = new TicketInfo();
		ArrayList<TicketInfo> ticketList = new ArrayList<TicketInfo>();

		do {
			do {

				TicketTypeClass type = new TicketTypeClass();
				type.TicketType(orderData);
				type.TicketTime(orderData);

				Calculation cal = new Calculation();
				cal.ManAge(orderData);
				cal.TicketPrice(orderData);
				cal.TicketQTY();

				SpecialOfferClass special = new SpecialOfferClass();
				special.SpecialOfferQuestion(orderData);
				special.SpecialOffer(orderData);
				ticketList.add(orderData);

				NewTicket ticket = new NewTicket();
				ticket.ContinueOrNot(orderData);

			} while (orderData.getContinueOrNot() != 2);

			PrintClass print = new PrintClass();
			print.PrintOut(orderData, ticketList);

		} while (orderData.getNewOrExit() != 2);

		
		
		// FileWriter
		FileWriter fw = new FileWriter("C:\\Users\\kakao\\Desktop\\test.txt", true);

		String data = "Type, Time, AgeType, Price, SpecialOffer\n";
		fw.write(data);

		for (int index = 0; index < ticketList.size(); index++) {

			if (ticketList.get(index).getTicketType() == 1) {
				fw.write("All,\t");
			} else if (ticketList.get(index).getTicketType() == 2) {
				fw.write("Park,\t");
			}
			if (ticketList.get(index).getTicketTime() == 1) {
				fw.write("1Day,\t");
			} else if (ticketList.get(index).getTicketTime() == 2) {
				fw.write("After4,\t");
			}

			if (ticketList.get(index).getManAge() < 3) {
				fw.write("Baby,\t");
			} else if (ticketList.get(index).getManAge() >= 3 && ticketList.get(index).getManAge() < 12) {
				fw.write("Child,\t");
			} else if (ticketList.get(index).getManAge() >= 12 && ticketList.get(index).getManAge() < 18) {
				fw.write("Youth,\t");
			} else if (ticketList.get(index).getManAge() >= 18 && ticketList.get(index).getManAge() < 65) {
				fw.write("Adult,\t");
			} else if (ticketList.get(index).getManAge() >= 65) {
				fw.write("Senior,\t");
			}

			fw.write(ticketList.get(index).getPriceSpecialOffer() + ",");

			if (ticketList.get(index).getSpecialOffer() == 1) {
				fw.write("None\n");
			} else if (ticketList.get(index).getSpecialOffer() == 2) {
				fw.write("Disabled\n");
			} else if (ticketList.get(index).getSpecialOffer() == 3) {
				fw.write("Veteran\n");
			} else if (ticketList.get(index).getSpecialOffer() == 4) {
				fw.write("Military\n");
			} else if (ticketList.get(index).getSpecialOffer() == 5) {
				fw.write("Pregnant\n");
			} else if (ticketList.get(index).getSpecialOffer() == 6) {
				fw.write("MultiChild\n");
			}

		}

		fw.close();

	
		// BufferedReader
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kakao\\Desktop\\test.txt"));
		String line;
		while((line=reader.readLine())!=null)
		{
			System.out.println(line);
		}
	}

}