package com.nacre.Exceptions;

class Override {
	  public void get() {
		  System.out.println(" Iam parent class method");;
		  }   
}

public class ExcepWithOverriding extends Override{
	
	 public void get() throws RuntimeException{
		 System.out.println("Iam child class method");
		 } 
	 

}
