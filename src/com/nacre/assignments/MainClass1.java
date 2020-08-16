package com.nacre.assignments;
//tight coupling program
interface Vehicle {
	
	public void noOfTyres();
}
class Car1 implements Vehicle {
	public void noOfTyres() {
		System.out.println("car has 4 tyres");
	}
}

class Bike implements Vehicle {
	public void noOfTyres() {
		System.out.println("bike has 2 tyres");
	}
}

public class MainClass1 {
	//taking argument as class type object.This is called tight coupling
	public void showCarMessage(Car1 car) {
		car.noOfTyres();

	}
	public void showBikeMessage(Bike bike) {
		bike.noOfTyres();
	}

	public static void main(String[] args) {
		MainClass1 mc=new MainClass1();
		Car1 car=new Car1();
		/*here there is a tight relationship 
		 * between object to object. calling method by passing object.*/
		mc.showCarMessage(car);
		Bike bike=new Bike();
		mc.showBikeMessage(bike);

	}
		
	}

