package com.nacre.oops;

class Super{
	
}

class Sub extends Super{
	void message() {
		System.out.println("message method");
	}
	
}

class CovParent{
	Super get() {
		System.out.println("super as return type ");
		return new Super();
		
	}
}

public class Covarent extends CovParent {
	
	Sub get() {
		System.out.println("sub as return type");
		return new Sub();
	}
	
	public static void main(String[] args) {
		new CovParent().get();
		new Covarent().get().message();
		
}
}
