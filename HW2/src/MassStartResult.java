
public class MassStartResult extends AbsSkiing implements IEvent{
	
	int startPos;
	
	
	public MassStartResult(int startPos, int position, double time1, double time2, double time3, double time4, int penalties) {
		super(position,time1, time2, time3, time4 ,penalties);
		this.startPos = startPos;
	
	}
	
	/**
	 * adds laps to get total laps
	 * @return sum of laps
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

