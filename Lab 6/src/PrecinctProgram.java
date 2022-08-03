import java.util.Scanner;

public class PrecinctProgram {
	public static void main(String[] args){
		
		String message = "hello world";
		int day;
		day = 17;
		
		System.out.println(message);
		System.out.println("Today is Wed, Nov " + day + ".");
		
		Precinct worcester12;
		worcester12 = new Precinct("Worcester12", "130 Winter Street", 1673);
		System.out.println(worcester12);
		
		
		Scanner keyboard = new Scanner(System.in);
//		System.out.print("\nGrow popluation by how much?");
//		int amount = keyboard.nextInt();
		
		System.out.println("Make a Precinct!");
		System.out.print("Enter name: ");
		String inputName = keyboard.nextLine();
		
		System.out.print("Enter an address: ");
		String inputAddress = keyboard.nextLine();
		
		System.out.print("Enter a population: ");
		int inputPopulation = keyboard.nextInt();
		
		Precinct precinct = new Precinct(inputName,inputAddress,inputPopulation);
		System.out.println("\nYour Precinct: "+ precinct);
		
		
		
		
	}
}
