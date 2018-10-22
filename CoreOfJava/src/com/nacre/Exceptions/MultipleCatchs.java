package com.nacre.Exceptions;

public class MultipleCatchs {
	void multicatch() {
		  int a[]=new int[2];
		  try{
			  a [4]=10/0;
			  //a [4]=10/0;   //ArrayIndexOutOfBoundsException
			  }
		  catch(ArrayIndexOutOfBoundsException e){
			  e.printStackTrace();
		  }
		  catch (ArithmeticException e) { 
			   e.printStackTrace(); 
			  }
	}
	public static void main(String[] args) {
		new MultipleCatchs().multicatch();
	}

}
