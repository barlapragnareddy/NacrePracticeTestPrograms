package com.nacre.strings;
//reverse of a string
public class StringReverseCharAt {

	public static void main(String[] args) {
		String s = "Pragna";
		String s1="";
		for (int i = s.length() - 1; i >= 0; i--) {
			char e = s.charAt(i);
			s1=s1+e;
		}
		System.out.println(s+" reverse is "+s1);
	}
}
