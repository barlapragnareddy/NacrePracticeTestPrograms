package com.nacre;

public class EvenOrOdd {
public int checkNumber(int num) {
	if(num%2==0)
		return num*num;
	else
		return num*num*num;
}
	public static void main(String[] args) {
		EvenOrOdd eo=new EvenOrOdd();
		int res=eo.checkNumber(5);
		System.out.println(res);
	}

}
