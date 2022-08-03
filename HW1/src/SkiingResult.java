
public class SkiingResult implements IEvent {

	int position;
	double time1;
	double time2;
	double time3;
	double time4;
	int penalties;
	
	public SkiingResult(int position, double time1, double time2, double time3, double time4, int penalties) {
		this.position = position;
		this.time1 = time1;
		this.time2 = time2;
		this.time3 = time3;
		this.time4 = time4;
		this.penalties = penalties;
	}
	
	
   public double pointsEarned() {
	   return (this.time1 + this.time2 + this.time3 + this.time4);
   }
	
   
   
   public double getPenalties() {
	   return this.penalties*5;
   }
	
}
