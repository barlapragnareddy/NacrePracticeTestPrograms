package com.nacre.assignments;
/*3>Initializing at object creation and also by setters method 
and getting model name from getters*/
public class Car {
	int noOfWheels;
	String modelName;

	public Car(int noOfWheels) {
		super();
		this.noOfWheels = noOfWheels;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public static void main(String[] args) {
		Car c1 = new Car(4);
		c1.setModelName("Maruti");
		System.out.println(c1.getModelName());
	}

}
