package com.nacre.threading;

class NewThread3 implements Runnable {
	String name;
	Thread t;
	
	NewThread3(String threadName) {
		threadName=name;
		t = new Thread(this,threadName);
		t.start();
		
	}

	public void run() {
		
	}
}

public class DemoJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
