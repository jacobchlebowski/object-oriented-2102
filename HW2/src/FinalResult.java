
public class FinalResult {
	
	ShootingResult shooting;
	SkiingResult skiing;
	
	
	public FinalResult (ShootingResult Shooting, SkiingResult Skiing) {
		shooting = Shooting;
		skiing = Skiing;
	}
	

	/**
	 * calculates final score in all events in regards to penalties
	 * @return final score 
	 */
	public double finalScore() {
		if(skiing.position == 1) {
			return (shooting.getPenalties() + skiing.pointsEarned() + skiing.getPenalties())-10;
		}
		else if(skiing.position == 2) {
			return (shooting.getPenalties() + skiing.pointsEarned() + skiing.getPenalties())-7;
		}
		else if(this.skiing.position == 3) {
			return (shooting.getPenalties() + skiing.pointsEarned() + skiing.getPenalties())-3;
		}
		else if(this.skiing.position == 4) {
			return (shooting.getPenalties() + skiing.pointsEarned() + skiing.getPenalties())-1;
		}
		else {
			return (shooting.getPenalties() + skiing.pointsEarned() + skiing.getPenalties());
		}
	}

}
