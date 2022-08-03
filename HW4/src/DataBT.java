import java.lang.Math;

public class DataBT implements IBinTree {
 int data;
 IBinTree left;
 IBinTree right;

 DataBT(int data, IBinTree left, IBinTree right) {
  this.data = data;
  this.left = left;
  this.right = right;
 }
 
 // an alternate constructor for when both subtrees are empty
 DataBT(int data) {
   this.data = data;
   this.left = new MtBT();
   this.right = new MtBT();
 }

 // determines whether this node or node in subtree has given element
 public boolean hasElt(int e) {
  return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
 }

 
 /**
  * adds 1 to the number of nodes in the left and right subtrees
  */
 public int size() {  
	 return 1 + this.left.size() + this.right.size(); 
	 }

 
 // adds 1 to the height of the taller subtree
 public int height() {
  return 1 + Math.max(this.left.height(), this.right.height());
 }
 

 
 /**
  * checks to see if every node after it (left and right subtrees) is greater
  * @param elt
  * @return true if node after is greater
  */
public boolean greaterThan(int elt) {
	boolean x = true;
	boolean y = true;
	
	
	if (this.data >= elt) {
		if(this.left != null) {
			x = this.left.greaterThan(elt);
		}
		if(this.right != null) {
			y = this.right.greaterThan(elt);
		}
		
		return (x && y);
	}
	else {
		return false;
	}	
}



/**
 * checks to see if BST is a heap
 * @return true if BST is a heap
 */
 public boolean isHeap() {
	return greaterThan(this.data);
 }
 
 
 
/**
 * counts all elements in a BST
 * @param e
 * @return num of elements in a BST
 */
 public int countElt(int e) {
	 //consider the case where e is equal to the current node value
	 if (this.data == e) {
		 return 1 + this.left.countElt(e) + this.right.countElt(e);
	 } 
	 else {
		 return this.left.countElt(e) + this.right.countElt(e);
	 }
 }
 
 
/**
 * checks to see if all elements in a BST are in a new (added) BST
 * @param hOriginal
 * @param elt
 * @param hAdded
 * @return true if elements in a BST are accounted for
 */
 public boolean allAccountedFor(IHeap hOrig, int elt, IBinTree hAdded) {
	 int orig_count = hOrig.countElt(elt);
	 int added_count = hAdded.countElt(elt);
	 if (this.data == elt) {
	 if (orig_count + 1 == added_count) {
	 return this.left.allAccountedFor(hOrig, elt, hAdded) && this.right.allAccountedFor(hOrig, elt, hAdded);
	 }
	 else {
	 return false;
	 }
	 }
	 else {
	 if (orig_count + 1 == added_count) {

	 return this.left.allAccountedFor(hOrig, elt, hAdded) && this.right.allAccountedFor(hOrig, elt, hAdded);
	 }
	 return false;
	 }
	 }
 
 
 

 
 
 
 /**
  * checks to see if all elements in a BST are in a new (removed) BST
  * @param hOriginal
  * @param e
  * @param hRemoved
  * @return true if elements in BST are accounted for
  * 
  */
 public boolean remAllAccountedFor(IHeap hOrig, int e, IBinTree hRemoved) {
	 int orig_count = hOrig.countElt(e);
	 int added_count = hRemoved.countElt(e);
	 if (this.data == e) {
	 if (orig_count - 1 == added_count) {
	 return this.left.remAllAccountedFor(hOrig, e, hRemoved) && this.right.remAllAccountedFor(hOrig, e, hRemoved);
	 }
	 else {
	 return false;
	 }
	 }
	 else {
	 if (orig_count - 1 == added_count) {

	 return this.left.remAllAccountedFor(hOrig, e, hRemoved) && this.right.remAllAccountedFor(hOrig, e, hRemoved);
	 }
	 return false;
	 }  
	 }

 
 
 
 /**
  * gets the data at a given node and puts into remAllAccountedFor
  * @param hOriginal
  * @param hRemoved
  * @return remAllAccountedFor with given data at node
  */
 public boolean remAccountedForHelper(IHeap hOriginal, IBinTree hRemoved) {
	 return remAllAccountedFor(hOriginal, this.data, hRemoved);
 }
 
 
 
 
 
 
	 
 
}