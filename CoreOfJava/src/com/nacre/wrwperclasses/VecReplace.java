package com.nacre.wrwperclasses;

import java.util.Vector;

public class VecReplace {
	public static void main(String[] args) {
		
		Vector<Integer> a=new Vector<Integer>();
		a.add(0,new Integer(100));
		a.add(1,new Integer(200));
		a.add(2,new Integer(400));
		a.add(3,new Integer(800));	
		System.out.println(a);		
		System.out.println(a.size());
		a.set(1,8);
		System.out.println(a);		
		System.out.println(a.get(1));
		 
		
	}

}
