package fr.iutvalence.java.exam.part4;

import java.util.List;

import fr.iutvalence.java.exam.common.Coordinates;
import fr.iutvalence.java.exam.common.TurnInfo;
import fr.iutvalence.java.exam.interfaces.DecisionMaker;

/**
 * Implementation of a decision maker (supposed to be shared among players) able
 * to replay turns stored in a collection.
 * 
 * @author sebastienjean
 * 
 */
public class TurnInfoCollectionDecisionMaker implements DecisionMaker
{
	/**
	 * Game to replay, as a collection of stored turns.
	 */
	private final List<TurnInfo> turnInfos;

	/**
	 * Created a new <tt>TurnInfoCollectionDecisionMaker</tt> instance,
	 * replaying a given collection of turns.
	 * 
	 * @param turnInfos
	 *            the collectio of turns to replay
	 */
	public TurnInfoCollectionDecisionMaker(List<TurnInfo> turnInfos)
	{
		this.turnInfos = turnInfos;
	}

	/**
	 * @see fr.iutvalence.java.exam.interfaces.DecisionMaker#getCoordinates()
	 */
	@Override
	public Coordinates getCoordinates()
	{
		TurnInfo turnInfo = this.turnInfos.remove(0);
		if (turnInfo == null)
			return null;
		return turnInfo.getCoords();
	}
}
