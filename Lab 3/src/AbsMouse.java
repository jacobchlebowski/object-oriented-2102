public abstract class AbsMouse {
	String foodToEat;
	double gramsPerMeal;
	int workouts;
	double workoutMinutes;
	double weight;
	String date;
}

public interface IMouse {
	public void record();
}

public class Mouse extends AbsMouse implements IMouse{
	public void record() {
	}
}

