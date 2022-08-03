import java.util.LinkedList;

public class Library {

	LinkedList<Book> books;
	
	
	public Library(LinkedList<Book> books) {
		this.books = books;
	}
	
	//Overloaded Constructor
	public Library() {
		this.books = new LinkedList<Book>();
	}
	
	public Library addBook(Book aBook) {
		this.books.add(aBook);
		return this;
	}
	
	
	
	
	public boolean findABook(String myTitle) {
		for(Book aBook : books) {
			if(aBook.title.equals(myTitle)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	//Accumulator
//	public int countBooks() {
//		int numBooks = 0;
//		for(Book aBook : books) {
//			numBooks++;
//		}
//		return numBooks;
//	}
	
	
	
	/**
	 * Gets all of the books that are check out in the
	 * library.
	 * @return A list of checked out books
	 */
	public LinkedList<Book> checkedOut(){
			LinkedList<Book> checkedOutBooks = new LinkedList<Book>();
			for(Book aBook : books) {
				if(!aBook.isAvailable) {
					checkedOutBooks.add(aBook);
			}
		}
			return checkedOutBooks;
	}
	
	
	
	
	
	
	
	
	
	
	//public int countAllTheBooksThatMatchTitle(String myTitle) {
		//return books.size();
		
//		int numOfBooks = 0;
//		//ACCUMULATOR STYLE
//		for(Book aBook : books) {
//			if(book title matches my title) {
//				numOfBooks++;
//			}
//		}
//		return numOfBooks;
//	}
	
	

	
	public boolean timeToReplace(Book aBook) {
		return aBook.checkOut().timesOut > 400;
	}
	
}
