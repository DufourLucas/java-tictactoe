package fr.iutvalence.java.exam.part2;

import java.util.Random;

import fr.iutvalence.java.exam.common.Coordinates;
import fr.iutvalence.java.exam.interfaces.DecisionMaker;

/**
 * Random implementation of decision maker
 * 
 * @author sebastienjean
 * 
 */
public class RandomDecisionMaker implements DecisionMaker
{
	/**
	 * RNG.
	 */
	private final Random random;

	/**
	 * Creates a new random decision maker.
	 */
	public RandomDecisionMaker()
	{
		this.random = new Random();
	}

	@Override
	public Coordinates getCoordinates()
	{
		int x = this.random.nextInt(3);
		int y = this.random.nextInt(3);
		return new Coordinates(x + 1, y + 1);
	}
}
