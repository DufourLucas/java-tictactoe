package fr.iutvalence.java.exam.common;

/**
 * Representation of a turn.
 * 
 * @author sebastienjean
 * 
 */
public class TurnInfo
{
	/**
	 * The number of the player.
	 */
	private final int playerNumber;

	/**
	 * The coordinates where mark has been placed.
	 */
	private final Coordinates coords;

	/**
	 * End of turn status (in progress, won, draw).
	 */
	private final TurnResultEnum status;

	/**
	 * Creates a new <tt>TurnInfo</tt> instance, given player number,
	 * coordinates and status.
	 * 
	 * @param playerNumber
	 *            the player number
	 * @param coords
	 *            the coordinates
	 * @param status
	 *            end of turn status
	 */
	public TurnInfo(int playerNumber, Coordinates coords, TurnResultEnum status)
	{
		this.playerNumber = playerNumber;
		this.coords = coords;
		this.status = status;
	}

	/**
	 * Returns player number.
	 * 
	 * @return player number
	 */
	public int getPlayerNumber()
	{
		return this.playerNumber;
	}

	/**
	 * Returns coordinates.
	 * 
	 * @return coordinates
	 */
	public Coordinates getCoords()
	{
		return this.coords;
	}

	/**
	 * Returns end of turn status.
	 * 
	 * @return end of turn status
	 */
	public TurnResultEnum getStatus()
	{
		return this.status;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "" + this.playerNumber + " " + this.coords.getX() + "-" + this.coords.getY() + " " + this.status;
	}
}
