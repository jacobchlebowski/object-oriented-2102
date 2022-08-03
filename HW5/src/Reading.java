
public class Reading {

	private Time time;
	private double temp;
	private double rainfall;
	
	
	public Reading(Time time, double temp, double rainfall) {
		this.time = time;
		this.temp = temp;
		this.rainfall = rainfall;
	}
	
	
	/**
	 * getter for time
	 * @return time
	 */
	public Time getTime() {
		return this.time;
	}
	
	/**
	 * getter for temperature
	 * @return temperature
	 */
	public double getTemp() {
		return this.temp;
	}
	
	/**
	 * getter for rainfall
	 * @return rainfall
	 */
	public double getRainfall() {
		return this.rainfall;
	}
	
	
	
	
}
