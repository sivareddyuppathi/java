package com.nacre.oops;

class Parent123 {
	
	Parent123(){
		//super();  it is related to object class
		System.out.println("parent");
		
	}
	
public static class child extends Parent123{
	
	/* child(){
	 * 		super();// in this compiler generates default cons and it generates super as first statement
	 * }
	*/
	
	
	public static void main(String[] args) {
			new child();
		

	}
}
}
