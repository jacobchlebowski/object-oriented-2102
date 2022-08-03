
public class DataAVL implements IAVL {

	String data;
	IAVL left;
	IAVL right;
	DataAVL(String data, IAVL left, IAVL right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	@Override
	public IAVL addElt(String elt) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean hasElt(String elt) {
		// TODO Auto-generated method stub
		return false;
	}
}
