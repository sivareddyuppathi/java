package com.nacre.threading;

public class RunTest implements Runnable {
	public void run() {
			System.out.println("hii");
		}
	public static void main(String[] args) {
		RunTest obj=new RunTest();
		Thread t=new Thread(obj);
		t.start();
		Thread t1=new Thread(obj);
		t1.start();		
	}
}
