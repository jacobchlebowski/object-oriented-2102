import java.util.LinkedList;

public class Dictionary {

        LinkedList<String> words;

        public Dictionary() {
                this.words = new LinkedList<String>();
        }

        public Dictionary (LinkedList<String> words) {
                this.words = words;
        }

        public int numUses(String str) { 
                int uses = 0; 
                for(String w : this.words) { 
                      if(w.equals(str)) uses++; 
                } 
                return uses; 
        }

        public void addWord(String word) { 
                this.words.addLast(word);
        }
}