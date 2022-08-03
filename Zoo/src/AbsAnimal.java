
public abstract class AbsAnimal extends AbsLifeForm implements IAnimal {
	
	int length;
	
	public AbsAnimal(int length) {
		this.length = length;
	}
	
	public boolean isShorterThan(int size) {
		System.out.println(getNumberFour());
		return this.length < size;
	}
	

}
