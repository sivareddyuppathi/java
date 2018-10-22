package com.nacre.wrwperclasses;

public class ConvertIntToBinaryDemo {
public static void main(String[] args) {
	int i=+12;
	String s=Integer.toBinaryString(i);
	System.out.println(s);
	String s1=Integer.toHexString(i);
	System.out.println(s1);
	String s2=Integer.toOctalString(i);
	System.out.println(s2);
	
	}
}
