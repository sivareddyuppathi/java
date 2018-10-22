package com.nacre.Exceptions2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionAndMessage {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No :");
		try {
			int a=sc.nextInt();
		}
		catch (InputMismatchException e) {
			
		System.out.println("Only integers are allowed");
		//String	sw=e.getMessage();
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		e.printStackTrace();
		}
		System.out.println("Hi");		
	}
}
