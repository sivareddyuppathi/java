package com.nacre.threading;

class CounterThread extends Thread{
	String name;

	public CounterThread(String name) {
		//super();
		this.name = name;
	}
	public void run() {
		int count=0;
		while(true) {
		try {
			sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		if(count==5) 
			 count=0;
		System.out.println(name+""+count);
		
		}
	}
}
public class CounterThreadDemo {

	public static void main(String[] args) {
		CounterThread ct=new CounterThread("Thread1");
		ct.setPriority(10);
		CounterThread ct1=new CounterThread("Thread2");
		ct1.setPriority(1);
		ct1.start();
		ct.start();
	}
}
