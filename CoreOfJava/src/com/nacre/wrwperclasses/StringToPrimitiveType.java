package com.nacre.wrwperclasses;

public class StringToPrimitiveType {

	public static void main(String[] args) {
		String str="9000";
		try {
		byte b= Byte.parseByte(str);
		System.out.println(b);
		
		}catch(NumberFormatException ne) {
			System.out.println("Byte length Overloddaed");
		}
		int i=Integer.parseInt(str);
		float f=Float.parseFloat(str);
		double d=Double.parseDouble(str);
		long l=Long.parseLong(str);
		short s=Short.parseShort(str);
		boolean b1=Boolean.parseBoolean(str);
		char[] c=str.toCharArray();
		System.out.println(i+"\n"+f+"\n"+d+"\n"+l+"\n"+s+"\n"+b1+"\n"+c);
		System.out.println(c);
		
	}

}