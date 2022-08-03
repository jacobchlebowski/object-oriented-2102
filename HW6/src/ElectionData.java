import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class ElectionData {
	private LinkedList<String> ballot = new LinkedList<String>();
	

	public ElectionData(LinkedList<String> ballot, LinkedList<String> votes) {
		this.ballot = ballot;
	}
	
	
//hash maps where String is the candidate, and Integer is number of votes for
	// that specific candidate (KEY, VALUE)

	private HashMap<String, Integer> CandidateFirstChoice = new HashMap<String, Integer>();
	private HashMap<String, Integer> CandidateSecondChoice = new HashMap<String, Integer>();
	private HashMap<String, Integer> CandidateThirdChoice = new HashMap<String, Integer>();

	ElectionData() {
		this.ballot.add("Gompei");
		this.ballot.add("Husky");
	}

	
	

	// process Vote
	/**
	 * Stores a single voter's choices in DATA STRUCTURE
	 * 
	 * @param choice1
	 * @param choice2
	 * @param choice3
	 */
	public void processVote(String choice1, String choice2, String choice3)
			throws DuplicateVotesException, UnknownCandidateException {

		if (CandidateFirstChoice.containsKey(choice1)) {
			if ((!choice1.equals(choice2)) && (!choice1.equals(choice3))) {
				CandidateFirstChoice.replace(choice1, CandidateFirstChoice.get(choice1) + 1);
			} else {
				throw new DuplicateVotesException(choice1);
			}
		} else {
			throw new UnknownCandidateException(choice1);
		}

		if (CandidateSecondChoice.containsKey(choice2)) {
			if ((!choice2.equals(choice1)) && (!choice2.equals(choice3))) {
				CandidateSecondChoice.replace(choice2, CandidateFirstChoice.get(choice2) + 1);
			} else {
				throw new DuplicateVotesException(choice2);
			}
		} else {
			throw new UnknownCandidateException(choice2);
		}

		if (CandidateThirdChoice.containsKey(choice3)) {
			if ((!choice3.equals(choice1)) && (!choice3.equals(choice2))) {
				CandidateThirdChoice.replace(choice3, CandidateFirstChoice.get(choice3) + 1);
			} else {
				throw new DuplicateVotesException(choice3);
			}
		} else {
			throw new UnknownCandidateException(choice3);
		}
	}
	
	
	

	/**
	 * Checks each hashmap if it contains key (name) and adds Candidate to HashMap
	 * 
	 * @param name
	 * @throws CandidateExistsException
	 */
	public void addCandidate(String name) throws CandidateExistsException {
		if (CandidateFirstChoice.containsKey(name)) {
			throw new CandidateExistsException(name);
		} else
			CandidateFirstChoice.put(name, 0);

		if (CandidateSecondChoice.containsKey(name)) {
			throw new CandidateExistsException(name);
		} else
			CandidateSecondChoice.put(name, 0);

		if (CandidateThirdChoice.containsKey(name)) {
			throw new CandidateExistsException(name);
		} else
			CandidateThirdChoice.put(name, 0);
	}
	
	
	
	/**
	 * finds candidate with more than 50% of first place votes
	 * @return either winner or "Runoff required"
	 */
	public String findWinnerMostFirstVotes() {
		int totalFirstChoice = 0;
		
		for(Map.Entry<String, Integer> firstChoices : CandidateFirstChoice.entrySet()) {
			totalFirstChoice += firstChoices.getValue();
		}
	
		for(Map.Entry<String, Integer> candidate : CandidateFirstChoice.entrySet()) {
			if(candidate.getValue() > (totalFirstChoice*.5))
				return candidate.getKey();
		}
		
		return "Runoff required";
	}
	
	
	
	
	/**
	 * finds candidate with the most points
	 * @return Candidate
	 */
	public String findWinnerMostPoints() {
		HashMap<String, Integer> CandidateMostPoints = new HashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> candidate : CandidateFirstChoice.entrySet()){
			int totalFirstChoice = 0;
			int totalSecondChoice = 0;
			int totalThirdChoice = 0;
			int totalCandidateVotes = 0;
			
			for(Map.Entry<String, Integer> firstChoice : CandidateFirstChoice.entrySet()) {
				if(firstChoice.getKey().equals(candidate.getKey())) {
					totalFirstChoice = totalFirstChoice + (3 * firstChoice.getValue());
				}
			}
			for(Map.Entry<String, Integer> secondChoice : CandidateSecondChoice.entrySet()) {
				if(secondChoice.getKey().equals(candidate.getKey())) {
				totalSecondChoice = totalSecondChoice + (2 * secondChoice.getValue());
				}
			}
			for(Map.Entry<String, Integer> thirdChoice : CandidateThirdChoice.entrySet()) {
				if(thirdChoice.getKey().equals(candidate.getKey())) {
				totalThirdChoice = totalThirdChoice + thirdChoice.getValue();
				}
			}
			totalCandidateVotes = totalFirstChoice + totalSecondChoice + totalThirdChoice;
			CandidateMostPoints.put(candidate.getKey(),totalCandidateVotes);
			
		}
			String currentWinner = "No current winner";
			int highestPoints = 0;
			for (Map.Entry<String, Integer> candidates : CandidateMostPoints.entrySet()) {
				if(candidates.getValue() > highestPoints) {
					highestPoints = candidates.getValue();
					currentWinner = candidates.getKey();
				}
			}
			return currentWinner;
		}
	
		
	/**
	 * getter for ballot
	 * @return ballot
	 */
	public LinkedList<String> getBallot(){
		return this.ballot;
	}
		
		
	
	
	
	
		
	}
