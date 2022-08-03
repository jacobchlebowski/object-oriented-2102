import java.util.LinkedList;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Examples {

	Book hamlet = new Book("Hamlet", "SH123");
	Book macbeth = new Book(0, "Macbeth", "SH234", true);
	Book muchado = new Book(0, "muchado", "SH345", true);
	
	Request reqHamlet = hamlet.makeRequest(1234);
	Request getHamletAgain = new Request(hamlet, 1234);
	
	
	Library myLib = new Library();
	
	public Examples() {
	
	}
	
	@Before
	public void setup() {
		hamlet.isAvailable = true;
		macbeth.isAvailable = true;
		myLib = new Library();
		myLib.addBook(hamlet).addBook(macbeth).addBook(muchado);
	}
	
	
	@Test
	public void testCheckedOutEmptyList() {
		assertEquals(myLib.checkedOut() , new LinkedList<Book>());
	}
	
	
	
	@Test
	public void testCheckedOutNonEmptyList() {
		LinkedList<Book> expectedOutput = new LinkedList<Book>();
		expectedOutput.add(macbeth);
		expectedOutput.add(hamlet);
		assertEquals(myLib.checkedOut() , expectedOutput);
	}
	
	
	

}
