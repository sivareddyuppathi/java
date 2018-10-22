package com.nacre.threading;

class MyThread extends Thread{
	public void run() {
		System.out.println("I am Hook functionality");
	}
}
public class HookThread
{
	public static void main(String[] args) 
	{
		MyThread mt=new MyThread();
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(mt);
		System.out.println(r.totalMemory());
		final long usedMem=r.totalMemory()-r.freeMemory();
		System.out.println(usedMem);
		System.out.println(r.availableProcessors());
		for(int i=0;i<=10;i++) 
		{
			System.out.println("main thread");
			if(i==6) 
			{
				System.exit(0);
			}
		}
		
	}
}
