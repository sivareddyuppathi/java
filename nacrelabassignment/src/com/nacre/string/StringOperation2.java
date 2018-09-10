package com.nacre.string;

//import java.util.Scanner;

public class StringOperation2 {
	
	String strvar;
	public String getStrvar() {
		return strvar;
	}

	public void setStrvar(String strvar) {
		this.strvar = strvar;
	}
	public String replace(){
		
	/*	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(); */

		//String str = "  sivareddy vijay  ";
		 
		strvar = strvar.replaceAll("^\\s+", "");
		 
		return "\"" + strvar + "\"";
			
	}
	public static void main(String[] args) {
		
		StringOperation2 string=new StringOperation2();
			string.setStrvar("    siva reddy   ");
			System.out.println(string.getStrvar());
			//string.replace();
			String s1=string.replace();
			System.out.println(s1);
		
	}

}
