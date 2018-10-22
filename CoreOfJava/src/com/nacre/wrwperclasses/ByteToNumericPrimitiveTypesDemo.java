package com.nacre.wrwperclasses;

public class ByteToNumericPrimitiveTypesDemo {
	
		public static void main(String[] args) {
			
			Byte bt=new Byte((byte) 10);
			byte b=bt.byteValue();
			short s=bt.shortValue();
			int i=bt.intValue();
			long l=bt.longValue();
			double d=bt.doubleValue();
			float f=bt.floatValue();
			System.out.println(b+"\n"+s+"\n"+i+"\n"+l+"\n"+d+"\n"+f);
			System.out.println("==============");
			
			Double d1=new Double(100);
			byte b1=d1.byteValue();
			short s1=d1.shortValue();
			int i1=d1.intValue();
			long l1=d1.longValue();
			float f1=d1.floatValue();
			System.out.println(b1+"\n"+s1+"\n"+i1+"\n"+l1+"\n"+f1);
			
			
	}
}
