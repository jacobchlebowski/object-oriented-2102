import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

// addTest 1
	IHeap left = new MtHeap();
	IHeap right = new MtHeap();
	IHeap myHeap = new DataHeap(1, left, right);
	HeapChecker HT = new HeapChecker();

// addTest 2
	IHeap left2 = new MtHeap();
	IHeap right2 = new DataHeap(2, left, right);
	IHeap myHeap2 = new DataHeap(1, left2, right2);
// addTest 3 (false heap)
	IHeap falseLeft = new MtHeap();
	IHeap falseRight = new MtHeap();
	IHeap falseHeap1 = new DataHeap(1, falseLeft, falseRight);
	IHeap falseAddedHeap1 = new DataHeap(1, left2, right2);
// addTest 4 (detects result thats not a heap)
	IHeap left3 = new MtHeap();
	IHeap right3 = new DataHeap(0, left, right);
	IHeap myHeap3 = new DataHeap(5, left3, right3);
// addTest 5 (detects result where added elt occurs wrong number of times)
	IHeap left4 = new DataHeap(1, left, right);
	IHeap right4 = new MtHeap();
	IHeap myHeap4 = new DataHeap(1, left4, right4);
	IHeap falseHeap4 = new DataHeap(5, left4, right4);
// addTest 6 (detects result where other elts occur wrong number of times)
	IHeap left5 = new DataHeap(1, left, right);
	IHeap right5 = new MtHeap();
	IHeap myHeap5 = new DataHeap(1, left4, right4);
	IHeap falseHeap5 = new DataHeap(2, left4, right4);
// remTest 3 (detects result that's not a heap)
	IHeap left6 = new DataHeap(0, left, right);
	IHeap right6 = new DataHeap(0, left, right);
	IHeap myHeap6 = new DataHeap(1, left6, right6);
	IHeap myHeap6Removed = new DataHeap(1, left6, right);
// remTest 4 (detects result where removed elt occurs wrong number of times)
	IHeap left7 = new DataHeap(1, left, right);
	IHeap right7 = new DataHeap(1, left, right);
	IHeap myHeap7 = new DataHeap(1, left7, right7);
	IHeap falseHeap7 = new DataHeap(1, left, right);
// remTest 5 (detects result where other elts occur wrong number of times)
	IHeap left8 = new DataHeap(5, left, right);
	IHeap right8 = new DataHeap(5, left, right);
	IHeap myHeap8 = new DataHeap(1, left8, right8);
	IHeap falseLeft8 = new DataHeap(8, left, right);
	IHeap falseHeap8 = new DataHeap(5, falseLeft8, right);
// remTest 6 (detects result where total number of elements is incorrect)
	IHeap left9 = new DataHeap(3, left, right);
	IHeap right9 = new DataHeap(1, left, right);
	IHeap myHeap9 = new DataHeap(1, left9, right9);
	IHeap falseHeap9 = new DataHeap(3, left, right);

// Passes autotest
	@Test
	public void addTest1() {
		assertTrue(HT.addEltTester(myHeap, 5, myHeap.addElt(5)));
	}

// Passes autotest
	@Test
	public void addTest2() {
		assertTrue(HT.addEltTester(myHeap2, 5, myHeap2.addElt(5)));
	}

//detects result where total number of elements is incorrect
	@Test
	public void addTest3() {
		assertFalse(HT.addEltTester(falseHeap1, 5, falseAddedHeap1.addElt(5)));

	}

//detects result that's not a heap
	@Test
	public void addTest4() {
		assertFalse(HT.addEltTester(myHeap3, 5, myHeap3.addElt(5)));
	}

//detects result where added elt occurs wrong number of times
	@Test
	public void AddTest5() {
		assertFalse(HT.addEltTester(myHeap4, 5, falseHeap4.addElt(5)));
	}

//detects result where other elts occur wrong number of times
	@Test
	public void AddTest6() {
		assertFalse(HT.addEltTester(myHeap5, 5, falseHeap5.addElt(5)));
	}

//passes auto-test for valid heap
	@Test
	public void remTest() {
		assertTrue(HT.remMinEltTester(myHeap, myHeap.remMinElt()));
	}

//passes auto-test for valid heap 2
	@Test
	public void remTest2() {
		assertTrue(HT.remMinEltTester(myHeap2, myHeap2.remMinElt()));
	}

//detects result that's not a heap
	@Test
	public void remTest3() {
		assertFalse(HT.remMinEltTester(myHeap6, myHeap6Removed));
	}

//detects result where removed elt occurs wrong number of times
	@Test
	public void remTest4() {
		assertFalse(HT.remMinEltTester(myHeap4, falseHeap7.remMinElt()));
	}

//detects result where other elts occur wrong number of times
	@Test
	public void remTest5() {
		assertFalse(HT.remMinEltTester(myHeap8, falseHeap8.remMinElt()));
	}

//detects result where total number of elements is incorrect
	@Test
	public void remTest6() {
		assertFalse(HT.remMinEltTester(myHeap9, falseHeap9.remMinElt()));
	}
}