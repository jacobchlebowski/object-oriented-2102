
public class EmptyAVL implements IAVL {

	EmptyAVL() {}
	
 public int size() {return 0;}
 
 public IAVL addElt(String elt) {
	 return new DataAVL(elt, new EmptyAVL(), new EmptyAVL());
 }

 public boolean hasElt (String elt) {return false; }
}
