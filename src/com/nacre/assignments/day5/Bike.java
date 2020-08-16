package com.nacre.assignments.day5;

//2>abstraction example 

abstract class Vehicle {
	// abstract method
	public abstract void run();
}

public class Bike extends Vehicle {
//overriding abstract method
	@Override
	public void run() {
		System.out.println("Bike runs on road and has 2 tyres");
	}

	public static void main(String[] args) {
		// creating bike object with abstract class reference
		Vehicle vehicle = new Bike();
		vehicle.run();

	}

}
