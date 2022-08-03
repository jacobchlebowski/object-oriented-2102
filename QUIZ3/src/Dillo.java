public class Dillo {

	String name;
	boolean isDead;
	String eats;
	int age;

	public Dillo(String name, boolean isDead, String eats, int age) {
		this.name = name;
		this.isDead = isDead;
		this.eats = eats;
		this.age = age;
	}

	public Dillo(String name, int age) {
		this.name = name;
		this.isDead = false;
		this.eats = "Everything";
		this.age = age;
	}

	// Write an equals() method for Dillo such
	// that the following test will pass. To get full credit,
	// your method must check as many fields as possible

	public void equals(Dillo aDillo) {
		if ((this.name.equals(aDillo.name)) && (this.isDead == aDillo.isDead) && (this.eats.equals(aDillo.eats))
				&& (this.age == aDillo.age)) {
			aDillo.equals(this);
		}
		aDillo.equals(this);
	}

}