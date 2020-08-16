package com.nacre.assignments;

//Loose coupling example
interface VehicleCategory {

	public void noOfTyres();
}

class CarVehicle implements VehicleCategory {
	public void noOfTyres() {
		System.out.println("car has 4 tyres");
	}
}

class BikeVehicle implements VehicleCategory {
	public void noOfTyres() {
		System.out.println("bike has 2 tyres");
	}
}

public class MainClassLooseCoupling {
	// taking argument as interface type reference.This is called loose coupling
	public void showMessage(VehicleCategory v) {
		v.noOfTyres();

	}

	public static void main(String[] args) {
		MainClassLooseCoupling mc2 = new MainClassLooseCoupling();
		CarVehicle car2 = new CarVehicle();
		/*
		 * here there is a loose relationship between object to reference. calling
		 * method by passing object.
		 */
		mc2.showMessage(car2);
		BikeVehicle bike2 = new BikeVehicle();
		mc2.showMessage(bike2);
	}

}
