public class RugbyTeam {
    boolean ritual;
    int numWins;
    int numLosses;
 
    
    public RugbyTeam(boolean ritual, int numWins, int numLosses) {
    	this.ritual = ritual;
    	this.numWins = numWins;
    	this.numLosses = numLosses;
    }
    
   
    
    
    //if only one team has an intimidation ritual, that team is the expected winner; 
    //if neither or both teams have such rituals, the expected winner is the one with 
    //a better win/loss ratio. 
    public boolean expectToBeat(RugbyTeam other) {
        if(this.ritual && !other.ritual) return true;
        if(!this.ritual && other.ritual) return false;
  
        int thisWinLoss = this.numWins - this.numLosses;
        int otherWinLoss = other.numWins - other.numLosses;
  
        if(thisWinLoss > otherWinLoss) return true;
        else return false;
        
        
    }
}
