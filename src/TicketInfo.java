
public class TicketInfo {
	//ArrayList
	private int ticketType;
	private int ticketTime;
	private int manAge;
	private int priceSpecialOffer;
	private int specialOffer;	
	//variables declaration
	private int price; 
	private int totalPrice;
	private int repCount;
	private int newOrExit;
	private int continueOrNot;
	private int ridesOrNot;
	private int ageYear;
	private int birthDay;
	
	//getter and setter
	public int getTicketType() {
		return ticketType;
	}
	public void setTicketType(int ticketType) {
		if(ticketType < 1 || ticketType > 2) {
			return;
		}
		this.ticketType = ticketType;
	}
	public int getTicketTime() {
		return ticketTime;
	}
	public void setTicketTime(int ticketTime) {
		if(ticketTime < 1 || ticketTime > 2) {
			return;
		}
		this.ticketTime = ticketTime;
	}
	public int getManAge() {
		return manAge;
	}
	public void setManAge(int manAge) {
		this.manAge = manAge;
	}
	public int getPriceSpecialOffer() {
		return priceSpecialOffer;
	}
	public void setPriceSpecialOffer(int priceSpecialOffer) {
		this.priceSpecialOffer = priceSpecialOffer;
	}
	public int getSpecialOffer() {
		return specialOffer;
	}
	public void setSpecialOffer(int specialOffer) {
		if(ticketTime < 1 || ticketTime > 6) {
			return;
		}
		this.specialOffer = specialOffer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getRepCount() {
		return repCount;
	}
	public void setRepCount(int repCount) {
		this.repCount = repCount;
	}
	public int getNewOrExit() {
		return newOrExit;
	}
	public void setNewOrExit(int newOrExit) {
		if(newOrExit < 1 || newOrExit > 2) {
			return;
		}
		this.newOrExit = newOrExit;
	}
	public int getContinueOrNot() {
		return continueOrNot;
	}
	public void setContinueOrNot(int continueOrNot) {
		if(continueOrNot < 1 || continueOrNot > 2) {
			return;
		}
		this.continueOrNot = continueOrNot;
	}
	public int getRidesOrNot() {
		return ridesOrNot;
	}
	public void setRidesOrNot(int ridesOrNot) {
		if(ridesOrNot < 1 || ridesOrNot > 2) {
			return;
		}
		this.ridesOrNot = ridesOrNot;
	}
	public int getAgeYear() {
		return ageYear;
	}
	public void setAgeYear(int ageYear) {
		this.ageYear = ageYear;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	
}
