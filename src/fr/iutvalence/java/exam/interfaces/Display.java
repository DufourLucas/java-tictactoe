package fr.iutvalence.java.exam.interfaces;

import fr.iutvalence.java.exam.common.TicTacToeMark;
import fr.iutvalence.java.exam.common.TurnInfo;

/**
 * General contract for displaying in-game information
 * 
 * @author sebastienjean
 * 
 */
public interface Display
{

	/**
	 * Displays a general message.
	 * 
	 * @param message
	 *            the message
	 */
	public void displayMessage(String message);

	/**
	 * Displays turn (board and brief).
	 * 
	 * @param turninfo
	 *            turn info
	 * @param board
	 *            the board
	 */
	public void displayTurn(TurnInfo turninfo, TicTacToeMark[][] board);

}
