import java.util.LinkedList;

public class WordList {

	LinkedList<String> words;
	
	//constructor (Completely new list)
	public WordList() {
		this.words = new LinkedList<String>();
	}
	
	//Overloading constructor (ALREADY EXISTING list)
	public WordList(LinkedList<String> initListOfWords){
		this.words = initListOfWords;
	}
	
	public void addWord(String word) {
		this.words.addFirst(word);
	}
	
	//Accumulator
	public int numUses(String str) {
		int uses = 0;
		for(String w : this.words) {
			if(w.equals(str))
				uses++;
			}
			return uses;
		}
	
	
	//Return words longer than a given length
	public LinkedList<String> wordsLongerThan(int low){
		LinkedList<String> results = new LinkedList<String>();
		for(String w : this.words) {
			if(w.length() > low) {
				results.add(w);
			}
		}
		return results;
	}
	
	
	
}
