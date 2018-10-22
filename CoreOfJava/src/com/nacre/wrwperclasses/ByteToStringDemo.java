package com.nacre.wrwperclasses;

public class ByteToStringDemo {
	ByteToStringDemo(Byte a){		
		
	}
	
	public static void main(String[] args) {
		Byte byte1=10;
		Byte b=new Byte(byte1);
		byte b1=b.byteValue();
		System.out.println(b1);
		String string=Byte.toString(b);
		System.out.println(string);
	}

}
