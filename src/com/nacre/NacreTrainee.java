package com.nacre;
//4>iii> making fields as private
public class NacreTrainee {
	private String traineeName;
	private String batchName;
	private String Technology;
	private String Qualification;
	public NacreTrainee(String traineeName) {
		this.traineeName = traineeName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public void setTechnology(String technology) {
		Technology = technology;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public String getBatchName() {
		return batchName;
	}
	public String getTechnology() {
		return Technology;
	}
	public String getQualification() {
		return Qualification;
	}
	public static void main(String[] args) {
		NacreTrainee srinivas = new NacreTrainee("Srinivas");
		srinivas.setBatchName("fs23");
		srinivas.setQualification("B.Tech");
		srinivas.setTechnology("c language");
		NacreTrainee ramMohan = new NacreTrainee("Ram Mohan");
		ramMohan.setBatchName("fs22");
		ramMohan.setQualification("B.Tech");
		ramMohan.setTechnology("java language");
		NacreTrainee deepali = new NacreTrainee("Deepali");
		deepali.setBatchName("fs18");
		deepali.setQualification("B.Tech");
		deepali.setTechnology("English");
		System.out.println(srinivas.getBatchName() + "," + srinivas.getQualification() + "," + srinivas.getTechnology()
				+ "," + srinivas.traineeName);
		System.out.println(ramMohan.getBatchName() + "," + ramMohan.getQualification() + "," + ramMohan.getTechnology()
				+ "," + ramMohan.traineeName);
		System.out.println(deepali.getBatchName() + "," + deepali.getQualification() + "," + deepali.getTechnology()
				+ "," + deepali.traineeName);
	}

}
