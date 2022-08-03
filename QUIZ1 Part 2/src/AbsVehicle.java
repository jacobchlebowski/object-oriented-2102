public class AbsVehicle implements IVehicle {

	int passengerSeats;
	int odom;
	
	public AbsVehicle(int passengerSeats, int odom) {
		this.passengerSeats = passengerSeats;
		this.odom = odom;
	}
	
	public boolean isSafe() {
		return false;
	}
	
	public boolean bigEnough (int passengers) {
		return this.passengerSeats >= passengers;
	}
}
