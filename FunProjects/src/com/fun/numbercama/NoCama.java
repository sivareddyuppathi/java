package com.fun.numbercama;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NoCama {
	public static void main(String[] args) {
  //1st type solution .......
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
		 int number = sc.nextInt();
		 NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
		 String numberAsString = numberFormat.format(number);
	     System.out.println(numberAsString);
  //2nd type solution ......     
		 String numberAsString1 = String.format("%,d", number);
	     System.out.println(numberAsString1);
  //3rd type solution.......      
	     DecimalFormat decimalFormat = new DecimalFormat("#,###");
	     String numberAsString2 = decimalFormat.format(number);
	     System.out.println(numberAsString2);
	}
}
