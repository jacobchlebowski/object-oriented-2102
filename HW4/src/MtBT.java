
public class MtBT implements IBinTree {
 MtBT(){}

 // returns false since empty tree has no elements
 public boolean hasElt(int e) {
  return false;
 }

 // returns 0 since enpty tree has no elements
 public int size() {
  return 0;
 }

 // returns 0 since empty tree has no branches
 public int height() {
  return 0;
 }
 
 //is root smaller than the rest of the heap
 public boolean isHeap() {
		return true;
	}
 
 
 /**
  * @param elt
  * @return true since empty BT
  */
 public boolean greaterThan(int elt) {
	 return true;
 }
 
 
 /**
  * @param e
  * @return 0 since empty BT
  */
 public int countElt(int e) {
	 return 0;
 }
 
 
  /**
   * 
   * @param hOriginal
   * @param elt
   * @param hAdded
   * @return true since empty BT
   */
 public boolean allAccountedFor(IHeap hOriginal, int elt, IBinTree hAdded) {
	 return true;
 }


 
 /**
  * 
  * @param hOriginal
  * @param hRemoved
  * @return true since empty BT
  */
 public boolean remAllAccountedFor(IHeap hOriginal, IBinTree hRemoved) {
	 return true;
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