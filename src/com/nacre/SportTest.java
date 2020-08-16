package com.nacre;

//6c>creating classes in source file named sport.
 class Hockey {
	String sportName;

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
}

class Football {
	String sportName;

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
}
public class SportTest {
	public static void main(String[] args) {
		Hockey hockey = new Hockey();
		hockey.setSportName("Hockey Game");
		Football football = new Football();
		football.setSportName("Football Game");
		System.out.println(hockey.getSportName());
		System.out.println(football.getSportName());
	}
}
