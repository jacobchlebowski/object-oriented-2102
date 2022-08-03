import java.util.LinkedList;

public class WordList extends Dictionary {
	
	public WordList() {
		super();
	}
	
	public WordList(LinkedList<String> initListOfWords) {
		super(initListOfWords);
	}
	
	public void addWord(String word) {
		this.words.addFirst(word);
	}
	
	public LinkedList<String> wordsLongerThan(int low) {
		LinkedList<String> results = new LinkedList<String>();
		
		for(String w : this.words) {
			if(w.length() > low) {
				results.addFirst(w);
			}
		}
		
		return results;
	}
	
} 