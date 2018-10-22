package com.nacre.threading;
import java.util.Scanner;

class SingleTask extends Thread {
	public void run() {
		task1();
		task2();
	}
	 void task1() {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("first No :");
		int fno=sc.nextInt();
		System.out.println("second No :");
		int sno=sc.nextInt();
		System.out.println(fno+sno);
		sc.close();
	}
	 void task2() {
		 int[] a= {10,20,30,40};
		 int sum=0;
		 for(int i=0;i<a.length;i++) 
			 sum+=a[i];
		 System.out.println("Array Sum :"+sum);
	 }
}
public class SingleTaskingThread{
	public static void main(String[] args) {
		Thread t=new Thread(new SingleTask());
		t.start();
	}
}

