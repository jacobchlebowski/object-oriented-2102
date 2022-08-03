
public class Cab extends AbsVehicle {

	int id;
	String cabCompany;
	
	public Cab(String cabCompany, int id, int odom) {
		super(4,odom);
		this.cabCompany = cabCompany;
		this.id = id;
	}
}
