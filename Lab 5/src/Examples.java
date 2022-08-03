import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class Examples {

	String data;
	IBST left;
	IBST right;
	IAVL left2;
	IAVL right2;
	
	EventGuests guestsLists = new EventGuests(new LinkedList<String>());
	
	
	EventGuests guestsBSTs = new EventGuests(new DataBST(data,left,right));
	
	
	EventGuests guestsAVLs = new EventGuests(new DataAVL(data,left2,right2));

	  @Test
	  public void test() {
		  fail("Not yet implemented");
	  }
	  
}
