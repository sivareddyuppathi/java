package com.nacre.wrwperclasses;

public class JavaStringToBoolean {
	
	JavaStringToBoolean(String str){
		Boolean b=Boolean.getBoolean(str);
		System.out.println(b);	
	}
	public static void main(String[] args) {
		
		String str="false";
		JavaStringToBoolean st=new JavaStringToBoolean(str);
		Boolean boolean1=Boolean.valueOf(str);
		System.out.println(boolean1);		
	}
}
