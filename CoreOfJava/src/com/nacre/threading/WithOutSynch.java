package com.nacre.threading;

class Reverse implements Runnable{
	int avlBal=5000;
	int wantBal;
	public Reverse(int wantBal) {		
		this.wantBal = wantBal;
		System.out.println("AvlBal is :"+avlBal);
	}
	public void run() {
		if(avlBal>=wantBal){
			String name;
			name=Thread.currentThread().getName();
			System.out.println(wantBal+" Given to : "+ name);		
		try {
			Thread.sleep(3000);			
		}catch (Exception e) {
			e.getStackTrace();
		}
		}
		else {
			System.out.println("No Suficient Funds");			
		}
	}
}
public class WithOutSynch {
	public static void main(String[] args) {
		Reverse r=new Reverse(3000);
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.setName("Sivareddy");
		t2.setName("Siva Shanker");
		t1.start();
		t2.start();
		System.out.println("****************");
	}
}
