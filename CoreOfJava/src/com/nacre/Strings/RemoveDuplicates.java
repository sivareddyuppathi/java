package com.nacre.Strings;

	import java.util.*; 
	  
	class RemoveDuplicates { 
	    void removeDuplicates(String str)  { 
	        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
	        for(int i=0;i<str.length();i++) 
	            lhs.add(str.charAt(i)); 
  // print string after deleting duplicate elements 
	        System.out.print("After remove duplicates : ");
	        for(char ch : lhs) 
	            System.out.print(ch); 
	    } 	      
	    public static void main(String args[])  {
	   //2nd type 	
	    	 String input = "AAAB";
	    	 String output = "";
	 for (int index = 0; index < input.length(); index++) {
	    if (input.charAt(index % input.length()) != input.charAt((index + 1) % input.length())) {
	    	            output += input.charAt(index);
	    	        }
	    	    }
	    	    System.out.println(output);
	    	    
	//1st type........................    	    
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter Names : ");
	        String str =sc.next();  
	    new RemoveDuplicates().removeDuplicates(str);
	    } 
	} 

