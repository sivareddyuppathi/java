package com.nacre.Exceptions;

public class NumberFormatExcep {
	  void CheckException1()   { 
		  try{
			  String str="abc";
			  int num=Integer.parseInt(str);
			  System.out.println(num);
		  }   catch (NumberFormatException e)   { 
			  System.out.println("please pass Numbers Only"); 
	  }  
	}
	  public static void main(String[] args) {
		new NumberFormatExcep().CheckException1();
	}
}
