package com.nacre;
/*2> Printing Reema party fields
 * using methods to initialize  */

public class ReemaParty {
	String batchName;
	int totalTrainees;
	String batchTechnology;
	String batchStatus;
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public int getTotalTrainees() {
		return totalTrainees;
	}
	public void setTotalTrainees(int totalTrainees) {
		this.totalTrainees = totalTrainees;
	}
	public String getBatchTechnology() {
		return batchTechnology;
	}
	public void setBatchTechnology(String batchTechnology) {
		this.batchTechnology = batchTechnology;
	}
	public String getBatchStatus() {
		return batchStatus;
	}
	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	public static void main(String[] args) {
		ReemaParty rp = new ReemaParty();
		rp.setBatchName("youngster group");
		rp.setBatchStatus("active");
		rp.setBatchTechnology("3D music");
		rp.setTotalTrainees(40);
		System.out.println("batch name="+rp.getBatchName());
		System.out.println("batch technology="+rp.getBatchTechnology());
		System.out.println("batch status="+rp.getBatchStatus());
		System.out.println("batch trainees="+rp.getTotalTrainees());
	}
}
