
public interface IEvent {

	/**
	 * adds laps to get total laps
	 * @return sum of laps
	 */
	public double pointsEarned();
	
	/**
	   * multiplies penalties to get total score
	   * taken off by penalties
	   * @return penalties points
	   */
	public double getPenalties();
	
}
