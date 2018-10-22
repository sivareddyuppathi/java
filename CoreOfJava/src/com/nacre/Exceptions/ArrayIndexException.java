package com.nacre.Exceptions;

public class ArrayIndexException {
	void checkedException() {
		try {
			int[] a=new int[5];
			a[10]=50;
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Please enter With in Size ");
		}
	}
	public static void main(String[] args) {
		new ArrayIndexException().checkedException();
	}

}
