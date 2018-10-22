package com.nacre.oops;

class Contractor{
	
	String contractName; 
	String phoneNumber; 
	String Address; 
	String ownerName; 
	Building building;
	
	public Contractor(String contractName, String phoneNumber, String address, String ownerName, Building building) {
		//super();
		this.contractName = contractName;
		this.phoneNumber = phoneNumber;
		Address = address;
		this.ownerName = ownerName;
		this.building = building;
	} 
	
	void getDetails() {
		System.out.println("****Contract Details****\n");
		
		System.out.println("NAME OF ORGANIZATION:"+contractName+"\n"+phoneNumber+"\n"+Address+"\n"+ ownerName);
		
		System.out.println("\n****Bulding Details****\n");
		
		System.out.println(building.ownerName+"\n"+building.sizeOfTheBuilding+"\n"+building.address);
		
	}
}

class Building{
	
	String ownerName; 
	String sizeOfTheBuilding; 
	String address;
	
	public Building(String ownerName, String sizeOfTheBuilding, String address) {
		//super();
		this.ownerName = ownerName;
		this.sizeOfTheBuilding = sizeOfTheBuilding;
		this.address = address;
	} 
	
}
public class AssociationTest {
		
	public static void main(String[] args) {
		Building b = new Building("murthy", "100*200 sq ft","miyapur phase 1");
		Contractor ct=new Contractor("Kavya Constructions","9490626902","miyapur","siva",b);
		ct.getDetails();
	}

}
