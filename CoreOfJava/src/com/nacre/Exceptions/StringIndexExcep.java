package com.nacre.Exceptions;

public class StringIndexExcep {

	 void CheckException3(){
		 try{
			 String str="Follow World";
			 System.out.println(str.length());
			 char c=str.charAt(0);
			 System.out.println(c);
			 c=str.charAt(40);
			 System.out.println(c);
			 }
		 catch(StringIndexOutOfBoundsException s){
				 System.out.println("Please take With in The range of String");
				 }
		 } 
	public static void main(String[] args) {
		new StringIndexExcep().CheckException3();
	}
}
