package com.nacre.strings;

import java.util.Scanner;

public class ReverseOfStringEachWord {

	public static void main(String[] args) {
		ReverseOfStringEachWord rs=new ReverseOfStringEachWord();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String sentence=sc.nextLine();
		String reversedresult=rs.reverseOperation(sentence);
		System.out.println(reversedresult);
	}

	private String reverseOperation(String sb) {
		String[] arr=sb.split(" ");
		String reversedString="";
		for(int i=0;i<arr.length;i++) {
			StringBuffer sub=new StringBuffer(arr[i]);
			sub.reverse();
			reversedString=reversedString+sub.toString()+" ";
		}
		return reversedString;
	}
		

}
