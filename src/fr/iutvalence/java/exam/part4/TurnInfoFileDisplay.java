package fr.iutvalence.java.exam.part4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import fr.iutvalence.java.exam.common.TicTacToeMark;
import fr.iutvalence.java.exam.common.TurnInfo;
import fr.iutvalence.java.exam.part2.VoidDisplay;

/**
 * File-based implementation of display. Actually, this implementation displays
 * nothing but rather stores turns in a file.
 * 
 * @author sebastienjean
 * 
 */
public class TurnInfoFileDisplay extends VoidDisplay
{
	/**
	 * Path to the file where to store turns.
	 */
	private File path;

	/**
	 * Creates a new <tt>TurnInfoFileDisplay</tt> instance, storing turns in a
	 * specified file.
	 * 
	 * @param path
	 *            the path to the file where to store turns
	 * @throws IOException
	 *             if some writing error occur during file access
	 */
	public TurnInfoFileDisplay(String path) throws IOException
	{
		this.path = new File(path);
		this.path.createNewFile();
	}

	@Override
	public void displayTurn(TurnInfo turnInfo, TicTacToeMark[][] board)
	{
		PrintStream out = null;
		try
		{
			out = new PrintStream(new FileOutputStream(this.path, true));
		}
		catch (FileNotFoundException e)
		{
		}
		out.println(turnInfo);
		out.close();
	}
}
