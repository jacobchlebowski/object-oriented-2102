
public class Dillo extends AbsAnimal {

	boolean isDead;
	
	public Dillo(int lengthParam, boolean isDeadParam) {
		super(lengthParam);
		this.isDead = isDeadParam;
	}
	
	public boolean canShelter(Dillo aDillo) {
		if(aDillo.length > 60 && aDillo.isDead == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean lengthBelow(int size) {
		return this.length < size;
	}
	
	public int superReturn4() {
		return getNumberFour();
	}
	

}
