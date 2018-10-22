package com.nacre.threading;

public class CurrentThreadDemo extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			printMyName();
		}
	}

	public void printMyName() {
		System.out.println("The Thread NAme Is : " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		CurrentThreadDemo ttsn = new CurrentThreadDemo();
		ttsn.setName("Created One");
		ttsn.start();
		Thread t2 = currentThread();
		t2.setName("Main One");
		for (int i = 0; i < 5; i++) {

			ttsn.printMyName();
		}

	}

}
