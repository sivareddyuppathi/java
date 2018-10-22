package com.nacre.oops;

class SuperClass{
	
	SuperClass(){
		System.out.println("o-aurg ");
	}
	SuperClass(int a){
		this();
		System.out.println("1-aurg");
	}
	SuperClass(int b, int c){
		this(10);
		System.out.println("2-aurg ");	
	}	
}

public class SubClass extends SuperClass {
	SubClass(){
		 super(10,20);
		 System.out.println("child 0-aurg");
		 		
		}
		SubClass(int z){
			this();
			System.out.println("child 1- aurg");
					
		}
		SubClass(int x, int y){
			this(10);
			System.out.println("child 2- aurg");
			
		}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		SubClass sc=new SubClass(20,30);

	}

}

