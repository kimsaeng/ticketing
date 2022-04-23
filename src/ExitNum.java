import java.util.Scanner;

public class ExitNum {
	Scanner scanner = new Scanner(System.in);
	OrderData data = null;
	
	int BuyOrExit(OrderData data) {
		System.out.printf("To Buy More or Exit (1.Buy, 2.Exit)\n");
		data.setBuyOrNot(scanner.nextInt());
		return data.getBuyOrNot();
	}
		
	int NewOrExit(OrderData data) {
		System.out.printf("New Order or Exit (1.New Order, 2.Exit)\n");
		data.setNewOrExit(scanner.nextInt());
		return data.getNewOrExit();
	}
	
}
