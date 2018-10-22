package com.MiniProjects.miniproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomerFunctions {
	
     public void addingItemsDynamically() {
    	 
    	 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
         System.out.println("How Many Items You Want to Add to Cart : ");
         
         int size = sc.nextInt();
         String items[] = new String[size];
         System.out.println("Enter Items Names : ");
         
         for(int i=0; i<size; i++) {
            items[i] = sc.next();
         }
         System.out.println(Arrays.toString(items));
         ArrayList<String> myList = new ArrayList<String>(Arrays.asList(items));
         
         System.out.println("If You Want add Extra Items to cart : ");
         
         int size1 = sc.nextInt();       
        for(int k=0;k<size1;k++) {
		         String element = sc.next();
		         myList.add(element);
		         items = myList.toArray(items);
         }
         System.out.println(Arrays.toString(items));
         System.out.println("Which index youwant remove : ");
         int size2 = sc.nextInt();  
         for(int z=0;z<size2;z++) {
        	 ArrayList<String> strk=myList;
                 strk.remove(z);
                 items=strk.toArray(items);
         }
         System.out.println(Arrays.toString(items));
         //deleteItems();
     }  
     public void deleteItems() {
    	 System.out.println("\nHow many items you want to delete : \n");
    	 System.out.println("which Element you want to delete : ");
     }
}
