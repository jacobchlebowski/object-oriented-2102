import java.util.Scanner;

public class VotingMachine {

	//exceptions 
	ElectionData eData;
	
	public VotingMachine(ElectionData eData) {
		eData=this.eData;
	}
	
	private Scanner keyboard = new Scanner(System.in);
	
	
	
	/**
	 * prints ballot
	 */
	public void printBallot() {
		System.out.println("The candidates are ");
		for (String s : eData.getBallot()) {
			System.out.println(s);
		}
	}
	
	
	/**
	 * adds new candidate to the candidates HashMap
	 * @param name
	 */
	public void addWriteIn(String name) {
		try {
			eData.addCandidate(name);
		}
		catch(CandidateExistsException e){
			System.out.println("Candidate already exists");
		}
		System.out.println("Candidate successfully added");
	}
	
	
	/**
	 * prints out the screen instructions for the user and
	 * gives error handling if necessary
	 */
	public void screen() {
		this.printBallot();
		System.out.print("Who do you want to vote for? \nChoice1: ");
		String choice1 = keyboard.nextLine();
		System.out.print("Choice2: ");
		String choice2 = keyboard.nextLine();
		System.out.print("Choice3: ");
		String choice3 = keyboard.nextLine();
		try {
			eData.processVote(choice1, choice2, choice3);
		}
		catch (UnknownCandidateException e) {
			System.out.print("Candidate " + e.getName() + "is not on the ballot. Would you like to add the candidate's name to the ballot? 'Y' or 'y': ");
			String answer = keyboard.nextLine();
			if((answer.equals("y")) || (answer.equals("Y"))){
				this.addWriteIn(e.getName());
				screen();
				return;
			}
			return;
		}
		catch (DuplicateVotesException e) {
			System.out.println("You already voted for " + e.getName());
			screen();
			return;
		}
		System.out.println("You voted for " + choice1 + choice2 + choice3);
	}
	
	
	
}
