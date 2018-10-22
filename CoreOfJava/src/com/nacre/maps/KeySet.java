package com.nacre.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySet {

public static void main(String[] args) {
	Map<Integer,String>it=new HashMap<Integer,String>();
	it.put(1,"one");
	it.put(5,"Five");
	it.put(33,"ThyrtyThree");
	System.out.println(it);
	Set<Integer>s= it.keySet();;
	for(int i : s)
	{
		System.out.println(i +"-"+it.get(i));
	}
	
	}
}
