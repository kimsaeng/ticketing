import java.io.IOException;
import java.util.ArrayList;

public class StartSystem {

	void startSystem() throws IOException {

		OrderData data = null;
		ArrayList<OrderData> list;

		do {
			list = new ArrayList<OrderData>();
			ExitNum exit = new ExitNum();
			do {
				data = new OrderData();
				TicketType ticket = new TicketType();
				Price price = new Price();
				SpecialOffer special = new SpecialOffer();

				ticket.type(data);
				ticket.time(data);

				price.manAge(data);
				price.priceFormula(data);
				price.qty(data);

				special.specialOfferNum(data);
				special.discountRate(data);

				list.add(data);

				exit.BuyOrExit(data);
			} while (data.getBuyOrNot() != 2);

			Print pnt = new Print();
			pnt.PrintOut(data, list);
			exit.NewOrExit(data);
		} while (data.getNewOrExit() != 2);
	}
}
