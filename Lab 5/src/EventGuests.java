import java.util.LinkedList;

// A class for storing guests at a (potentially large) event

  public class EventGuests implements IBST,ILinkedLists, IAVL{

    IBST guests;
    IAVL guests2;
    ILinkedLists guests3;
    Object o;

    public EventGuests(ISet guests) {
      this.guests = guests;
    }
    
   
    
  

    // record a new guest as coming (add the guest to the set)

    public EventGuests(LinkedList<String> linkedList) {
    	//TODO Auto-Generated constructor stub
    }
    
    
    
   public void addGuest(String newGuestName) {
      this.guests = addElt(newGuestName);
    }

  

    // check whether a guest is coming (use hasElt() to see if
    // the guest is in the set)

    public boolean isComing(String name) {

      return hasElt(name);

    }

    // return the number of guests in the guest list 
  public int numGuests(){

       return guests.size();

    }





@Override
public ILinkedLists addElt() {
	// TODO Auto-generated method stub
	return null;
}





@Override
public IBST addElt(String elt) {
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