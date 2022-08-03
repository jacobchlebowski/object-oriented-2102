import java.util.LinkedList;

public interface IDataStructureDWR {

	public double averageTempForMonthList(int month, int year);
	public double totalRainfallForMonthList(int month, int year);
	public void addToReports(DailyWeatherReport report);
	public LinkedList<DailyWeatherReport> getReports();

}
