package com.nacre.strings;

import java.util.Scanner;

public class EncryptedString {

	public static void main(String[] args) {
		EncryptedString es = new EncryptedString();
		System.out.println("Enter String name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String encryptedresult = es.encryptionOperation(name);
		System.out.println(encryptedresult);
		
		String encryptedresult1 = es.encryptionOperation1(name);
		System.out.println(encryptedresult1);
	}

	private String encryptionOperation(String name) {
		char[] ch = name.toCharArray();
		String encrptedname = "";
		for (int i = 0; i < ch.length; i++) {
			char c1;
			ch[i] = (char) (ch[i] + 9);
			if (ch[i] > 'z') {
				int i2 = ch[i] - 'z';
				c1 = (char) (i2 + 'a'-1);
			} else {
				c1 = ch[i];
			}
			encrptedname = encrptedname + c1;
		}
		return encrptedname;

	}

	private String encryptionOperation1(String name) {
		String encrptedname = "";
		char c1;
		for (int i = 0; i < name.length(); i++) {
			int i1 = (int) (name.charAt(i) + 9);
			if (i1 > 'z') {
				int i2 = i1 - 'z';
				c1 = (char) (i2 + 'a'-1);
			} else {
				c1 = (char) (i1);
			}
			encrptedname = encrptedname + c1;
		}
		return encrptedname;

	}

}
