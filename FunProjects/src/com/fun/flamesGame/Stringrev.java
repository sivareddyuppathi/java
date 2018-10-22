package com.fun.flamesGame;

import java.util.Scanner;

public class Stringrev {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//String str="siva";
		/*char[] c=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}*/
		
		
		/*String rev = new StringBuffer(str).reverse().toString();
	      System.out.println("\nString before reverse: "+str);
	      System.out.println("String after reverse: "+rev);*/
	      
		/* StringBuffer a = new StringBuffer("Java programming is fun");
	      System.out.println(a.reverse()); */
		 System.out.println("Enter string to reverse:");
	        Scanner read = new Scanner(System.in);
	        String str = read.nextLine();
	        String reverse = "";
	        for(int i = str.length() - 1; i >= 0; i--)
	        {	 reverse = reverse + str.charAt(i);    
	        }
	        System.out.println("Reversed string is:");
	        System.out.println(reverse);
	}
}
