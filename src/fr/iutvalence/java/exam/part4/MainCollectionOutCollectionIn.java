package fr.iutvalence.java.exam.part4;

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
 * console player, storing turns in a collection - secondly, by replaying from
 * the collection
 * 
 * @author sebastienjean
 * 
 */
public class MainCollectionOutCollectionIn
{
	/**
	 * Application's main.
	 * 
	 * @param args
	 *            command-line arguments (none)
	 */
	public static void main(String[] args)
	{
		Display d1 = new TurnInfoCollectionDisplay();
		Display d2 = new ConsoleDisplay4();

		DecisionMaker dm1 = new RandomDecisionMaker(4);
		DecisionMaker dm2 = new ConsoleDecisionMaker();

		Player p1 = new Player(d1, dm1);
		Player p2 = new Player(d2, dm2);

		new TicTacToe4(p1, p2).start();

		TurnInfoCollectionDecisionMaker turnInfoCollectionDecisionMaker = new TurnInfoCollectionDecisionMaker(
				((TurnInfoCollectionDisplay) d1).getTurns());

		d1 = new VoidDisplay();
		dm1 = turnInfoCollectionDecisionMaker;
		dm2 = turnInfoCollectionDecisionMaker;

		p1 = new Player(d1, dm1);
		p2 = new Player(d2, dm2);

		new TicTacToe4(p1, p2).start();
	}
}
