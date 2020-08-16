package com.nacre.strings;

public class PrintName {

	public static void main(String[] args) {
String s="Pragna";
//char[] ch=s.toCharArray();
//
//for(int i=0,j=ch.length;i<ch.length;i++,j--)
//	System.out.print(ch[i]+""+j);
for(int i=0,j=s.length();i<s.length();i++,j--) {
 char c=s.charAt(i);
 System.out.print(c+""+j+" ");

	}

}
}
