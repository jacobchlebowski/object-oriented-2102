
public interface IBinTree {
 // determines whether element is in the tree
 boolean hasElt(int e);
 // returns number of nodes in the tree; counts duplicate elements as separate items
 int size();
 // returns depth of longest branch in the tree
 int height();
 
 //checks if its a heap
 public boolean isHeap();
 
 //isGreaterThan
 public boolean greaterThan(int elt);
 
 
 //counts how many times the element appears in the binary tree
 public int countElt(int e);
 
 
 public boolean allAccountedFor(IHeap hOriginal, int elt, IBinTree hAdded);
 
 
 
 public boolean remAllAccountedFor(IHeap hOriginal, int e, IBinTree hRemoved);
 
 
 //javaDocs in DataBT
 public boolean remAccountedForHelper(IHeap hOriginal, IBinTree hRemoved);
 
}