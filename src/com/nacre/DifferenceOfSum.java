//difference between sum of squares and square of sum of first n natural numbers
package com.nacre;

import java.util.Scanner;

public class DifferenceOfSum {
	int calculateDiffernce(int num) {
		int i = 1, sum1 = 0, sum2 = 0;
		while (i <= num) {
			sum1 = sum1 + i * i;
			sum2 += i;
			i++;
		}
		return sum1 - (sum2 * sum2);
	}

	public static void main(String[] args) {
		System.out.println("Enter limit");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		DifferenceOfSum ds = new DifferenceOfSum();
		int res = ds.calculateDiffernce(num);
		System.out.println(res);
	}

}
