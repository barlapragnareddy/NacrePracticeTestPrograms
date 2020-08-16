package com.nacre.strings;

public class LastFirstOccurance {

	public static void main(String[] args) {
		String str = "nacre softwarb";
		for (int i = str.length()-1; i >=0 ; i--) {
			int count = 0;
			for (int j = str.length()-1; j >=0 ; j--) {
				if (str.charAt(i) == str.charAt(j))
					count++;
			}
			if (count > 1) {
				System.out.println("Last First Repeating char: "+str.charAt(i));
				break;
			}
		}
	}
}
	