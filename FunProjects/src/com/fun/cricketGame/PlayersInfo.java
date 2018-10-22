package com.fun.cricketGame;

import java.util.Random;

public class PlayersInfo extends Thread {
	String name;
	int runs;
	double overs;
	public boolean outCondition(int ball)
	{
		int[] outList= {4,7,13,15,21,29,30,36,42,45};
		int luckyball = new Random().nextInt(50);
		System.out.println();
		return false;
	}
	@Override
	
	public void run() {
		int count = 0;
		while(true) {
			
		int rand=(int)(Math.random()*7);
		System.out.println(rand);
		int r=rand;
		if(rand==0) {
			count++;
			if(count==3) {
				break;
			}			
		}
		else
			count=0;			
		}		
	}
	
	
	
	
}
