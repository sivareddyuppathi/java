package diceGame1;

//import com.sun.deploy.util.Waiter;

public class DiceGame {
	
	public static void main(String[] args) throws InterruptedException {
		
		Player player=new Player();
		player.setName("ajay");
		DiceConditions g1=new DiceConditions(player);
		
		player.setName("vijay");
		DiceConditions g2=new DiceConditions(player);
g1.setName("Shiva");

g2.setName("Siva");

g1.start();

Thread.sleep(1000);

g2.start();
	}
}
