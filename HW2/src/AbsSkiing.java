import java.util.LinkedList;

public abstract class AbsSkiing {

	int position;
	LinkedList<Double> laps;
	int penalties;
	
	
	
	public AbsSkiing(int position, double time1, double time2, double time3, double time4, int penalties) {
		laps = new LinkedList<Double>();
		this.position = position;
		laps.add(time1);
		laps.add(time2);
		laps.add(time3);
		laps.add(time4);
		this.penalties = penalties;
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
