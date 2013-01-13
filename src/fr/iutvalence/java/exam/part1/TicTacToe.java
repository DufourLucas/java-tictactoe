package fr.iutvalence.java.exam.part1;

import java.util.Random;

import fr.iutvalence.java.exam.common.Coordinates;
import fr.iutvalence.java.exam.common.InvalidCoordinatesException;
import fr.iutvalence.java.exam.common.TicTacToeMark;

/**
 * 
 * First version of the tic-tac-toe game. Players are randomized, output on
 * console.
 * 
 * @author sebastienjean
 * 
 */
public class TicTacToe
{
	/**
	 * Tic-tic-toe board.
	 */
	private TicTacToeMark[][] cells;

	/**
	 * Creation of a new game.
	 */
	public TicTacToe()
	{
		this.cells = new TicTacToeMark[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				this.cells[i][j] = TicTacToeMark.EMPTY;
	}

	/**
	 * Game loop.
	 */
	public void start()
	{
		Random rng = new Random();
		for (int turn = 0; turn < 9; turn++)
		{
			TicTacToeMark mark = TicTacToeMark.X;
			if (turn % 2 == 1)
				mark = TicTacToeMark.O;

			Coordinates coords = null;
			while (true)
			{
				int x = rng.nextInt(3);
				int y = rng.nextInt(3);
				coords = new Coordinates(x + 1, y + 1);
				try
				{
					this.setMarkAt(coords, mark);
				}
				catch (InvalidCoordinatesException e)
				{
					continue;
				}
				break;
			}
			System.out.println("Player " + ((turn % 2) + 1) + " places his mark on " + coords);
			System.out.println(this);

			if (this.checkVictory(mark))
			{
				System.out.println("Player " + ((turn % 2) + 1) + " wins");
				return;
			}
		}
		System.out.println("Draw game");
	}

	/**
	 * Checks if a player has won.
	 * 
	 * @param mark
	 *            the mark associated to the player
	 * @return <tt>true</tt> if the player has won, <tt>false</tt> if not.
	 */
	private boolean checkVictory(TicTacToeMark mark)
	{
		for (int i = 0; i < 3; i++)
		{
			if ((this.cells[i][0] == this.cells[i][1]) && (this.cells[i][1] == this.cells[i][2]))
				if (this.cells[i][0] == mark)
					return true;
			if ((this.cells[0][i] == this.cells[1][i]) && (this.cells[1][i] == this.cells[2][i]))
				if (this.cells[0][i] == mark)
					return true;
		}
		if ((this.cells[0][0] == this.cells[1][1]) && (this.cells[1][1] == this.cells[2][2]))
			if (this.cells[0][0] == mark)
				return true;
		if ((this.cells[0][2] == this.cells[1][1]) && (this.cells[1][1] == this.cells[2][0]))
			if (this.cells[0][2] == mark)
				return true;
		return false;
	}

	/**
	 * Checks if coordinates are not out of bounds.
	 * 
	 * @param c
	 *            the coordinates
	 * @return <tt>true</tt> ic coordinates are valid, <tt>false</tt> if they
	 *         are out of bounds.
	 */
	private boolean checkCoordinates(Coordinates c)
	{
		return ((c.getX() >= 1) && (c.getX() <= 3) && (c.getY() >= 1) && (c.getY() <= 3));
	}

	/**
	 * Places a mark at given coordinates.
	 * 
	 * @param c
	 *            the coordinates
	 * @param mark
	 *            the mark
	 * @throws InvalidCoordinatesException
	 *             if coordinates are out of bounds or if there is already a
	 *             mark at given coordinates
	 */
	private void setMarkAt(Coordinates c, TicTacToeMark mark) throws InvalidCoordinatesException
	{
		if (!this.checkCoordinates(c))
			throw new InvalidCoordinatesException();

		if (this.cells[c.getX() - 1][c.getY() - 1] != TicTacToeMark.EMPTY)
			throw new InvalidCoordinatesException();

		this.cells[c.getX() - 1][c.getY() - 1] = mark;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String headerOrFooter = " --- --- ---\n";
		String line = "| 1 | 2 | 3 |\n";

		String result = headerOrFooter;
		for (int i = 0; i < 3; i++)
		{
			String temp = line;
			temp = temp.replace("1", "" + this.cells[i][0]);
			temp = temp.replace("2", "" + this.cells[i][1]);
			temp = temp.replace("3", "" + this.cells[i][2]);
			result = result + temp;
			result = result + headerOrFooter;
		}
		return result;
	}
}
