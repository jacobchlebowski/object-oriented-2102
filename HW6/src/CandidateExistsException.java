
public class CandidateExistsException extends Exception {

	private String name;
	public CandidateExistsException(String name) {
		this.name = name;
	}
	
	/**
	 * getter for name
	 * @return name
	 */
	public String getName() {
		return this.name + " is already on the ballot!";
	}
	

	
	
}
