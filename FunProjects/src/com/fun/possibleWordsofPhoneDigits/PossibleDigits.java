package com.fun.possibleWordsofPhoneDigits;

import java.util.Scanner;

public class PossibleDigits {
	
	public void ispossible() {		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Upto 10 Digits : ");
		int no=s.nextInt();
		for(int i=1;i<=9;i++) {
			if(i==1) {
				String s1="abc";
				for(int j=0;j<=2;j++) {
					char c1=s1.charAt(j);
					if(j>=0) {
						String s2="def";
						String s3="ghi";
						for(int k=0;k<=2;k++) {
							char c2=s2.charAt(k);
							for(int l=0;l<=2;l++) {
								char c3=s3.charAt(l);
								System.out.println(c1+" "+c2+" "+c3);
							}
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		new PossibleDigits().ispossible();;
		
	}
	
}
