package stringsbasics;

import java.util.Scanner;

public class JobApplication {
	public boolean validate(String name)
	{
		boolean b=name.endsWith("_job");
		int l=name.length();
		if(b==true&&l>=12)
			return true;
		else
			return false;
		
		//return null;
		
	}
	

	public static void main(String[] args) {
		
		JobApplication j=new JobApplication();
		System.out.println("Enter your name");
		Scanner Sc=new Scanner(System.in);
		String x=Sc.next();
		boolean b=j.validate(x);
		System.out.println(x);
		System.out.println(b);
		Sc.close();
		

//if(b==true){
//	System.out.println("valid user name");
//
//}
//else{
//	System.out.println("invailid");
//}
		
	}

}
