import static org.junit.Assert.*;

import org.junit.Test;

public class Examples1 {

	Song HapBD = new Song("Happy Birthday", 18);
	Song TTLS = new Song("Twinkle Twinkle Little Star", 18);
	
	 @Test
     public void checkHBLen() {
        assertEquals(18, HapBD.lenInSeconds);
      }
	 
	 @Test
	 public void checkTTLSLen() {
		 assertEquals(18, TTLS.lenInSeconds);
	 }

	 @Test
	 public void checkTTLSLength() {
		 assertEquals(17, TTLS.lenInSeconds);
	 }
	 
}