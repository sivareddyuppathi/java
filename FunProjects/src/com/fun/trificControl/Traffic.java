package com.fun.trificControl;

public class Traffic extends Thread {
	
	public void run() {
		red();
		yellow();
		green();
	}
	
	void red() {
		try {
			Thread.sleep(5000);
			System.out.println("Stop");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	void yellow() {
		try {
			Thread.sleep(500);
			System.out.println("Ready to Go");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	void green() {
		System.out.println("Go");		
	}

}
