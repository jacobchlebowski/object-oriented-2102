
public class HeapChecker implements IHeap {

	


	/**
	 * Verify if the binary tree we create is a valid heap
	 * @param hOriginal
	 * @param elt
	 * @param hAdded
	 * @return true if tree is valid
	 */
	public boolean addEltTester(IHeap hOriginal, int elt, IBinTree hAdded) {
             return (hAdded.isHeap()) && (hOriginal.size()+1 == hAdded.size()) && (hOriginal.allAccountedFor(hOriginal,elt,hAdded));
		  }

	
	/**
	 * Verify if the binary tree we create is a valid heap
	 * @param hOriginal
	 * @param hRemoved
	 * @return true if tree is valid
	 */
	 public boolean remMinEltTester(IHeap hOriginal, IBinTree hRemoved) {
			    return hRemoved.isHeap() && hOriginal.size() == hRemoved.size()+1 && hOriginal.remAccountedForHelper(hOriginal, hRemoved); 
			  }
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean hasElt(int e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean greaterThan(int elt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean allAccountedFor(IHeap hOriginal, int elt, IBinTree hAdded) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IHeap remMinElt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHeap merge(IHeap withHeap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBigger(int e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHeap() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countElt(int elt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IHeap addElt(int e) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean remAllAccountedFor(IHeap hOriginal, int e, IBinTree hRemoved) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean remAccountedForHelper(IHeap hOriginal, IBinTree hRemoved) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	

}
