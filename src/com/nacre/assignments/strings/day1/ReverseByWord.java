package com.nacre.assignments.strings.day1;

import java.util.Scanner;

//Reverse word by word using string buffer
class WordRevserseDemo {

	public String reverseWordSentence(String sentence) {
		String[] str = sentence.split(" ");
		String emptyString = "";
		for (int i = 0; i < str.length; i++) {
			StringBuffer sb = new StringBuffer(str[i]);
			sb.reverse();
			emptyString = emptyString + " " + sb.toString();
		}
		return emptyString;
	}

}

public class ReverseByWord {

	public static void main(String[] args) {
		WordRevserseDemo wd = new WordRevserseDemo();
		System.out.println("Enter a sentence");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		sc.close();
		String reverseSentence = wd.reverseWordSentence(sentence);
		System.out.println("Reverse of sentence= " + reverseSentence);
	}

}
