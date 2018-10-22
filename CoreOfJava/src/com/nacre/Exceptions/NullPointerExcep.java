package com.nacre.Exceptions;

public class NullPointerExcep {
	
	  void CheckException()  {
		  try{
			  String str=null;
			  System.out.println(str.length());
			  }catch(NullPointerException e){
				  System.out.println("Please Give String Null Not possible to Find Length");
				  }
		  }
	public static void main(String[] args) {
		new NullPointerExcep().CheckException();
	}
}
