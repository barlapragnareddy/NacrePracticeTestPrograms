package com.nacre;

class MobilePhones {
	String brand;
	String modelName;
	int modelId;

//no arg constructor containing same property for all objects 
	public MobilePhones() {
		brand = "Redmi";
	}

//parameterised constructor containing different properties for all objects
	public MobilePhones(String modelName, int modelId) {
		this();
		this.modelName = modelName;
		this.modelId = modelId;
	}

	public void display() {
		System.out.println("brand name=" + brand);
		System.out.println("model name=" + modelName);
		System.out.println("model id=" + modelId);
	}

}

public class Mobile {
	public static void main(String[] args) {
		// intializing values by calling constructor
		MobilePhones redmi1 = new MobilePhones("pro 8", 3056);
		redmi1.display();
		MobilePhones redmi2 = new MobilePhones("note 10", 1003);
		redmi2.display();

	}

}
