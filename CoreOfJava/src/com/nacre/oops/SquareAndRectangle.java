package com.nacre.oops;

interface ObjectItem{
	
	public abstract  double area();
	public abstract double perimeter();
	
}

class Square implements ObjectItem  {
	int a = 5;
	
	public double area() {
	
		return a*a;		
	}
	public double perimeter() {
				
		return 4*a;
		
	}
	
}
class Rectangle implements ObjectItem {
	
	int w=4;
	int l=5;
	
	public double area() {
		
		return w*l;
	}
	
	public  double perimeter() {
		
		return 2*(l+w);				
	}
}

public class SquareAndRectangle {
	public static void main(String[] args) {
		
		ObjectItem ob = new Square();
		System.out.println(ob.area());
		System.out.println(ob.perimeter());
		ob = new Rectangle();
		System.out.println(ob.area());
		System.out.println(ob.perimeter());
		
	}
}
