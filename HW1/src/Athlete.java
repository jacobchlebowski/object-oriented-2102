
public class Athlete {

	

	//one field that holds a FinalResult object
	FinalResult Final;

	public Athlete(FinalResult Final) {
		this.Final = Final;
	}
	
	
	//betterSkiier
	public boolean betterSkiier(Athlete anAthlete) {
		return (Final.skiing.pointsEarned() < anAthlete.Final.skiing.pointsEarned());
	}
	

	//betterShooter
	public boolean betterShooter(Athlete anAthlete) {
		return (Final.shooting.pointsEarned() < anAthlete.Final.shooting.pointsEarned());
	}
	
	
	//hasBeaten
	public boolean hasBeaten(Athlete anAthlete) {
		return (this.betterShooter(anAthlete) || this.betterSkiier(anAthlete));
	}
	
	
}
