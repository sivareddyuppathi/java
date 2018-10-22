package com.nacre.Collections_1;

import java.util.ArrayList;

import java.util.Collections;
//import java.util.Arrays;
import java.util.List;

class BatsmenName{
	String bName;
     int bRuns;
	public BatsmenName(String bName, int bRuns) {
		this.bName = bName;
		this.bRuns = bRuns;
	}
	@Override
	public String toString() {
		return "BatsmenName : " + bName +"      " +" Runs : " + bRuns;
	}
	public void addBatsMens() {
		
	}
	
}
public class BatsmenRuns {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<BatsmenName> a=new ArrayList<BatsmenName>();
		a.add(new BatsmenName("Dhawan",10));	
		a.add(new BatsmenName("Rohit",264));
		a.add(new BatsmenName("Kohli",64));
		a.add(new BatsmenName("Dhoni",7));
		a.add(new BatsmenName("Pandya",72));
		a.add(new BatsmenName("Jadhav",47));
		a.add(new BatsmenName("Kuldip",48));
		a.add(new BatsmenName("Chahal",9));
		a.add(new BatsmenName("Bhuvi",18));
		a.add(new BatsmenName("Bhumra",28));
		
		int totalRuns=0;
	for(BatsmenName b:a) {
		System.out.println(b);
		totalRuns+=b.bRuns;
	}
	System.out.println("Total Score : "+totalRuns);
	System.out.println("\nTop 3 Scorers :  \n");
	
List<HighScore> list1=new ArrayList<HighScore>();
	for(BatsmenName z:a) {
		if(z.bRuns>=50) {
			list1.add(new HighScore(z.bName,z.bRuns));
		}
	}	
	Collections.sort(list1);
	
	for (HighScore highScore : list1) {
		System.out.println(highScore);
	}	
	System.out.println("\nRemaining Batsmens Scores :  \n ");
	
	List<ReminingScore> list2=new ArrayList<ReminingScore>();
	for(BatsmenName k:a) {
		if(k.bRuns<50) {
			list2.add(new ReminingScore(k.bName,k.bRuns));
		}
	}	
	Collections.sort(list2);
	
	for (ReminingScore remainingscore : list2) {
		System.out.println(remainingscore);
	}	
	
	}   
}
