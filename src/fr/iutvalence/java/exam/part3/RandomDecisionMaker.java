package fr.iutvalence.java.exam.part3;

import java.util.Random;

import fr.iutvalence.java.exam.common.Coordinates;
import fr.iutvalence.java.exam.interfaces.DecisionMaker;

/**
 * Random, size-independent, implementation of decision maker.
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
	 * Board size.
	 */
	private int size;

	/**
	 * Creates a new random decision maker, from a given board size.
	 * 
	 * @param size
	 *            board size.
	 */
	public RandomDecisionMaker(int size)
	{
		this.random = new Random();
		this.size = size;
	}

	@Override
	public Coordinates getCoordinates()
	{
		int x = this.random.nextInt(this.size);
		int y = this.random.nextInt(this.size);
		return new Coordinates(x + 1, y + 1);
	}
}
