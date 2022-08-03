import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DWRArrayList implements IDataStructureDWR {

	private ArrayList<DailyWeatherReport> reports;
	
	public DWRArrayList(ArrayList<DailyWeatherReport> reports) {
		this.reports = reports;
	}
	
	/**
	 * calculates average temperature in array list
	 * @param month
	 * @param year
	 * @return average temperature
	 */
	public double averageTempForMonthList(int month, int year) {
		double totalTemperature = 0.0;
		double incorrectDates = 0.0;
		for(int i=0; i < reports.size(); i++) { 
			if( (reports.get(i).getDate().get(GregorianCalendar.MONTH) ==month) && (reports.get(i).getDate().get(GregorianCalendar.YEAR) ==year)) {
				for(int k=0; k<reports.get(i).getTempList().size(); k++){
					totalTemperature = totalTemperature + reports.get(i).getTempList().get(k);
				}
			}
			else {
				incorrectDates++;
			}
		}
		return totalTemperature/(reports.size() - incorrectDates);
	}
	
	
	
	/**
	 * calculates total rainfall in linked list
	 * @param month
	 * @param year
	 * @return total rainfall
	 */
	public double totalRainfallForMonthList(int month, int year) {
		double totalRainfall = 0.0;
		for(int i=0; i < reports.size(); i++) { 
			if( (reports.get(i).getDate().get(GregorianCalendar.MONTH) ==month) && (reports.get(i).getDate().get(GregorianCalendar.YEAR) ==year)) {
				for(int k=0; k<reports.get(i).getRainfallList().size(); k++){
					totalRainfall = totalRainfall + reports.get(i).getRainfallList().get(k);
				}
			}
		}
		return totalRainfall;
	}
	
	
	
	
	/**
	 * @param report
	 * adds a DailyWeatherReport to ArrayList reports
	 */
	public void addToReports(DailyWeatherReport report) {
		reports.add(report);
	}


	@Override
	public LinkedList<DailyWeatherReport> getReports() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
