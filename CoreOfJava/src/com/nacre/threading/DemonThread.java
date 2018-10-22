package com.nacre.threading;
class Demon1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Demon Created");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DemonThread {

	public static void main(String[] args) throws InterruptedException {
		Demon1 d1=new Demon1();
		d1.setDaemon(true);//by default it is false
		d1.start();
		for(int i=0;i<=3;i++) {
			System.out.println("main Thread");
			Thread.sleep(1000);
			
		}
	}

}
