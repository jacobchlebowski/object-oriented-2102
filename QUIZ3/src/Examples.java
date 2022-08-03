import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Examples {

	
	@Test
	public void testDillo1() {
		Dillo fred = new Dillo("Fred", false, "mice", 3);
		Dillo barney = new Dillo("Barney", false, "mice", 3);
		assertEquals(fred, barney);
	}

}
