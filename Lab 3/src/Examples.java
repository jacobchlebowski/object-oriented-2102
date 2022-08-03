import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class Examples {
	@Test
	public void testPlanning() {
		LinkedList<Double> testList = new LinkedList<Double>();
		Planning testPlanning = new Planning();
		testList.add(1.0);
		testList.add(-2.0);
		testList.add(5.0);
		testList.add(-999.0);
		testList.add(8.0);
		assertEquals(testPlanning.rainfall(testList), 3.0, 0.1); 
	}
	@Test
	public void testPlanning2() {
		LinkedList<Double> testList = new LinkedList<Double>();
		Planning testPlanning = new Planning();
		testList.add(-1.0);
		testList.add(-2.0);
		testList.add(-5.0);
		testList.add(-8.0);
		assertEquals(testPlanning.rainfall(testList), -1, 0.1); 
	}
	@Test
	public void testPlanning3() {
		LinkedList<Double> testList = new LinkedList<Double>();
		Planning testPlanning = new Planning();
		testList.add(-1.0);
		testList.add(-2.0);
		testList.add(-999.0);
		testList.add(-5.0);
		testList.add(-8.0);
		assertEquals(testPlanning.rainfall(testList), -1, 0.1); 
	}
	@Test
	public void testPlanning4() {
		LinkedList<Double> testList = new LinkedList<Double>();
		Planning testPlanning = new Planning();
		testList.add(1.0);
		testList.add(2.0);
		testList.add(5.0);
		testList.add(8.0);
		assertEquals(testPlanning.rainfall(testList), 4, 0.1); 
	}
}
