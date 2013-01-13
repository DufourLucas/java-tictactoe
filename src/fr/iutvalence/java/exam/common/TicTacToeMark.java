package fr.iutvalence.java.exam.common;

/**
 * Enumeration of Tic-tac-toe marks.
 * 
 * @author sebastienjean
 * 
 */
public enum TicTacToeMark
{
	/**
	 * No mark
	 */
	EMPTY,
	/**
	 * Cross mark
	 */
	X,
	/**
	 * Round mark
	 */
	O;

	/**
	 * @see java.lang.Enum#toString()
	 */
	public String toString()
	{
		switch (this)
		{
		case X:
			return "X";
		case O:
			return "O";
		default:
			return " ";
		}
	}
}
