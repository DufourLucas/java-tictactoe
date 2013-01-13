package fr.iutvalence.java.exam.part3;

import fr.iutvalence.java.exam.interfaces.DecisionMaker;
import fr.iutvalence.java.exam.interfaces.Display;
import fr.iutvalence.java.exam.part2.ConsoleDecisionMaker;
import fr.iutvalence.java.exam.part2.Player;
import fr.iutvalence.java.exam.part2.VoidDisplay;

/**
 * Tic-tac-toe game (4x4 version) launcher.
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
		Display d2 = new ConsoleDisplay4();

		DecisionMaker dm1 = new RandomDecisionMaker(4);
		DecisionMaker dm2 = new ConsoleDecisionMaker();

		Player p1 = new Player(d1, dm1);
		Player p2 = new Player(d2, dm2);

		new TicTacToe4(p1, p2).start();
	}
}
