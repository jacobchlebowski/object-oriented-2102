

class Main {
	public static void main(String[] args) {
		TermDay td = new TermDay(0, 6);
		try {
			boolean isDay = td.isThisDay(7);
		}
		catch (InvalidDataValueException e){
			e.print();
		}
	}
}


class TermDay{
	private int day;
	private int week;
	
	public TermDay(int day, int week) {
		this.day = day;
		this.week = week;
	}
	
	public boolean isThisDay(int day) throws InvalidDataValueException{
		if(day < 0 || day > 6) {
			throw new InvalidDataValueException(day, "day");
		}
		else if(day == this.day)return true;
		else return false;
	}
}


class InvalidDataValueException extends Exception{
	
	private int value;
	private String valueType;
	
	
	public InvalidDataValueException(int value, String valueType) {
		this.value = value;
		this.valueType = valueType;
	}
	
	public void print() {
		System.out.println(this.value + " is not a valid value for" + this.valueType);
	}
}


