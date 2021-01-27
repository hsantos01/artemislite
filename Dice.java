/**
 * 
 */
package artemisLite;

import java.util.Random;

/**
 * @author Helder Santos
 *
 */
public class Dice {
	
	public Dice() {
		
	}
	
	public int diceRoll() {
		Random rand = new Random();
		
		return (rand.nextInt(6)+1);
		
	}

}
