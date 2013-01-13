package fr.iutvalence.java.exam.part3;

import fr.iutvalence.java.exam.common.TicTacToeMark;

/**
 * 4x4 board console-based implementation of display.
 * 
 * @author sebastienjean
 * 
 */
public class ConsoleDisplay4 extends ConsoleDisplay
{

	/**
	 * Displays the board (4x4)
	 * 
	 * @param board
	 *            the board
	 */
	protected void displayBoard(TicTacToeMark[][] board)
	{
		String headerOrFooter = " --- --- --- ---\n";
		String line = "| 1 | 2 | 3 | 4 |\n";

		String result = headerOrFooter;
		for (int i = 0; i < 4; i++)
		{
			String temp = line;
			temp = temp.replace("1", "" + board[i][0]);
			temp = temp.replace("2", "" + board[i][1]);
			temp = temp.replace("3", "" + board[i][2]);
			temp = temp.replace("4", "" + board[i][3]);
			result = result + temp;
			result = result + headerOrFooter;
		}
		System.out.println(result);
	}
}
