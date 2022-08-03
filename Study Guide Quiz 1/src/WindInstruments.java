
public class WindInstruments extends AbsInstruments implements IInstrument {

	public WindInstruments(String name, int size, String company) {
		super(name, size, company);
	}
	
	public boolean needsToTune() {
		return true;
	}
	
	public boolean isHeavy() {
		return this.size > 5;
	}
	
	
}
