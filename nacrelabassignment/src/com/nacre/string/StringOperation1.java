package com.nacre.string;

import java.util.Scanner;

public class StringOperation1 {
	String strVar;
	
	public String getStrvar() {
		return strVar;
	}

	public void setStrvar(String strvar) {
		this.strVar = strvar;
	}
	public void splita(String strvar){
		//String str="siva,reddy,anu,manu";
		System.out.println("Enter Strings with comma:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String[] arrsplit=str.split("[,\\.\\@]");
		for(int i=0;i<arrsplit.length;i++)
		{
			System.out.println(arrsplit[i]);
		}
	
		
		sc.close();
		
	}
	public static void main(String[] args) {
		StringOperation1 s=new StringOperation1();
		
				s.splita("");
	}

}
