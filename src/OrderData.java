
public class OrderData {
	// ArrayList variables
	private int ticketType;
	private int ticketTime;
	private int manAge;
	private int priceSpecialOffer;
	private int specialOffer;
	// variables declaration
	private int price;
	private int totalPrice;
	private int repCount;
	private int newOrExit;
	private int buyOrNot;
	private int ridesOrNot;
	private int ageYear;
	private int birthDay;
	private int qty;
	private int ticketPrice;

	// getter and setter
	public int getTicketType() {
		return ticketType;
	}

	public void setTicketType(int ticketType) {
		if (ticketType < 1 || ticketType > 2) {
			return;
		}
		this.ticketType = ticketType;
	}

	public String ticketTypeToString() {
		if (ticketType == 1) {
			return "All";
		} else if (ticketType == 2) {
			return "PARK";
		}
		return null;
	}

	public int getTicketTime() {
		return ticketTime;
	}

	public void setTicketTime(int ticketTime) {
		if (ticketTime < 1 || ticketTime > 2) {
			return;
		}
		this.ticketTime = ticketTime;
	}

	public String ticketTimeToString() {
		if (ticketTime == 1) {
			return "1Day";
		} else if (ticketTime == 2) {
			return "AFTER4";
		}
		return null;
	}

	public int getManAge() {
		return manAge;
	}

	public void setManAge(int manAge) {
		this.manAge = manAge;
	}

	public String manAgeToString() {
		if (manAge < 3) {
			return "BABY";
		} else if (manAge < 12) {
			return "CHILD";
		} else if (manAge < 18) {
			return "YOUTH";
		} else if (manAge < 65) {
			return "ADULT";
		} else if (manAge >= 65) {
			return "SENIOR";
		}
		return null;
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
		if (ticketTime < 1 || ticketTime > 6) {
			return;
		}
		this.specialOffer = specialOffer;
	}

	public String specialOfferToString() {
		if (specialOffer == 1) {
			return "NONE";
		} else if (specialOffer == 2) {
			return "DIABLED";
		} else if (specialOffer == 3) {
			return "VETERAN";
		} else if (specialOffer == 4) {
			return "MILITARY";
		} else if (specialOffer == 5) {
			return "PREGNANT";
		} else if (specialOffer == 6) {
			return "MULTICHILD";
		}
		return null;
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
		if (newOrExit < 1 || newOrExit > 2) {
			return;
		}
		this.newOrExit = newOrExit;
	}

	public int getRidesOrNot() {
		return ridesOrNot;
	}

	public void setRidesOrNot(int ridesOrNot) {
		if (ridesOrNot < 1 || ridesOrNot > 2) {
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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if (qty < 0 || qty > 10) {
			return;
		}
		this.qty = qty;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getBuyOrNot() {
		return buyOrNot;
	}

	public void setBuyOrNot(int buyOrNot) {
		if (buyOrNot < 1 || buyOrNot > 2) {
			return;
		}
		this.buyOrNot = buyOrNot;
	}

}
