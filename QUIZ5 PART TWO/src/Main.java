import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
		LinkedList<String> heroes = new LinkedList<String>();
		
		heroes.addLast("Superman");
		heroes.addLast("Black Widow");
		heroes.addLast("Green Lantern");
		
		try {
			System.out.println(heroes.get(1));
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception caught!");
		}
		
	}
}