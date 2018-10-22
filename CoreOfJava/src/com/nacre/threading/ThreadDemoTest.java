package com.nacre.threading;

class ThreadDemo extends Thread{
	private String firstName;
	private String secondName;
	private long  aWhile;
	public ThreadDemo(String firstName, String secondName, long aWhile) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.aWhile = aWhile;
	} 
	public void run(){
		try {
			while(true){
				System.out.println(firstName);
				Thread.sleep(2000);
				System.out.println(secondName);				
			}			
		}catch (Exception e) {
			e.getStackTrace();
		}		
	}	
}
public class ThreadDemoTest {

	public static void main(String[] args) {
		Thread t=new ThreadDemo("siva","reddy",600);
		Thread t1=new ThreadDemo("vijay","shiva",800);
		Thread t2=new ThreadDemo("vishnu","jho",700);
		System.out.println("**************************");
		t.start();
		t1.start();
		t2.start();
	}
}
