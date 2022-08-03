
public class Athlete {


	FinalResult Final;
	String name;

	public Athlete(FinalResult Final, String name) {
		this.Final = Final;
		this.name = name;
	}
	
	
	//betterSkiier
	/**
	 * compares two athletes in skiing event and determines who had mores points
	 * @param anAthlete
	 * @return true if athlete in input has more points
	 */
	public boolean betterSkiier(Athlete anAthlete) {
		return (Final.skiing.pointsEarned() < anAthlete.Final.skiing.pointsEarned());
	}
	

	//betterShooter
	/**
	 * compares two athletes in shooting event and determines who had more points
	 * @param anAthlete
	 * @return true if athlete in input has more points
	 */
	public boolean betterShooter(Athlete anAthlete) {
		return (Final.shooting.pointsEarned() > anAthlete.Final.shooting.pointsEarned());
	}
	
	
	//hasBeaten
	/**
	 * compares two athletes and sees if inputted athlete is either a better shooter or better skiier
	 * @param anAthlete
	 * @return true if the given athlete is either a better shooter or skiier
	 */
	public boolean hasBeaten(Athlete anAthlete) {
		return (this.betterShooter(anAthlete) || this.betterSkiier(anAthlete));
	}
	
	
}
