package com.nacre.assignments.strings.day1;

import java.util.StringTokenizer;

//Reverse word by word using string tokenizer
public class ReverseByWordInSentence {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(
				"yrtsudnI tnempoleveD dnA gniniarT nI droW zzuB ,A seigolonhceT hseraNTI", " ");
		String emptyString = "";
		while (st.hasMoreTokens()) {
			String s = reverseOfWord(st.nextToken());
			emptyString = emptyString + " " + s;
		}
		System.out.println("Reverse of word=" + emptyString);
	}

	private static String reverseOfWord(String nextToken) {
		String emptyString = "";
		for (int i = nextToken.length() - 1; i >= 0; i--) {
			emptyString = emptyString + nextToken.charAt(i);
		}
		return emptyString;
	}

}
