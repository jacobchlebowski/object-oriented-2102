
public class SkiingResult extends AbsSkiing implements IEvent {

	
	public SkiingResult(int position, double time1, double time2, double time3, double time4, int penalties) {
		super(position,time1, time2, time3, time4 ,penalties);
	
	}
	
	
	/**
	 * adds all lap times together
	 * @return sum of lap times
	 * 
	 */
	  public double pointsEarned() {
		  double total = 0;
		   if(laps.isEmpty()) {
			 return 0;
		 }
		 else
			 for(double l : laps) {
				 total = total + l;
			 }
		 return total;
	   }
		 
	   
	  /**
	   * multiplies penalties to get total score
	   * taken off by penalties
	   * @return penalties points
	   */
	   public double getPenalties() {
		   return this.penalties*5;
	   }
	   
}
