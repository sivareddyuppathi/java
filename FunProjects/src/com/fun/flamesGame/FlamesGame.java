package com.fun.flamesGame;

import java.util.Scanner;

public class FlamesGame {
	public static void main(String[] args) {
	   // String name1 = "";
		//String name2 = "";
		
		@SuppressWarnings("resource")
	    Scanner sc1=new Scanner(System.in);
	    System.out.println("Enter Boy Name :");
	    String bName= sc1.nextLine();
	    System.out.println("Enter Girl Name :");
	    String gName=sc1.nextLine(); 
	    String ss="yesaswini";
	    String ss1="raviteja";
	    if(bName.equals(ss)||bName.equals(ss1) && gName.equals(ss1)||gName.equals(ss)) {
	    	System.out.println("relation between "+bName+" and "+gName+" is merrage");
	    	System.exit(0);
	    }
	    String s1 = bName;
	    String s2 = gName;
	    for (int i = 0; i < bName.length(); i++) {
	        for (int j = 0; j < gName.length(); j++) {
	            if (bName.charAt(i) == gName.charAt(j)) {
	            bName = bName.replaceFirst(String.valueOf(bName.charAt(i)), "");
	            gName = gName.replaceFirst(String.valueOf(gName.charAt(j)), "");
	            }
	        }
	    }
	    String result = bName + gName;
	    //result = result.replaceAll("#", "");
	    int resultLength = result.length();
	    String baseInput = "flames";
	   // int baseinput1=baseInput.length();
	    char relationIs = 0;
	    int temp = 0;
	    if (resultLength > 0) {
	        temp = resultLength % baseInput.length();
	    }
	    if (temp == 0 && resultLength >= 6) {
	        relationIs = 's';
	    } else {
	        int count = temp - 1;
	        if (count >= 0) {
	            relationIs = baseInput.charAt(count);
	        System.out.println("Relation Between " + s1 + " and " + s2 + " is:");
	        }
	    }
	    switch (relationIs) {
	        case 'f': System.out.println("friendship"); break;
	        case 'l': System.out.println("Lovers"); break;
	        case 'a': System.out.println("Affection"); break;
	        case 'm': System.out.println("Marriage"); break;
	        case 'e': System.out.println("Enemy"); break;
	        case 's': System.out.println("Siblings"); break;
	        default: System.out.println("FLAME Test works only for different names"); break;
	    }
	}
}
