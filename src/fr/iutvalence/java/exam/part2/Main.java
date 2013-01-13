package fr.iutvalence.java.exam.part2;

import fr.iutvalence.java.exam.interfaces.DecisionMaker;
import fr.iutvalence.java.exam.interfaces.Display;

/**
 * Tic-tac-toe game (first version) launcher.
 * 
 * @author sebastienjean
 * 
 */
public class Main
{
	/**
	 * Application's main.
	 * 
	 * @param args
	 *            command-line arguments (none)
	 */
	public static void main(String[] args)
	{
		Display d1 = new VoidDisplay();
		Display d2 = new ConsoleDisplay();

		DecisionMaker dm1 = new RandomDecisionMaker();
		DecisionMaker dm2 = new ConsoleDecisionMaker();

		Player p1 = new Player(d1, dm1);
		Player p2 = new Player(d2, dm2);

		new TicTacToe(p1, p2).start();
	}
}
