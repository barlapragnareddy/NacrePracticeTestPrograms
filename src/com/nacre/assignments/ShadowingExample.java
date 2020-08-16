package com.nacre.assignments;
//print a variable value with 2 different values
public class ShadowingExample {
 int shadowVar = 10;

	public static void main(String[] args) {
		int shadowVar = 5;
		System.out.println(shadowVar);
		/* we get 2 different values by using object reference 
		 * and calling variable name and another through 
		 * directly printing variable.
		 */
		ShadowingExample se=new ShadowingExample();
		System.out.println(se.shadowVar);

	}

}
