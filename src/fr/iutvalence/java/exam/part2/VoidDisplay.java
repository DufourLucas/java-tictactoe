package fr.iutvalence.java.exam.part2;

import fr.iutvalence.java.exam.common.TicTacToeMark;
import fr.iutvalence.java.exam.common.TurnInfo;
import fr.iutvalence.java.exam.interfaces.Display;

/**
 * Void implementation of display (does nothing)
 * 
 * @author sebastienjean
 * 
 */
public class VoidDisplay implements Display
{

	@Override
	public void displayMessage(String string)
	{
	}

	@Override
	public void displayTurn(TurnInfo turnInfo, TicTacToeMark[][] board)
	{
	}
}
