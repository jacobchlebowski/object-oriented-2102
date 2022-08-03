
public class Cage {
	int size;
	AbsAnimal resident;
	
	public Cage(int size, AbsAnimal resident) {
		this.size = size;
		this.resident = resident;
	}
	
	boolean checkResidentFits() {
		return this.resident.isShorterThan(this.size);
	}

}
