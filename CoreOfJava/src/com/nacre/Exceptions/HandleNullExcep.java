package com.nacre.Exceptions;

public class HandleNullExcep {
	public void display(int a) {
		System.out.println(a);
	}


	public static void main(String[] args) {
		HandleNullExcep h=null;
		
		//h.display(10); If Directly pass Exception Raised
		if(h==null) {
			h=new HandleNullExcep();
			h.display(10);
		}
		else {
			h.display(0);
		}
	}

}
