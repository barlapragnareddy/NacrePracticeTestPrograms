package com.nacre;

class Customer {
	private String customerName;
	private int creditPoints;

	public Customer(String customerName, int creditPoints) {
		super();
		this.customerName = customerName;
		this.creditPoints = creditPoints;
	}

	public int getCreditPoints() {
		return creditPoints;
	}

	@Override
	public String toString() {
		return customerName;
	}

}

class CardType {
	private Customer customer;
	private String cardType;

	public CardType(Customer customer, String cardType) {
		super();
		this.customer = customer;
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "The customer " + customer + " is eligible for " + cardType + " card";
	}

}

class CardsOnOffer {

	public static CardType getOfferedCard(Customer customer) {
		if (customer.getCreditPoints() >= 100 && customer.getCreditPoints() <= 500)
			return new CardType(customer, "Silver");
		else if (customer.getCreditPoints() >= 501 && customer.getCreditPoints() <= 1000)
			return new CardType(customer, "Gold");
		else if (customer.getCreditPoints() >= 1001)
			return new CardType(customer, "Platinum");
		else
			return new CardType(customer, "EMI");

	}

}

public class MainClass {

	public static void main(String[] args) {
		Customer rajiv = new Customer("Rajiv", 700);
		CardType card1 = CardsOnOffer.getOfferedCard(rajiv);
		System.out.println(card1);
		Customer pragna = new Customer("Pragna", 60);
		CardType card2 = CardsOnOffer.getOfferedCard(pragna);
		System.out.println(card2);
		
	}

}
