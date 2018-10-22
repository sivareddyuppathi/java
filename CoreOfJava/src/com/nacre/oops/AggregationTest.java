package com.nacre.oops;

class Project{
	int projectId; 
	String projectTitle; 
	//Date startingDate; 
	int teamSize; 
	String clientName;
	public Project(int projectId, String projectTitle, int teamSize, String clientName) {
		this.projectId = projectId;
		this.projectTitle = projectTitle;
		this.teamSize = teamSize;
		this.clientName = clientName;		
	} 	
}

class Employee{
	int employeeId; 
	String employeeName; 
	String phoneNumber; 
	String address; 
	Project project;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void getProject() {		
		System.out.println("projectId: "+project.projectId);
		System.out.println(project.projectTitle);
		System.out.println(project.teamSize);
		System.out.println(project.clientName);		
	}
	public void setProject(Project project) {
		this.project = project;
	} 
	
}

public class AggregationTest {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setEmployeeId(2);
		System.out.println(e.getEmployeeId());
		
		Project p = new Project(12,"apthara", 6, "pwc");
		System.out.println("***project details***");
		e.setProject(p);
		e.getProject();
	}

}
