import java.util.ArrayList;


class Patron {
	
	String name;
	ArrayList<Book> books;

	public Patron(String name) {
		this.name = name;
	}

	
	public boolean hasBook(String title) {
		for (int i = 0; i < this.books.size(); i++) {
			Book aBook = this.books.get(i);
			if (aBook.title.equals(title)) {
				return true;
			}
		}
		return false;
	}

	
	public String getName() {
		return this.name;
	}

	
	public void addBook(Book b) {
		this.books.add(b);
	}

	
	public ArrayList<Book> getBooks() {
		return this.books;
	}
}



class Book {

	String title;
	int callNum;
	boolean isOverdue;

	public Book(String title, int callNum, boolean isOverdue) {
		this.title = title;
		this.callNum = callNum;
		this.isOverdue = isOverdue;
	}

	public Book(String title, int callNum) {
		this.title = title;
		this.callNum = callNum;
	}

}
