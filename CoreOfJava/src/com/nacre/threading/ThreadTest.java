package com.nacre.threading;

public class ThreadTest extends Thread{
	
	/*public ThreadTest(){
		System.out.println("thread");
	}*/
	public void run(){
	System.out.println("all threads are accessed");
}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ThreadTest tt=new ThreadTest();
		Thread t1=new ThreadTest();
		t1.start();
		Thread t2=new ThreadTest();
		t2.start();
		
	}
}	