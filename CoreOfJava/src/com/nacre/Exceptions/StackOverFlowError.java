package com.nacre.Exceptions;

public class StackOverFlowError {
	int i=0;
	void display1() {
		i++;
		if(i==4)
		System.out.println("siva");
	display1();
	}
	public static void main(String[] args) {
		new StackOverFlowError().display1();
	}
}
