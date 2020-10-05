package com.nacre.assignments.exceptionday1;

//Handling null pointer exception
public class HandleNullPointerException {
	public void display(String name) {
		System.out.println("Name of person is:" + name);
	}

	public static void main(String[] args) {
		HandleNullPointerException h = null;
		h.display("Pragna");
		if (h == null) {
			h = new HandleNullPointerException();
			h.display("ranjitha");
		} else {
			h.display("pragna");
		}
	}
}
