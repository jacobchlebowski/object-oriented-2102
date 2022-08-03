
public class BrassInstruments extends AbsInstruments implements IInstrument, IInstrument2{

	public BrassInstruments(String name, int size, String company) {
		super(name,size,company);
	}
	
	
	public boolean needsToTune() {
		return true;
	}
	
	
	public boolean isHeavy() {
		return this.size > 5;
	}
	
	public boolean isBrass() {
		return true;
	}
	
	
}
