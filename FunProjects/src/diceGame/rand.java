package diceGame;

import java.util.Random;

public class rand {
	

	public static void main(String[] args) {
		
		System.out.println(rollDice());
	}
	static int rollDice()
    {
        Random randomNumberGenerator = new Random();
       int result = randomNumberGenerator.nextInt(6) ;
        return result;
    }


}
