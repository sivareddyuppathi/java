package com.nacre.threading;

public class CurrentThreadDemo1 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current Thread :"+t);
		t.setName("main Thread");
		System.out.println(" it is the name of the thread after name change:"+t.getName());
		try {
			for(int i=5;i>0;i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println("main Thread is Intrupted");
		}
	}

}
