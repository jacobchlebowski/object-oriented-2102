import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {

	//fields
	
	private GregorianCalendar date = new GregorianCalendar();
	private LinkedList<Double> tempList;
	private LinkedList<Double> rainfallList;
	
	
	public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> tempList, LinkedList<Double> rainfallList) {
		this.date = date;
		this.tempList = tempList;
		this.rainfallList = rainfallList;
	}
	

	/**
	 * getter for date
	 * @return date
	 */
	public GregorianCalendar getDate() {
		return this.date;
	}

	/**
	 * getter for tempList
	 * @return tempList
	 */
	public LinkedList<Double> getTempList(){
		LinkedList<Double> newTempList = new LinkedList<Double>();
		for(Double t: this.tempList) {
		 newTempList.add(t);
		}
		return newTempList;
	}
	
	/**
	 * getter for rainfallList
	 * @return rainfallList
	 */
	public LinkedList<Double> getRainfallList(){
		LinkedList<Double> newRainfallList = new LinkedList<Double>();
		for(Double t: this.rainfallList) {
		 newRainfallList.add(t);
		}
		return newRainfallList;
	}
	
	
	/**
	 * overrides equals method
	 * @return true if object equals DWR
	 */
	public boolean equals(Object o) {
		DailyWeatherReport DWR = (DailyWeatherReport) o;
	
		if((DWR.getDate().equals(this.getDate())) &&  (DWR.getTempList().equals(this.getTempList())) && (DWR.getRainfallList().equals(this.getRainfallList()))){
			return true;
		}
		return false;
	}
	
	
	

}
