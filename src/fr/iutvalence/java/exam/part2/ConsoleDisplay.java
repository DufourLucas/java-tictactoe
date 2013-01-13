package fr.iutvalence.java.exam.part2;

import fr.iutvalence.java.exam.common.TicTacToeMark;
import fr.iutvalence.java.exam.common.TurnInfo;
import fr.iutvalence.java.exam.interfaces.Display;

/**
 * Console-based implementation of display.
 * 
 * @author sebastienjean
 * 
 */
public class ConsoleDisplay implements Display
{

	@Override
	public void displayMessage(String message)
	{
		System.out.println(message);
	}

	@Override
	public void displayTurn(TurnInfo turnInfo, TicTacToeMark[][] board)
	{
		System.out.println("Player " + turnInfo.getPlayerNumber() + " places his mark on " + turnInfo.getCoords());

		String headerOrFooter = " --- --- ---\n";
		String line = "| 1 | 2 | 3 |\n";

		String result = headerOrFooter;
		for (int i = 0; i < 3; i++)
		{
			String temp = line;
			temp = temp.replace("1", "" + board[i][0]);
			temp = temp.replace("2", "" + board[i][1]);
			temp = temp.replace("3", "" + board[i][2]);
			result = result + temp;
			result = result + headerOrFooter;
		}
		System.out.println(result);
		switch (turnInfo.getStatus())
		{
		case WON:
			System.out.println("Player " + turnInfo.getPlayerNumber() + " wins");
			break;
		case DRAW:
			System.out.println("Draw game");
			break;
		default:
			break;
		}
	}
}
