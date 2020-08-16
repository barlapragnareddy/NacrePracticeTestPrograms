package com.nacre;

//creating class by initializing properties after object creation
class ProductViaObject {
	String productName;
	int productPrice;

	public void display() {
		System.out.println("Product name: " + productName);
		System.out.println("Product price: " + productPrice);
	}
}
//class for execution purpose
public class ProductReference {

	public static void main(String[] args) {
		ProductViaObject tv = new ProductViaObject();
		//initializing values after object creation 
		tv.productName = "Samsung TV";
		tv.productPrice = 10000;
		tv.display();
		ProductViaObject mobile = new ProductViaObject();
		mobile.productName = "Redmi mobile";
		mobile.productPrice = 15000;
		mobile.display();

	}

}
