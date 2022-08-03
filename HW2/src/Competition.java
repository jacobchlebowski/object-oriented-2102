import java.util.LinkedList;

public class Competition {

	int ShootingRound;
	LinkedList<Athlete> athletes;
	
	public Competition(int ShootingRound, LinkedList<Athlete> athletes) {
		this.ShootingRound = ShootingRound;
		this.athletes = athletes;
	}
	
	
	/**
	 * tests to see if an athlete did not finish their shooting round event
	 * based on the total shooting rounds(they did)
	 * @return a list of the names of the athletes that did not finish
	 */
	public LinkedList<String> shootingDNF(){
		LinkedList<String> namesOfAthletes = new LinkedList<String>();
		for(Athlete anAthlete : athletes) {
			if(anAthlete.Final.shooting.rounds.size() < this.ShootingRound) {
				namesOfAthletes.add(anAthlete.name);
			}
		}
		return namesOfAthletes;		
	}
	
	
	
	/**
	 * searches for athlete with given name
	 * @param name
	 * @return athlete with given name's final score
	 */
	public double finalScoreForAthlete(String name) {
			for(Athlete anAthlete : athletes) {
				if(name.equals(anAthlete.name)) {
					return anAthlete.Final.finalScore();
				}
			}
		return 0.00; //if athlete is not in list, produce 0 for their final score
	}
	
	
	/**
	 * compares an athlete's given competition score with their final score
	 * @param aCompetition
	 * @return true if final score is greater than given score
	 */
	public boolean anyImprovement(Competition aCompetition) {
		for(Athlete anAthlete : aCompetition.athletes) {
			if(finalScoreForAthlete(anAthlete.name) > anAthlete.Final.finalScore()) {
				return true;
			}
		}
		return false;
	}
	
	
	//We are satisfied with how we wrote our methods because anyImprovement
	//utilizes finalScoreForAthlete as a helper, meaning there was less
	//work to be done. If we didn't use this helper, then the program
	//would have probably required to find an athlete's name and score
	//separately, which at that point would have been too much work.
	
	
	
}