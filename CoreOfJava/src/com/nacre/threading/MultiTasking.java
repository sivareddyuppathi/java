package com.nacre.threading;
class Theatre implements Runnable{
	String str;
	Theatre(String str){
		this.str=str;
	}
public void run() {
	for(int i=0;i<=5;i++) {
		System.out.println(str+" "+i);
	}
	try {
		Thread.sleep(3000);
	}catch(Exception e){
		e.getStackTrace();
	}
	}
}
public class MultiTasking {
	public static void main(String[] args) {
		Theatre obj=new Theatre("Take The Ticket");
		Theatre obj1=new Theatre("Show at Entry");
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		t1.start();
		/*try {
			t1.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}*/
		t2.start();	
		System.out.println("Sivareddy ");
	}

}
