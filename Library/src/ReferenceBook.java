
public class ReferenceBook extends Book {
	
	public ReferenceBook(String title, String callNum) {
		super(title, callNum);
	}
	
	
	//overriding vs overloading?
	
	//overriding
	public Book checkOut() {
		return null;
	}
	
	//overloading
	public Book checkOut(String title) {
		return null;
	}
	
	
}
