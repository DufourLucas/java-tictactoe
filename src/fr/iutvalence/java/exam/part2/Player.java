package fr.iutvalence.java.exam.part2;

import fr.iutvalence.java.exam.interfaces.DecisionMaker;
import fr.iutvalence.java.exam.interfaces.Display;

/**
 * Tic-tac-toe game player, with associated display and decison making.
 * 
 * @author sebastienjean
 * 
 */
public class Player
{
	/**
	 * Display.
	 */
	private final Display display;

	/**
	 * Decision maker.
	 */
	private final DecisionMaker decisionMaker;

	/**
	 * Creates a new <tt>Player</tt> instance, from given display and decision
	 * maker.
	 * 
	 * @param display
	 *            the display
	 * @param decisionMaker
	 *            the decision maker
	 */
	public Player(Display display, DecisionMaker decisionMaker)
	{
		super();
		this.display = display;
		this.decisionMaker = decisionMaker;
	}

	/**
	 * Returns the display.
	 * 
	 * @return the display
	 */
	public Display getDisplay()
	{
		return this.display;
	}

	/**
	 * Returns the decision maker.
	 * 
	 * @return the decision maker
	 */
	public DecisionMaker getDecisionMaker()
	{
		return this.decisionMaker;
	}
}
