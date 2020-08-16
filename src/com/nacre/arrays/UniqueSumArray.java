package com.nacre.arrays;

//Unique elements sum in an array
import java.util.Scanner;

public class UniqueSumArray {

	public static void main(String[] args) {
		UniqueSumArray usa = new UniqueSumArray();

		System.out.println("Enter elements size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements into array");
		for (int i = 0; i < size; i++) {
			int ele = sc.nextInt();
			arr[i] = ele;
		}
		int sum = usa.sumOfArray(arr);
		System.out.println(sum);

	}

	private int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

}
