package com.nacre.string;

import java.util.regex.Pattern;

public class StringWordReverse {

	 static String wordrev(String rev){
		Pattern p=Pattern.compile("\\s");
		String[] temp=p.split(rev);
		String res="";
		for(int i=0;i<temp.length;i++)
		{
			if(i==temp.length-1)
			{
				res=temp[i]+res;
			}
			else
			{
				res=" "+temp[i]+res;
			}
			
		}
		return res;	
	}
	
	public static void main(String[] args) {
		String s1="sivareddy";
		System.out.println(wordrev(s1));
		String s2="siva";
		System.out.println(wordrev(s2));
	}
}
	
