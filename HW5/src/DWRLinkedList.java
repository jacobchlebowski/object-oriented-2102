import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DWRLinkedList implements IDataStructureDWR {

	private LinkedList<DailyWeatherReport> reports;

	public DWRLinkedList(LinkedList<DailyWeatherReport> reports) {
		this.reports = reports;
	}
	
	
	/**
	 * calculates average temperature in linked list
	 * @param month
	 * @param year
	 * @return average temperature
	 */
	public double averageTempForMonthList(int month, int year) {
		double totalTemperature = 0.0;
		double incorrectDates = 0.0;
		for (DailyWeatherReport report : reports) {
			if ((report.getDate().get(GregorianCalendar.MONTH) == month)
					&& (report.getDate().get(GregorianCalendar.YEAR) == year)) {
				for (double temp : report.getTempList()) {
					totalTemperature = totalTemperature + temp;
				}
			}
			else {
				incorrectDates++;
			}
		}
		return totalTemperature / (reports.size() - incorrectDates);
	}

	/**
	 * calculates total rainfall in linked list
	 * @param month
	 * @param year
	 * @return total rainfall
	 */
	public double totalRainfallForMonthList(int month, int year) {
		double totalRainfall = 0.0;
		for (DailyWeatherReport report : reports) {
			if ((report.getDate().get(GregorianCalendar.MONTH) == month)
					&& (report.getDate().get(GregorianCalendar.YEAR) == year)) {
				for (double temp : report.getRainfallList()) {
					totalRainfall = totalRainfall + temp;
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
	
	/**
	 * @return reports as a LinkedList
	 */
	public LinkedList<DailyWeatherReport> getReports(){
		return reports;
	}
	
		
		
		
	
	
	

}
