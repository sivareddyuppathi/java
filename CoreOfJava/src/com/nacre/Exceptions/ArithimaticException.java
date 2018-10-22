package com.nacre.Exceptions;

import java.util.Scanner;

public class ArithimaticException {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st No :");
		int fno=scanner.nextInt();
		System.out.println("Enter 2nd No :");
		int sno=scanner.nextInt();
		try {
		double d=fno/sno;
		System.out.println("div o/p :"+d);	
		}catch(Exception ae) {
			System.out.println("You Shouldn't divide a number by zero");
		}
	}
		  

}
