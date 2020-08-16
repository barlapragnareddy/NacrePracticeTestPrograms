package com.nacre;
/*3> Printing Reema party fields without assigning values
 and printing fields */

public class ReemapParty {
	String batchName;
	int totalTrainees;
	String batchTechnology;
	String batchStatus;
	public void assignValues(String batchName, int totalTrainees, String batchTechnology, String batchStatus) {
		//this.batchName = batchName;
		//this.totalTrainees = totalTrainees;
		//this.batchTechnology = batchTechnology;
		//this.batchStatus = batchStatus;
	}

	public void show() {
		System.out.println("batch name=" + batchName);
		System.out.println("total trainees=" + totalTrainees);
		System.out.println("batch technology=" + batchTechnology);
		System.out.println("batch status=" + batchStatus);
	}

	public static void main(String[] args) {
		ReemapParty rp = new ReemapParty();
		rp.assignValues("kids Group", 30, "3D music", "active");
		rp.show();

	}

}
