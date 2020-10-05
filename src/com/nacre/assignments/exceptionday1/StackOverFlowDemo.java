package com.nacre.assignments.exceptionday1;

//Stack Over Flow Error Example 
public class StackOverFlowDemo {

	public static void main(String[] args) {
		StackOverFlowDemo so = new StackOverFlowDemo();
		so.stackOverFlowOperation();
	}

	private void stackOverFlowOperation() {
		System.out.println("Stack Over FLow");
		stackOverFlowOperation();
	}

}
