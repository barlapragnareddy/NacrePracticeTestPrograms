package com.nacre.assignments.strings.day1;

//Splitting string and removing white spaces in a string using replaceall and substring methods
import java.util.Scanner;

class StringSplitting {
	private String strVar;

	public String getStrVar() {
		return strVar;
	}

	public void setStrVar(String strVar) {
		this.strVar = strVar;
	}

	public void splitOperation() {
		String[] arr = strVar.split("[,.]");
		System.out.println("total tokens=" + arr.length);
		System.out.println("token after splitted:");
		for (String s : arr)
			System.out.println(s);
	}

	public void removeTrailingSpaces() {
		String s = strVar.replaceAll("^\\s+", "");
		String t = s.replaceAll("\\s+$", "");
		System.out.println("Using replaceall final string: " + t);
		System.out.println("Length of string: " + t.length());
		System.out.println("--------------------------------");
		String sub1 = null;
		for (int i = 0; i < strVar.length(); i++) {
			if (Character.isWhitespace(strVar.charAt(i))) {
				continue;
			} else {
				sub1 = strVar.substring(i, strVar.length());
				break;
			}

		}
		System.out.println("Substring is:" + sub1);
		for (int j = sub1.length() - 1; j >= 0; j--) {
			if (Character.isWhitespace(sub1.charAt(j))) {
				continue;
			} else {
				sub1 = sub1.substring(0, j + 1);
				break;
			}
		}

		System.out.println("Final string by removing white spaces without replace:" + sub1);
		System.out.println(sub1.length());
	}
}

public class SplitStringUsingEnhanced {

	public static void main(String[] args) {
		StringSplitting sp = new StringSplitting();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String sen = sc.nextLine();
		sp.setStrVar(sen);
		System.out.println("Given string is=" + sp.getStrVar());
		sp.splitOperation();
		System.out.println("------------------------");
		System.out.println("Please enter a string");
		String s = sc.nextLine();
		sp.setStrVar(s);
		System.out.println("Given String is=" + sp.getStrVar());
		sp.removeTrailingSpaces();
		sc.close();
	}

}
