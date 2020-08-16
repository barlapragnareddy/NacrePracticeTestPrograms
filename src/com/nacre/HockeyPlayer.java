package com.nacre;

//5>i>>making game name common to all objects ie players

public class HockeyPlayer {
	String countryName;
	String playerName;
	static String gameName = "Tennis";

	public HockeyPlayer(String countryName, String playerName) {
		this.countryName = countryName;
		this.playerName = playerName;
	}

	public void display() {
		System.out.println(this.countryName + "," + this.playerName + "," + this.gameName);
	}

	public static void main(String[] args) {
		HockeyPlayer shushma = new HockeyPlayer("india", "Shushma");
		HockeyPlayer ranjitha = new HockeyPlayer("germany", "Ranjitha");
		HockeyPlayer saniaMirja = new HockeyPlayer("india", "Saniamirja");
		shushma.display();
		ranjitha.display();
		saniaMirja.display();
	}

}
