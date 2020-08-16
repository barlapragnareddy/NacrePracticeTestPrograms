package com.nacre.assignments;
//2>calling static methods and non static methods from a static method 
public class Toy {
private static String toyName="Smily";
private float toyCost=100.0f;

 

public  static String getToyName() {
	return toyName;
}

public float getToyCost() {
	return toyCost;
}

	public static void main(String[] args) {
		/*calling without class name and object reference shows
		compile time error at calling non static method.*/
	System.out.println(getToyName());
		//getToyCost();
		/*calling both methods with class name and
		 * shows compile time error at calling non static method */
	System.out.println(Toy.getToyName());
	//	Toy.getToyCost();
		/*calling both methods with object doesn't 
		 * show any compile time error ánd we 
		 * can call both methods using object reference */
		Toy toy=new Toy();
		System.out.println(toy.getToyName());
		System.out.println(toy.getToyCost());
		
	}

}
