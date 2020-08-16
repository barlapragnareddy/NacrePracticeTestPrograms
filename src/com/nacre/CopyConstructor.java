package com.nacre;

//copy constructor example
class Animal {
	String name;
	String color;

//parameterised constructor
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}

	/* constructor which initialize values with previous object properties 
	   by taking class reference variable type */
	public Animal(Animal d) {
		this.name = d.name;
		this.color = d.color;
	}

	public void display() {
		System.out.println("animal name=" + name + " , " + "animal color=" + color);
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		Animal dog = new Animal("Dog", "black");
		dog.display();
		// passing class reference variable to new object.
		Animal puppy = new Animal(dog);
		puppy.display();
		Animal deer = new Animal("deer", "Brown");
		//assigning class reference to new object
		Animal raindeer=deer;
		raindeer.display();
	}

}
