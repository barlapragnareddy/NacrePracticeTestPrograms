package com.nacre.assignments;

/*2>‘Square’ and ‘Rectangle’ class having area & 
perimeter methods and displaying the values from that methods.*/
class Square {

	public void areaCalculation(int side) {
		System.out.println("Area of a square=" + side * side);
	}

}

class Rectangle {

	public void perimeterRectangle(int length, int breadth) {
		int c = 2 * (length + breadth);
		System.out.println("perimeter of a rectangle=" + c);
	}

}

public class MainClass {

	public static void main(String[] args) {
		Square obj1 = new Square();
		obj1.areaCalculation(4);
		Square obj2 = new Square();
		obj2.areaCalculation(7);
		Rectangle rect1 = new Rectangle();
		rect1.perimeterRectangle(2, 4);
		Rectangle rect2 = new Rectangle();
		rect2.perimeterRectangle(5, 2);

	}

}
