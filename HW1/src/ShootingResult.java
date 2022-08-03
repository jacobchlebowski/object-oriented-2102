
public class ShootingResult implements IEvent {

	ShootingRound round1, round2, round3, round4;
	
	
	public ShootingResult(ShootingRound round1, ShootingRound round2, ShootingRound round3, ShootingRound round4) {
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
		this.round4 = round4;
	}
	
	public double pointsEarned() {
		return (round1.targetsHit + round2.targetsHit + round3.targetsHit + round4.targetsHit);
	}
	
	public double getPenalties() {
		return (20-pointsEarned())*60;
	}
	
	
	
	
}