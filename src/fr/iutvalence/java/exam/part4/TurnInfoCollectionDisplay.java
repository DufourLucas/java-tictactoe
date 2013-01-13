package fr.iutvalence.java.exam.part4;

import java.util.LinkedList;
import java.util.List;

import fr.iutvalence.java.exam.common.TicTacToeMark;
import fr.iutvalence.java.exam.common.TurnInfo;
import fr.iutvalence.java.exam.part2.VoidDisplay;

/**
 * Collection-based implementation of display. Actually, this implementation
 * displays nothing but rather stores turns in a collection.
 * 
 * @author sebastienjean
 * 
 */
public class TurnInfoCollectionDisplay extends VoidDisplay
{
	/**
	 * The collection where to store turns.
	 */
	private final List<TurnInfo> turns;

	/**
	 * Creates a new <tt>TurnInfoCollectionDisplay</tt> instance.
	 */
	public TurnInfoCollectionDisplay()
	{
		this.turns = new LinkedList<TurnInfo>();
	}

	/**
	 * @see fr.iutvalence.java.exam.part2.VoidDisplay#displayTurn(fr.iutvalence.java.exam.common.TurnInfo,
	 *      fr.iutvalence.java.exam.common.TicTacToeMark[][])
	 */
	@Override
	public void displayTurn(TurnInfo turnInfo, TicTacToeMark[][] board)
	{
		this.turns.add(turnInfo);
	}

	/**
	 * Returns the collection of stored turns.
	 * 
	 * @return the collection of stored turns
	 */
	public List<TurnInfo> getTurns()
	{
		return this.turns;
	}
}
