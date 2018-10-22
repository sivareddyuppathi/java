package com.nacre.oops;

import java.util.Scanner;

class outer{
	private int number; 
	
class inner{
	 
	void display() 
	{ 
	System.out.println(" number is "+number); 
	} 
}
public static void main(String[] args) {
	outer out=new outer(); 
	outer.inner in=out.new inner(); 
	
	Scanner sc=new Scanner (System.in); 
	System.out.println("enter a number."); 
	int number=sc.nextInt(); 
	

}
}
