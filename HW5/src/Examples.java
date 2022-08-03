import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

//Zaq Humphrey & Jacob Chlebowski


public class Examples {
	
	
	Time time1 = new Time(2, 3);
	Time time2 = new Time(4, 5);
	Time time3 = new Time(6, 7);
	Reading reading1 = new Reading(time1, 8, 10);
	Reading reading2 = new Reading(time2, 10, 12);
	Reading reading3 = new Reading(time3, 12, 14);
	
	LinkedList<Reading> testReadings = new LinkedList<Reading>();

	LinkedList<Double> tempList = new LinkedList<Double>();
	LinkedList<Double> rainfallList = new LinkedList<Double>();
	LinkedList<Double> tempList2 = new LinkedList<Double>();
	LinkedList<Double> rainfallList2 = new LinkedList<Double>();
	LinkedList<Double> tempList3 = new LinkedList<Double>();
	LinkedList<Double> rainfallList3 = new LinkedList<Double>();
	LinkedList<Double> tempList4 = new LinkedList<Double>();
	LinkedList<Double> rainfallList4 = new LinkedList<Double>();
	LinkedList<Double> tempList5 = new LinkedList<Double>();
	LinkedList<Double> rainfallList5 = new LinkedList<Double>();
	
	GregorianCalendar date1 = new GregorianCalendar(2002,01,24);
	GregorianCalendar date2 = new GregorianCalendar(2002,01,20);
	GregorianCalendar date3 = new GregorianCalendar(2002,01,15);
	GregorianCalendar date4 = new GregorianCalendar(2002,02,25); //wrong month
	GregorianCalendar date5 = new GregorianCalendar(2004,01,20); //wrong year
	
	DailyWeatherReport DWR1 = new DailyWeatherReport(date1, tempList, rainfallList);
	DailyWeatherReport DWR2 = new DailyWeatherReport(date2 , tempList2, rainfallList2);
	DailyWeatherReport DWR3 = new DailyWeatherReport(date3 , tempList3, rainfallList3);
	DailyWeatherReport DWR4 = new DailyWeatherReport(date4, tempList4, rainfallList4);
	DailyWeatherReport DWR5 = new DailyWeatherReport(date5, tempList5, rainfallList5);
	
	LinkedList<DailyWeatherReport> reportsList = new LinkedList<DailyWeatherReport>();
	DWRLinkedList reports = new DWRLinkedList(reportsList);
	WeatherMonitor testWeatherMonitor = new WeatherMonitor(reports);
	
	ArrayList<DailyWeatherReport> arraysList = new ArrayList<DailyWeatherReport>();
	DWRArrayList arrayReports = new DWRArrayList(arraysList);
	WeatherMonitor arrayWeatherMonitor = new WeatherMonitor(arrayReports);
	
	
	
	
	@Before
	public void setup() {
		tempList.add(2.0);
		tempList.add(4.0);
		tempList.add(6.0);
		rainfallList.add(8.0);
		rainfallList.add(10.0);
		rainfallList.add(12.0);
		
		tempList2.add(8.0);
		tempList2.add(10.0);
		tempList2.add(12.0);
		rainfallList2.add(10.0);
		rainfallList2.add(12.0);
		rainfallList2.add(14.0);
		
		tempList3.add(14.0);
		tempList3.add(16.0);
		tempList3.add(18.0);
		rainfallList3.add(16.0);
		rainfallList3.add(18.0);
		rainfallList3.add(20.0);
		
	    tempList4.add(15.0);
		tempList4.add(30.0);
		tempList4.add(50.0);
		rainfallList4.add(24.3);
		rainfallList4.add(295.2);
		rainfallList4.add(0.001);
		
		tempList5.add(23.0);
		tempList5.add(32.0);
		tempList5.add(3000.0);
		rainfallList5.add(2.3);
		rainfallList5.add(92.2);
		rainfallList5.add(37.02);
		
		reportsList.add(DWR1);
		reportsList.add(DWR2);
		reportsList.add(DWR3);
		reportsList.add(DWR4);
		reportsList.add(DWR5);
		
		arraysList.add(DWR1);
		arraysList.add(DWR2);
		arraysList.add(DWR3);
		arraysList.add(DWR4);
		arraysList.add(DWR5);
		
		testReadings.add(reading1);
		testReadings.add(reading2);
		testReadings.add(reading3);
	}
	
	@Test
	public void testAddDailyReport() {
		testWeatherMonitor.addDailyReport(date2, testReadings);
		DailyWeatherReport last = testWeatherMonitor.getMyReports().getLast();
		assertTrue(last.equals(DWR2));
	}
	
	
	
	
	
	
	//averageTempForMonth TESTS
	
	//LinkedList
	@Test
	public void averageTempLinkedList() {
		assertEquals(testWeatherMonitor.averageTempForMonth(01, 2002), 30, 0.1);
	}
	
	//ArrayList
   @Test
   public void averageTempArrayList() {
	   assertEquals(arrayWeatherMonitor.averageTempForMonth(01, 2002), 30, 0.1);
   }
	

	
	//totalRainfallForMonth TESTS

	//LinkedList
	@Test
	public void totalRainfallLinkedList() {
		assertEquals(testWeatherMonitor.totalRainfallForMonth(01, 2002), 120, 0.1);
	}

	//ArrayList
	@Test
	public void totalRainfallArrayList() {
		assertEquals(arrayWeatherMonitor.totalRainfallForMonth(01, 2002), 120, 0.1);
	}
	
	
	
}
