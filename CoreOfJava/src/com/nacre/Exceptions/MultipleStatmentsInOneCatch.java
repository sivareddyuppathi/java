package com.nacre.Exceptions;

public class MultipleStatmentsInOneCatch {
	void multicatch1() {
		  int a[]=new int[2];
		  try{
			 // a [4]=10/0;  //ArithmeticException
			//  a [4]=10/2;   //ArrayIndexOutOfBoundsException
			  String ss="Str";
			  int s=Integer.parseInt(ss);
			  }
		  catch(ArrayIndexOutOfBoundsException|ArithmeticException |NumberFormatException  e){
			  e.printStackTrace();
		  }
		  
	}
	public static void main(String[] args) {
		new MultipleStatmentsInOneCatch().multicatch1();
	}


}
