package com.nacre.Collections_1;
class Student{
	String sName;
	int sId;
	double sMarks;
	public Student(String sName, int sId, double sMarks) {
		this.sName = sName;
		this.sId = sId;
		this.sMarks = sMarks;
	}
	@Override
	public String toString() {
		return "StudentName : " + sName +"  "+ "StudentId : " + sId +"  "+ "StudentMarks=" + sMarks;
	}
	
}

public class StudentData {
     
}
