//creating class with initializing properties during declaration 
package com.nacre;

class Product {
	//declaring variables at declaration
	String productName = "LG Fridge";
	int productPrice = 15000;

	public void display() {
		System.out.println("Name of product: " + productName);
		System.out.println("price of product: " + productPrice);
	}

	public static void main(String[] args) {
		Product fridge = new Product();
		fridge.display();
		Product ac = new Product();
		ac.display();

	}

}
