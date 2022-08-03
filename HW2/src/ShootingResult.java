import java.util.LinkedList;

public class ShootingResult implements IEvent {

	LinkedList<ShootingRound> rounds;

	public ShootingResult(LinkedList<ShootingRound> rounds) {
		this.rounds = rounds;
	}

	/**
	 * adds laps to get total laps
	 * @return sum of laps
	 */
	public double pointsEarned() {
		double total = 0;
		if (rounds.isEmpty()) {
			return 0;
		} else
			for (ShootingRound l : rounds) {
				total = l.targetsHit + total;
			}
		return total;
	}

	
	/**
	   * multiplies penalties to get total score
	   * taken off by penalties
	   * @return penalties points
	   */
	public double getPenalties() {
		return (20 - pointsEarned())*60;
	}

	
	
	
	/**
	 * finding the best standing round if standing, finding the best prone round if prone
	 * @param standing
	 * @return best standing or prone round
	 */
	public ShootingRound bestRoundByType(boolean standing) {
		if (rounds.isEmpty()) { 
			return null;
			} 
		else {
			if (standing) {
				ShootingRound bestRound = new ShootingRound(0, standing);
				for (ShootingRound r : rounds) {
					if ((r.standing == standing) && (r.targetsHit > bestRound.targetsHit)) {
						bestRound = r;
					}
				}
				return bestRound;
			}

			else {
				ShootingRound bestRound = new ShootingRound(0, !standing);
				for (ShootingRound r : rounds) {
					if ((r.standing == false) && (r.targetsHit > bestRound.targetsHit)) {
						bestRound = r;
					}
				}
				return bestRound;
			}
		}
	}
	
	
}
