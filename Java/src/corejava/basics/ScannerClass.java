package corejava.basics;

import java.util.Scanner;

public class ScannerClass 
{

	public static void main(String[] args)
	
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter first no : ");
		int x=Sc.nextInt();
		System.out.println("Enter second no : ");
		int y=Sc.nextInt();
		int z=x+y;
		System.out.println("Sum = "+z);
		Sc.close();
	}

}