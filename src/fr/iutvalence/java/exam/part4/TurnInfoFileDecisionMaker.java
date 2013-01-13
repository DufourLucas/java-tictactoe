package fr.iutvalence.java.exam.part4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import fr.iutvalence.java.exam.common.Coordinates;
import fr.iutvalence.java.exam.interfaces.DecisionMaker;

/**
 * Implementation of a decision maker (supposed to be shared among players) able
 * to replay turns stored in a file.
 * 
 * @author sebastienjean
 * 
 */
public class TurnInfoFileDecisionMaker implements DecisionMaker
{
	/**
	 * A bufferedReader allowing to read turns from file.
	 */
	private final BufferedReader fileReader;

	/**
	 * Creates a new <tt>TurnInfoFileDecisionMaker</tt> instance, replaying
	 * turns form a specified file.
	 * 
	 * @param path
	 *            the path to the file to replay
	 * @throws FileNotFoundException
	 *             if file is not found.
	 */
	public TurnInfoFileDecisionMaker(String path) throws FileNotFoundException
	{
		this.fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
	}

	/**
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable
	{
		super.finalize();
		this.fileReader.close();
	}

	/**
	 * @see fr.iutvalence.java.exam.interfaces.DecisionMaker#getCoordinates()
	 */
	@Override
	public Coordinates getCoordinates()
	{
		String line = null;
		try
		{
			line = this.fileReader.readLine();
		}
		catch (IOException e1)
		{
			line = null;
		}
		if (line == null)
			return null;
		int offset = line.indexOf('-');
		if (offset == -1)
			return null;
		try
		{
			int x = Integer.parseInt(line.substring(offset - 1, offset));
			int y = Integer.parseInt(line.substring(offset + 1, offset + 2));
			return new Coordinates(x, y);
		}
		catch (RuntimeException e)
		{
			return null;
		}
	}
}
