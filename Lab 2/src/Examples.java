import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	
	//NOTE: Method for whales is not necessary because whales aren't dangerous to humans, and it can't be assumed all fish are dangerous
	
	
	Shark shark1 = new Shark(10,5);
	Shark shark2 = new Shark(6,0);
	Shark shark3 = new Shark(2,300);
	
	//IsNormalSize Tests
	@Test
	public void testIsNormalSize() {
		assertTrue(shark1.isNormalSize());
	}

	@Test
	public void testIsNormalSize2() {
		assertTrue(shark2.isNormalSize());
	}
	
	@Test
	public void testIsNormalSize3() {
		assertFalse(shark3.isNormalSize());
	}
	
	
	//IsDangerToPeople
	Boa boa1 = new Boa("Zaq", 5000, "sharks");
	Boa boa2 = new Boa("Jacob", 1, "people");
	
	@Test
	public void testIsDangerToPeopleBoa1() {
		assertFalse(boa1.isDangerToPeople());
	}
	
	@Test
	public void testIsDangerToPeopleBoa2() {
		assertTrue(boa2.isDangerToPeople());
	}
	
	@Test
	public void testIsDangerToPeopleShark1() {
		assertTrue(shark1.isDangerToPeople());
	}
	
	@Test
	public void testIsDangerToPeopleShark2() {
		assertFalse(shark2.isDangerToPeople());
	}
	
	
	
}
