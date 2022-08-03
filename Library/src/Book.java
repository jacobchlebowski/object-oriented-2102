
public class Book {

	String title;      //book title
	String callNum;     //call number
	int timesOut;       //times out
	boolean isAvailable;   //available?
	
	public Book(String title, String callNum, int timesOut, boolean isAvailable) {
	    this.title = title;
		this.callNum = callNum;
		this.timesOut = timesOut;
		this.isAvailable = isAvailable;
	}
	
	
	//Overloading (different parameters) 
	public Book(String title, String callNum) {
		this.title = title;
		this.callNum = callNum;
		this.timesOut = 0;
		this.isAvailable = true;
	}
	
	
	public Book(int timesOut, String title, String callNum, boolean isAvailable) {
	    this.title = title;
		this.callNum = callNum;
		this.timesOut = timesOut;
		this.isAvailable = isAvailable;
	}
	
	
//Mutator 
	public Book checkOut() {
		//mutator
		this.timesOut = this.timesOut + 1 ;
		this.isAvailable = false;
		return this;
	}
	
	
	public Request makeRequest(int cardNum){
		return new Request(this, cardNum);
	}

	public boolean timeToReplace() {
		return this.checkOut().timesOut > 400;
	}
	
	
	
}
