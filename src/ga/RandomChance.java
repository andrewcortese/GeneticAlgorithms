package ga;
import java.util.Random;
public class RandomChance implements IRandomChance {

	public int rollDie(int sides)
	{
		Random rng = new Random();
		return (rng.nextInt(sides) + 1);
	}
	
	public int coinFlip()
	{
		return (rollDie(2) - 1);
	}
}
