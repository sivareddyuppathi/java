package com.nacre.Strings;
import java.util.Scanner;

public class RevString {
	             Scanner read = new Scanner(System.in);
	             
     public void strforloop() {
//for loop reverse String.......
		System.out.println("Enter string to reverse: ");
        String str = read.nextLine();
        String reverse = "";         
        for(int i = str.length() - 1; i >= 0; i--)  {
            reverse = reverse + str.charAt(i);     }        
        System.out.println("Reversed for loop string :"+reverse);
//reverse String by using StringBuilder.......  
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));  }
        System.out.println("Reversed stringBuilder is: "+sb.toString());
//reverse String by using StringBuilder.......
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println("Reversed stringBuilder 2nd type is: "+sb1.reverse().toString());
//toCharArray reverse String.......
        char[] c=str.toCharArray();
        for(int i=c.length;i>=1;i--) {	//for(int i=c.length-1;i>=0;i--){System.out.print(c[i]);}
        System.out.print(c[i-1]);  }
	}
  public static void main(String[] args) {
	   new RevString().strforloop();
		}
}