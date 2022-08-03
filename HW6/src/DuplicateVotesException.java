
public class DuplicateVotesException extends Exception {

	private String name;
	public DuplicateVotesException(String name) {
		this.name = name;
	}
	
	/**
	 * getter for name
	 * @return name
	 */
	public String getName() {
		return this.name + " was already one of your votes!";
	}
	

	
	
}
