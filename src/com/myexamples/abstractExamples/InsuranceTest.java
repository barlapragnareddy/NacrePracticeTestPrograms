package com.myexamples.abstractExamples;

//Insurance Eligibility using abstract class 
abstract class Insurance {
	public abstract String typeOfInsurance(long amount);

	public abstract void benefits(String type);
}

class SBIHealthInsuranceCompany extends Insurance {

	@Override
	public String typeOfInsurance(long amount) {
		String insuranceType = null;
		if (amount >= 200000 && amount < 300000)
			insuranceType = "Individual Health Insurance";
		else if (amount >= 300000 && amount < 400000)
			insuranceType = "Family Health Insurance";
		else if (amount >= 400000)
			insuranceType = "Top-Up Insurance";
		return insuranceType;
	}

	@Override
	public void benefits(String type) {
		if (type.equals("Individual Health Insurance"))
			System.out.println("Surgical and hospital expenses of an individual gets covered");
		else if (type.equals("Family Health Insurance"))
			System.out.println("It includes surgical & hospital expenses for entire family ");
		else if (type.equals("Top-Up Insurance"))
			System.out.println("Provides additional coverage over the regular policy");
		else
			System.out.println("Not eligible for any type of health insurance");

	}

}

class BajajCarInsuranceCompany extends Insurance {

	@Override
	public String typeOfInsurance(long amount) {
		String insuranceType = null;
		if (amount >= 500000 && amount < 100000)
			insuranceType = "Collision Insurance";
		else if (amount >= 100000 && amount < 1500000)
			insuranceType = "Personal Injury Protection Insurance";
		else if (amount >= 150000)
			insuranceType = "Classic Car Insurance";
		return insuranceType;

	}

	@Override
	public void benefits(String type) {
		if (type.equals("Collision Insurance"))
			System.out.println("Covers car damage and provides repair or replace options");
		else if (type.equals("Personal Injury Protection Insurance"))
			System.out.println("Covers medical expenses & other income loses of accident ");
		else if (type.equals("Classic Car Insurance"))
			System.out.println("Provides specialized coverage for classic cars");
		else
			System.out.println("Not eligible for any type of car insurance");
	}
}

class HDFCHomeInsuranceCompany extends Insurance {

	@Override
	public String typeOfInsurance(long amount) {
		String insuranceType = null;
		if (amount >= 700000 && amount < 1000000)
			insuranceType = "Home Building Insurance";
		else if (amount >= 1000000 && amount < 1300000)
			insuranceType = "Personal Accident Home Insurance";
		else if (amount >= 130000)
			insuranceType = "Theft Insurance";
		return insuranceType;
	}
	@Override
	public void benefits(String type) {
		if (type.equals("Home Building Insurance"))
			System.out.println("It covers house structure risks like permanent fixtures in house");
		else if (type.equals("Personal Accident Home Insurance"))
			System.out.println("It covers entire family in case of death of an insured person ");
		else if (type.equals("Theft Insurance"))
			System.out.println("It covers stolen things and damages due to theft");
		else
			System.out.println("Not eligible for any type of home insurance");
	}
}
public class InsuranceTest {

	public static void main(String[] args) {
		Insurance i;
		i = new SBIHealthInsuranceCompany();
		String type = i.typeOfInsurance(250000);
		System.out.println(type);
		i.benefits(type);
		System.out.println("-------------------------");
		i = new BajajCarInsuranceCompany();
		String type2 = i.typeOfInsurance(1100000);
		System.out.println(type2);
		i.benefits(type2);
		System.out.println("-------------------------");
		i = new HDFCHomeInsuranceCompany();
		String type3 = i.typeOfInsurance(900000);
		System.out.println(type3);
		i.benefits(type3);
		

	}

}
