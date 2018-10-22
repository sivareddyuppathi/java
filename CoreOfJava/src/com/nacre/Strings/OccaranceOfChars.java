package com.nacre.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccaranceOfChars {
	public static void main(String[] args) {
	//using map interface .......	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string : ");
		String str = sc.next();
		int len = str.length();
		Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(str.length(), 26));
		for (int i = 0; i < len; ++i){
		    char charAt = str.charAt(i);
		    if (!numChars.containsKey(charAt)) {
		        numChars.put(charAt, 1);
		    }
		    else   {
		        numChars.put(charAt, numChars.get(charAt) + 1);
		    }
		}
		System.out.println("Number of occarances of chars : ");
		System.out.println(numChars);
		
	//using loops .......	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str1 = scan.nextLine();
		int[] count = new int[255];
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++;
		}
		char[] ch = new char[str1.length()];
		for (int i = 0; i < str1.length(); i++) {
			ch[i] = str1.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				if (str1.charAt(i) == ch[j])
					find++;
			}
			if (find == 1) {
				System.out.println("Number of Occurrence of " + str1.charAt(i) + " letter is:" + count[str.charAt(i)]);
			}
		}
	}
}

