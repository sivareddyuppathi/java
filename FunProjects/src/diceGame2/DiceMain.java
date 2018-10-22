package diceGame2;

import java.util.Scanner;

class player{
	String pName;  //playerName
	int age;
	int noOfPlayers;
	public void isPlayer() {
	   System.out.println("Enter 1st Player Name : ");
	       Scanner sc=new Scanner(System.in);
	       pName=sc.nextLine();
	       System.out.println("1st Player Age : ");
	       age=sc.nextInt();
	  System.out.println("Enter 2nd Player Name : ");     
	       pName=sc.nextLine();
	       System.out.println("2nd Player Age : si");
	       age=sc.nextInt();
	}
	public void isNuOfPlayers() {
		System.out.println("Number of players played : ");
		  Scanner s=new Scanner(System.in);
		  noOfPlayers=s.nextInt();
		  for(int i=0;i<=noOfPlayers;i++) {
			  
		  }
	}
}
public class DiceMain {
	public static void main(String[] args) {
		System.out.println("Welcome To Dice Game... ");
			new player().isPlayer();
			new player().isNuOfPlayers();
			
		}
}
