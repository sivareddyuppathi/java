package diceGame;

import java.util.Random;

public class DiceConditions {
	  private static final int numberOfSides = 6;
	  
	    int rollDice()
	    {
	        Random randomNumberGenerator = new Random();
	       int result = randomNumberGenerator.nextInt(numberOfSides) + 1;
	        return result;
	    }
	    
	/*public int roll() {
		int num=(int)(Math.random()*6)+1;
		return num;
		return (int)(Math.random()*6)+1;		
	}	*/
	
}
