package com.nacre.Exceptions2;

public class InterruptedException {

	public static void main(String[] args) {
		final Thread thread=Thread.currentThread();
		Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(500);
					thread.interrupt();	
				
					} catch (Exception e) {						
						System.out.println("dfgg");						
						} 
							
			}
		});
		thread2.start();
	}

}
