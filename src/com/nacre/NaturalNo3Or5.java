package com.nacre;

public class NaturalNo3Or5 {
	public static void main(String[] args) {
		NaturalNo3Or5 naturalNo3Or5 = new NaturalNo3Or5();
		naturalNo3Or5.displayNumbers(5);
	}

	public void displayNumbers(int num) {
		int i = 1, count = 1;
		while (count <= num) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
				count++;
			}
			i++;

		}

	}
}
