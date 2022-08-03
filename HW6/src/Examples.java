import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	public Examples() {
	}

	 // method to set up a ballot and cast votes
	  ElectionData Setup1 () {
	    ElectionData ED = new ElectionData();
	    // put candidates on the ballot
	    try {
	       ED.addCandidate("gompei");
	       ED.addCandidate("husky");
	       ED.addCandidate("ziggy");
	    } catch (CandidateExistsException e) {}
	    // cast votes
	    try {
	      ED.processVote("gompei", "husky", "ziggy");
	      ED.processVote("gompei", "ziggy", "husky");
	      ED.processVote("husky", "gompei", "ziggy");
	    } catch (DuplicateVotesException e) {}
	    catch (UnknownCandidateException e) {}
	    return(ED);
	  }

	  // now run a test on a specific election
	  //testMostFirstWinner
	  @Test
	  public void testMostFirstWinner () {
	    assertEquals ("gompei", Setup1().findWinnerMostFirstVotes());
	  }
	
	

	  
	  
	  
	  
	  //ELECTION WHERE CANDIDATE IS UNKNOWN
	  ElectionData Setup2 () throws UnknownCandidateException {
		    ElectionData ED = new ElectionData();
		    // put candidates on the ballot
		    try {
		       ED.addCandidate("gompei");
		       ED.addCandidate("husky");
		       ED.addCandidate("ziggy");
		    } catch (CandidateExistsException e) {}
		    // cast votes
		    try {
		      ED.processVote("gompei", "husky", "ziggy");
		      ED.processVote("gompei", "ziggy", "husky");
		      ED.processVote("husky", "gompei", "john");
		    } catch (DuplicateVotesException e) {}

		    return(ED);
		  }
	  
	  @Test(expected=UnknownCandidateException.class)
	  public void unknownCandidate() throws UnknownCandidateException, CandidateExistsException,DuplicateVotesException
	  {
	  	Setup2().findWinnerMostPoints();
	  }
	  
	  
	  
	  
	  //ELECTION WHERE CANDIDATE IS A DUPLICATE
	  ElectionData Setup3 () throws DuplicateVotesException {
		    ElectionData ED = new ElectionData();
		    // put candidates on the ballot
		    try {
		       ED.addCandidate("gompei");
		       ED.addCandidate("husky");
		       ED.addCandidate("ziggy");
		    } catch (CandidateExistsException e) {}
		    // cast votes
		    try {
		      ED.processVote("gompei", "gompei", "ziggy");
		      ED.processVote("gompei", "ziggy", "husky");
		      ED.processVote("husky", "gompei", "john");
		    } catch (UnknownCandidateException e) {}

		    return(ED);
		  }
	  
	  
	  @Test(expected=DuplicateVotesException.class)
	  public void duplicateVotes() throws UnknownCandidateException, CandidateExistsException,DuplicateVotesException
	  {
	  	Setup3().findWinnerMostPoints();
	  }
	  
	  
	
	  //CANDIDATE EXISTS EXCEPTION
	  ElectionData Setup4 () throws CandidateExistsException {
		    ElectionData ED = new ElectionData();
		    // put candidates on the ballot
		    try {
		       ED.addCandidate("gompei");
		       ED.addCandidate("gompei");
		       ED.addCandidate("ziggy");
		    } catch (CandidateExistsException e) {throw e;}
		    // cast votes
		    try {
		      ED.processVote("gompei", "gompei", "ziggy");
		      ED.processVote("gompei", "ziggy", "husky");
		      ED.processVote("husky", "gompei", "john");
		    } catch (DuplicateVotesException e) {}
		    catch (UnknownCandidateException e) {}

		    return(ED);
		  }
	  
	  
	  @Test(expected=CandidateExistsException.class)
	  public void candidateExists() throws CandidateExistsException, DuplicateVotesException, UnknownCandidateException
	  {
	  	Setup4().findWinnerMostPoints();
	  }
	  
	 
	  
	  
	  
	  //RUNOFF REQUIRED TIE
	  ElectionData Setup5 () {
		    ElectionData ED = new ElectionData();
		    // put candidates on the ballot
		    try {
		       ED.addCandidate("gompei");
		       ED.addCandidate("husky");
		       ED.addCandidate("ziggy");
		    } catch (Exception e) {}
		    // cast votes
		    try {
		      ED.processVote("gompei", "husky", "ziggy");
		      ED.processVote("gompei", "ziggy", "husky");
		      ED.processVote("husky", "gompei", "ziggy");
		      ED.processVote("husky", "gompei", "ziggy");
		      ED.processVote("ziggy", "gompei", "husky");
		    } catch (Exception e) {}
		    return(ED);
		  }
	 
	  @Test
	  public void testMostFirstWinnerRunOff() {
	    assertEquals ("Runoff required", Setup5().findWinnerMostFirstVotes());
	  }
	  
	  

	  
	  
	  //FINDWINNER MOST POINTS
	  ElectionData Setup6 () {
		    ElectionData ED = new ElectionData();
		    // put candidates on the ballot
		    try {
		       ED.addCandidate("gompei");
		       ED.addCandidate("husky");
		       ED.addCandidate("ziggy");
		    } catch (Exception e) {}
		    // cast votes
		    try {
		      ED.processVote("gompei", "husky", "ziggy");
		      ED.processVote("gompei", "ziggy", "husky");
		      ED.processVote("husky", "gompei", "ziggy");
		    } catch (Exception e) {}
		    return(ED);
		  }
	  
	  @Test
	  public void testFindWinnerMostPoints() {
	    assertEquals ("gompei", Setup6().findWinnerMostPoints());
	  }
	
	  
	  
	  
	  
	//FINDWINNER MOST POINTS TIE
	  ElectionData Setup7 () {
		    ElectionData ED = new ElectionData();
		    // put candidates on the ballot
		    try {
		       ED.addCandidate("gompei");
		       ED.addCandidate("husky");
		       ED.addCandidate("ziggy");
		    } catch (Exception e) {}
		    // cast votes
		    try {
		      ED.processVote("gompei", "husky", "ziggy");
		      ED.processVote("ziggy", "husky", "gompei");
		    } catch (Exception e) {}
		    return(ED);
		  }
	  
	  
	  @Test
	  public void testFindWinnerMostPointsTie() {
	    assertEquals ("gompei", Setup7().findWinnerMostPoints());
	  }
	  
	  
	  
	  
	  
	  
	  
	
}





