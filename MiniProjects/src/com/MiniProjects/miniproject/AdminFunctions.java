package com.MiniProjects.miniproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AdminFunctions {
		Scanner sc=new Scanner(System.in);
	public void adminFuns() {
		 
		    System.out.println("(1) Insert new Product : ");
	        System.out.println("(2) Update Product : ");
	        System.out.println("(3) Delete Product : ");
	        System.out.println("(4) View All Products : ");
	        System.out.print("Choose an option: ");
		int selectOption=sc.nextInt();
		optionChoose(selectOption);
	}
	public void optionChoose(int selectOption) {
		switch(selectOption) {
		case 1:insertNewProduct();break;
		case 2:updateProduct();break;
		case 3:deleteProduct();break;
		case 4:viewAllProducts();break;
		}
	}
	private void viewAllProducts() {
		System.out.println("---- Avilable products are----");
		 System.out.println("(1) Electronic Gaudgets ");
	        System.out.println("(2) Home Apliences ");
	        System.out.println("(3) Kids Ware ");
	        System.out.println("(4) Mens Ware ");
	        System.out.print("Choose an option: ");	
	        int selectOption1=sc.nextInt();
			optionChoose1(selectOption1);
	}
	public void optionChoose1(int selectOption1) {
		switch(selectOption1) {
		case 1:ElectronicGaudgets();break;
		case 2:;break;
		case 3:;break;
		case 4:;break;
		}
	}	
	private void ElectronicGaudgets() {
		System.out.println("-------- Avilable Electronic Gaudgets are -----");
		Map<Integer,String>mp=new LinkedHashMap<Integer, String>();
	}
	private void deleteProduct() {
		
	}
	private void updateProduct() {
		viewAllProducts();
		
	}
	ArrayList<String> myList = new ArrayList<String>();
	private void insertNewProduct() {
		System.out.println("How many Products you Want to insert : ");
		  int size = sc.nextInt();
	         String[] products= new String[size];
	         System.out.println("Enter Product Names : ");
	         
	         for(int i=0; i<size; i++) {
	            products[i] = sc.next();
	         }
	         System.out.println(Arrays.toString(products));
	       //  ArrayList<String> myList = new ArrayList<String>(Arrays.asList(products));
	         
	         System.out.println("If You Want add Extra Products : ");
	         
	         int size1 = sc.nextInt();       
	        for(int k=0;k<size1;k++) {
			         String element = sc.next();
			         myList.add(element);
			         products = myList.toArray(products);
	         }
	        /* System.out.println(Arrays.toString(products));
	         System.out.println("Which product you want remove : ");
	         int size2 = sc.nextInt();  
	         for(int z=0;z<size2;z++) {
	        	 ArrayList<String> strk=myList;
	                 strk.remove(z);
	                 products=strk.toArray(products);
	         }*/
	         System.out.println(Arrays.toString(products));
	}	
}