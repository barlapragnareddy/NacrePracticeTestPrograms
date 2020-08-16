package com.nacre.assignments.strings.day1;

//join method of a string
public class JoinMethodDemo {

	public static void main(String[] args) {
		JoinMethodDemo jm = new JoinMethodDemo();
		jm.joinString();
	}

	private void joinString() {
		// accepting delimeter and char sequence array.
		String s = String.join("*", "Hi", "how", "are", "you", "pragna");
		System.out.println(s);
	}

}
