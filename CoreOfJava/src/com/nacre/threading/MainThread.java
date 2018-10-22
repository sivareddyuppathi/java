package com.nacre.threading;

class NewThread implements Runnable{
	Thread t;
	public NewThread(){
		t=new Thread(this,"Demo Thread");
		System.out.println("Child Thread: "+t);
		t.start();
	}
	@Override
	public void run()
	{
		try 
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child Thread: "+i);
				Thread.sleep(5000);
			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Intrupted");
		}
		System.out.println("Exiting Child Thred");
	}	
}

public class MainThread {
	public static void main(String[] args) {
		new NewThread();
		
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
			
		}catch(InterruptedException e) {
			System.out.println("Main Intrupted");
		}
		System.out.println("Exiting Main Thred");
	}
	

}
