package fr.iutvalence.java.exam.part3;

import fr.iutvalence.java.exam.common.Coordinates;
import fr.iutvalence.java.exam.common.TicTacToeMark;
import fr.iutvalence.java.exam.part2.Player;

/**
 * 4x4 version of the Tic-tac-toe game.
 * 
 * @author sebastienjean
 * 
 */
public class TicTacToe4 extends TicTacToe
{

	/**
	 * Creates a new two-players 4x4 Tic-tac-toe game
	 * 
	 * @param p1
	 *            first player
	 * @param p2
	 *            second player
	 */
	public TicTacToe4(Player p1, Player p2)
	{
		super(p1, p2);
		this.cells = new TicTacToeMark[4][4];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				this.cells[i][j] = TicTacToeMark.EMPTY;
	}

	/**
	 * Checks if a player has won.
	 * 
	 * @param mark
	 *            the mark associated to the player
	 * @return <tt>true</tt> if the player has won, <tt>false</tt> if not.
	 */
	protected boolean checkVictory(TicTacToeMark mark)
	{
		for (int i = 0; i < 4; i++)
		{
			if ((this.cells[i][0] == this.cells[i][1]) && (this.cells[i][1] == this.cells[i][2])
					&& (this.cells[i][2] == this.cells[i][3]))
				if (this.cells[i][0] == mark)
					return true;
			if ((this.cells[0][i] == this.cells[1][i]) && (this.cells[1][i] == this.cells[2][i])
					&& (this.cells[2][i] == this.cells[3][i]))
				if (this.cells[0][i] == mark)
					return true;

		}
		if ((this.cells[0][0] == this.cells[1][1]) && (this.cells[1][1] == this.cells[2][2])
				&& (this.cells[2][2] == this.cells[3][3]))
			if (this.cells[0][0] == mark)
				return true;
		if ((this.cells[0][3] == this.cells[1][2]) && (this.cells[1][2] == this.cells[2][1])
				&& (this.cells[2][1] == this.cells[3][0]))
			if (this.cells[0][3] == mark)
				return true;
		return false;
	}

	/**
	 * @see fr.iutvalence.java.exam.part3.TicTacToe#checkCoordinates(fr.iutvalence.java.exam.common.Coordinates)
	 */
	protected boolean checkCoordinates(Coordinates c)
	{
		return ((c.getX() >= 1) && (c.getX() <= 4) && (c.getY() >= 1) && (c.getY() <= 4));
	}
}
