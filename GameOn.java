/**
 * 
 */
package artemisLite;

import java.util.Scanner;

/**
 * @author Helder Santos
 *
 */
public class GameOn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int tileCounter = 0;
		String playOnChoice;
		
		Scanner scanner = new Scanner(System.in);
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		boolean playOn = true;
		while(playOn) {
		
		int totalDiceRoll = d1.diceRoll()+d2.diceRoll();
		System.out.println("Your dice roll is "+ totalDiceRoll);
		
		if(tileCounter + totalDiceRoll < 11) {
			tileCounter += totalDiceRoll;
		}else {
			tileCounter += totalDiceRoll;
			tileCounter -=10;
			if(tileCounter>10) {
				tileCounter -=10;
			}
		}
		
		System.out.println("Your are on tile " + tileCounter);
		
		System.out.println("Do you want to keep playing? yes/no");
		playOnChoice =scanner.next();
		
		if(playOnChoice.equalsIgnoreCase("no")) {
			playOn = false;
		}
		
		
		}
		System.out.println("Thanks for playing");
		scanner.close();
		
	}

}
