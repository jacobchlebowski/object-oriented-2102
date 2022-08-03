
public class UnknownCandidateException extends Exception {

	private String name;
	public UnknownCandidateException(String name) {
		this.name = name;
	}
	
	/**
	 * getter for name
	 * @return name
	 */
	public String getName() {
		return this.name + " is not on the ballot";
	}
	

	
	
}
