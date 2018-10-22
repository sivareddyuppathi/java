package com.MiniProjects.miniproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AuthenticationFunctions {
	
	Scanner s1=new Scanner(System.in);
	
	public void authenticationFun() {
	 System.out.println("\n---------Welcome to Online Shopping ------------\n ");
	 System.out.println("Choose an option: ");
	 System.out.println("(1) User Login : ");
     System.out.println("(2) Admin login : ");
     System.out.println("(3) User Register : ");
     
     int optionSelected = s1.nextInt();
	 ChooseOption(optionSelected);
	}
	 void ChooseOption(int OptionSelected) {
    	 switch (OptionSelected) {
         case 1:userLogin();break;
         case 2:adminLogin();break;
         case 3:userReg();break;  
         }
     }
	private void userReg() {
		
		 System.out.println("Enter your Full Name : ");
		 String fn=s1.next();
		
		 try {
	     System.out.println("Enter Phone Number : ");
	     int ph=s1.nextInt();
		 }catch(InputMismatchException e) {
			 System.out.println("Please Enter Numbers only : ");
		 }
		 
	     System.out.println("Enter E_mail Id : ");
	     String email=s1.next();
	     System.out.println("Enter Address : ");
	     String addr=s1.next();
	     System.out.println("Please wait we are storing...");
	     System.out.println("Registred Successfully......");
	     userLogin();
	}
	private void adminLogin() {
		System.out.println("Enter AdminUserName : ");
		String aun=s1.next();
		System.out.println("Enter Admin Password : ");
		String sr=s1.next();
		System.out.println("Please wait we are validating your credentials .....");
		try {
			Thread.sleep(2000);
			System.out.println("Succesfully logedin");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new AdminFunctions().adminFuns();
	}
	private void userLogin() {
	     System.out.println("Enter E_mail Id : ");
	     String email=s1.next();
	     System.out.println("Enter E_mail Id Passwaord : ");
	     String sr=s1.next();
	     System.out.println("Please wait we are validating your credentials .....");
	     try {
				Thread.sleep(2000);
				System.out.println("Succesfully logedin\n");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	     new CustomerFunctions().addingItemsDynamically();
	}
}
