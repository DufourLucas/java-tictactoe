package fr.iutvalence.java.exam.part4;

import java.io.FileNotFoundException;
import java.io.IOException;

import fr.iutvalence.java.exam.interfaces.DecisionMaker;
import fr.iutvalence.java.exam.interfaces.Display;
import fr.iutvalence.java.exam.part2.ConsoleDecisionMaker;
import fr.iutvalence.java.exam.part2.Player;
import fr.iutvalence.java.exam.part2.VoidDisplay;
import fr.iutvalence.java.exam.part3.ConsoleDisplay4;
import fr.iutvalence.java.exam.part3.RandomDecisionMaker;
import fr.iutvalence.java.exam.part3.TicTacToe4;

/**
 * Launcher of a 4x4 Tic-tac-toe game played twice: - fistly with a random and a
 * console player, storing turns in a file - secondly, by replaying from the
 * file
 * 
 * @author sebastienjean
 * 
 */
public class MainFileOutFileIn
{
	/**
	 * Application's main.
	 * 
	 * @param args
	 *            command-line arguments (none)
	 */
	public static void main(String[] args)
	{
		Display d1 = null;
		try
		{
			d1 = new TurnInfoFileDisplay("out.txt");
		}
		catch (IOException e)
		{
			System.err.println("Unable to access log file, exiting ...");
			System.exit(1);
		}
		Display d2 = new ConsoleDisplay4();

		DecisionMaker dm1 = new RandomDecisionMaker(4);
		DecisionMaker dm2 = new ConsoleDecisionMaker();

		Player p1 = new Player(d1, dm1);
		Player p2 = new Player(d2, dm2);

		new TicTacToe4(p1, p2).start();

		d1 = new VoidDisplay();

		TurnInfoFileDecisionMaker turnInfoFileDecisionMaker = null;
		try
		{
			turnInfoFileDecisionMaker = new TurnInfoFileDecisionMaker("out.txt");
		}
		catch (FileNotFoundException e)
		{
			System.err.println("Unable to access log file, exiting ...");
			System.exit(1);
		}

		dm1 = turnInfoFileDecisionMaker;
		dm2 = turnInfoFileDecisionMaker;

		p1 = new Player(d1, dm1);
		p2 = new Player(d2, dm2);

		new TicTacToe4(p1, p2).start();
	}

}
