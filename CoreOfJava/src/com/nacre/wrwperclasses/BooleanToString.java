package com.nacre.wrwperclasses;

public class BooleanToString {
	
	BooleanToString(boolean b1){
		
		Boolean boolean1=Boolean.valueOf(b1);
		System.out.println(boolean1);
		Boolean b3=new Boolean(b1);
		System.out.println(b3);
	}	
	public static void main(String[] args) {
		 Boolean b=true;
	      String str=Boolean.toString(b);
	      System.out.println(str);
	      boolean b1=true;
	      BooleanToString bt1=new BooleanToString(b1);
	}
}
