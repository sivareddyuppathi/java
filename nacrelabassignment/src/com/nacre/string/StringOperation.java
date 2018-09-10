package com.nacre.string;

import java.util.Scanner;

public class StringOperation {
	
	String strvar; //instance variable
	
	public String getStrvar() {
		return strvar;
	}

	public void setStrvar(String strvar) {
		this.strvar = strvar;
	}

	public String reverse1(String strvar)
	{
		
		StringBuffer strvar1 = new StringBuffer(strvar);
 
		strvar1.reverse();

		//System.out.println(strvar1);-
		//strvar1 = strvar1.toString();
		return strvar1.toString();
		
	}
	public String reverse(String strvar)
	{
		//strvar.length();

		//char a[]=new char[20];
		char c[]=new char[strvar.length()];
		int j=0;
		for(int i=strvar.length()-1;i>=0;i--)
		{
			
			c[j]=strvar.charAt(i);
			j++;
		}
		strvar = new String(c);
			
		return strvar;
		
	}

	public static void main(String[] args) {
		
		StringOperation s=new StringOperation();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		System.out.println(s.reverse(str));
		System.out.println(s.reverse1(str));
		
	}

}
