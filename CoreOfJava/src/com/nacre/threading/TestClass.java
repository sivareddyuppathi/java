package com.nacre.threading;

class MyRunnable implements Runnable {
	String name;
	
	public MyRunnable(String name) {
		this.name = name;
	}

	public void run() {
		while(true) {
			System.out.println(name);
		}
	}
}
public class TestClass {
	
	public TestClass() {
		Runnable runner = new MyRunnable("First");
		Thread t=new Thread(runner);
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();
		MyRunnable runner1=new MyRunnable("Second");
		
		Thread t2=new Thread(runner);
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
	}
	

	public static void main(String[] args) {
		TestClass class1=new TestClass();
	}
}
