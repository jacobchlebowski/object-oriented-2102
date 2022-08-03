import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

	//field for reports uses an interface type!! (encapsulation)
	private IDataStructureDWR reports;
	
	//constructor 
	public WeatherMonitor(IDataStructureDWR reports) {
		this.reports = reports;
	}
	
	
	
	
	
	/**
	 * averages temperature over all days that month
	 * @param month
	 * @param year
	 * @return average temperature value
	 */
	public double averageTempForMonth(int month, int year) {
		return reports.averageTempForMonthList(month, year);
	}
	
	
	
	/**
	 * totals rainfall over all days that month
	 * @param month
	 * @param year
	 * @return total rainfall
	 */
	public double totalRainfallForMonth(int month, int year) {
		return reports.totalRainfallForMonthList(month, year);
	}
	
	
	
	/**
	 * stores a daily report for the given date
	 * @param date
	 * @param readings
	 */
	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
		LinkedList<Double> temp = new LinkedList<Double>();
		LinkedList<Double> rainfall = new LinkedList<Double>();
		for (Reading r : readings) {
			temp.add(r.getTemp());
			rainfall.add(r.getRainfall());
		}
		DailyWeatherReport weatherReport = new DailyWeatherReport(date, temp, rainfall);
		reports.addToReports(weatherReport);
	}
	
	
	
	/**
	 * 
	 * @return reports as a LinkedList of DailyWeatherReports
	 */
	public LinkedList<DailyWeatherReport> getMyReports(){
		return this.reports.getReports();
	}
	
}
