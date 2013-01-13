package fr.iutvalence.java.exam.interfaces;

import fr.iutvalence.java.exam.common.Coordinates;

/**
 * General contract for retrieving coordinates where to play.
 * 
 * @author sebastienjean
 * 
 */
public interface DecisionMaker
{
	/**
	 * Returns the coordinates where to play
	 * 
	 * @return the coordinates where to play
	 */
	public Coordinates getCoordinates();

}
