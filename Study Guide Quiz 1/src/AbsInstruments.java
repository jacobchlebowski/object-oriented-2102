
public abstract class AbsInstruments {

	String name;
	int size; //size in feet
	String company;
	
	public AbsInstruments(String name, int size, String company) {
		this.name = name;
		this.size = size;
		this.company = company;
	}
	
	public boolean isHeavy() {
		return this.size > 5;
	}
	
	
	
	
}

