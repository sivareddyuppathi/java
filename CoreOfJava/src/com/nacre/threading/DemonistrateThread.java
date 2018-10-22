package com.nacre.threading;

class Clicker extends Thread{
	int click;
	Thread t;
	private volatile boolean running=true;
	public Clicker(int p) {
		
		t=new Thread();
		t.setPriority(p);
		
	}
	public void run() {
		while (running) {
			click++;//Increment the variable click.
			} 
		}
	/*public void stop(){ 
		 //set the variable ‘running’ as false. 
		running =false; 
	}*/
	public void start() { 
		 //Start the thread ‘t’; 
		t.start();
		} 
		 
	
	
	
}
public class DemonistrateThread {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
				 t.setPriority(Thread.MAX_PRIORITY);
		Clicker hi=new Clicker(Thread.NORM_PRIORITY+2);
		Clicker lo=new Clicker(Thread.NORM_PRIORITY-2);
		hi.start();
		lo.start();
		try {
			Thread.sleep(1000);
			
		}
		catch(Exception e){
			System.out.println("Main Thread Intrupted");
		}
		hi.stop();
		lo.stop();
		try {
			hi.t.join();
			lo.t.join();
		}
		catch(InterruptedException s){
			System.out.println("InterruptedException caught");			
		}
		System.out.println("Low-priority thread: "+ lo.click);
		System.out.println("High--priority thread: "+ hi.click);
	}

}
