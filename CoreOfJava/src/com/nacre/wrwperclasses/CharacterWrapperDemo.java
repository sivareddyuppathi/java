package com.nacre.wrwperclasses;

public class CharacterWrapperDemo {
	public static void main(String[] args) {
		char[] a= {'a','b','c','d','1','a',' ','S',97};
		 for(int i=0;i<a.length;i++){ 
//			 boolean b=Character.isDigit(a[i]);
//			 System.out.println(b);
			 System.out.println(Character.isDigit(a[i]));
			 System.out.println(Character.isWhitespace(a[i]));
			 System.out.println(Character.isLetter(a[i]));
			 System.out.println(Character.isLowerCase(a[i]));
			 System.out.println(Character.isUpperCase(a[i]));
			 System.out.println(Character.isMirrored(a[i]));
			 System.out.println("==============================");
			 boolean res = Character.isDigit(a[i])?true:false;
			 System.out.println(res);
		 }
		// System.out.println(Character.isDigit(b));		
	}
}
