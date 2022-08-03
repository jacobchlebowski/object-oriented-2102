import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	//Rugby Object.... Edge Cases
	
	RugbyTeam testTeam1 = new RugbyTeam(true, 50, 50);
    RugbyTeam testTeam2 = new RugbyTeam(false, 20, 30);
	
    
	
	@Test
	public void testExpectToBeat() {
		assertTrue(testTeam1.expectToBeat(testTeam2));
	}

	
	
	
	
	
}
