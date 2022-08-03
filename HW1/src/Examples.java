import static org.junit.Assert.*;

import org.junit.Test;

//Jacob Chlebowski, Zaq Humphrey

public class Examples {

	
   ShootingRound testRound1 = new ShootingRound(1);
   ShootingRound testRound2 = new ShootingRound(2);
   ShootingRound testRound3 = new ShootingRound(3);
   ShootingRound testRound4 = new ShootingRound(4);
   ShootingRound testRound5 = new ShootingRound(5);
	ShootingResult testShootingResult = new ShootingResult(testRound1, testRound2, testRound3, testRound4);
	SkiingResult testSkiingResult = new SkiingResult(2, 60, 45, 51, 49, 3);
	
	//POINTS EARNED AND GET PENALTIES TESTS
	@Test //returns double
	public void PointsEarnedShootingResult() {
		assertEquals(testShootingResult.pointsEarned(), 10, .01);
	}

	@Test //returns double
	public void PointsEarnedSkiingResult() {
		assertEquals(testSkiingResult.pointsEarned(), 205, 0.1);
	}
	
	@Test //returns double
	public void getPenaltiesShootingResult() {
		assertEquals(testShootingResult.getPenalties(), 600, 0.1);
	}
	
	@Test //returns double
	public void getPenaltiesSkiingResult() {
		assertEquals(testSkiingResult.getPenalties(), 15, 0.1);
	}
	
	
	
	
	//FINAL SCORE TESTS (tested SkiingResult at pos 1,2,3,4, and 5)
	
	ShootingResult finalScoreShootingResult1 = new ShootingResult(testRound2, testRound4, testRound5, testRound2);
	ShootingResult finalScoreShootingResult2 = new ShootingResult(testRound5, testRound1, testRound4, testRound3);
	ShootingResult finalScoreShootingResult3 = new ShootingResult(testRound3, testRound4, testRound3, testRound4);
	ShootingResult finalScoreShootingResult4 = new ShootingResult(testRound1, testRound4, testRound5, testRound3);
	ShootingResult finalScoreShootingResult5 = new ShootingResult(testRound4, testRound4, testRound4, testRound4);
	
	SkiingResult finalScoreSkiingResultpos1 = new SkiingResult(1, 66, 42, 50, 90, 3);
	SkiingResult finalScoreSkiingResultpos2 = new SkiingResult(2, 62, 50, 46, 69, 5);
	SkiingResult finalScoreSkiingResultpos3 = new SkiingResult(3, 80, 70, 60, 50, 0);
	SkiingResult finalScoreSkiingResultpos4 = new SkiingResult(4, 60, 65, 62, 59, 10);
	SkiingResult finalScoreSkiingResultpos5 = new SkiingResult(5, 78, 79, 92, 84, 15);
	
	
	
	FinalResult testFinalResult1 = new FinalResult(finalScoreShootingResult1, finalScoreSkiingResultpos1);
	FinalResult testFinalResult2 = new FinalResult(finalScoreShootingResult2, finalScoreSkiingResultpos2);
	FinalResult testFinalResult3 = new FinalResult(finalScoreShootingResult3, finalScoreSkiingResultpos3);
	FinalResult testFinalResult4 = new FinalResult(finalScoreShootingResult4, finalScoreSkiingResultpos4);
	FinalResult testFinalResult5 = new FinalResult(finalScoreShootingResult5, finalScoreSkiingResultpos5);
	
	@Test
	public void testFinalScore1() {
		assertEquals(testFinalResult1.finalScore(),673,0.1);
	}
	
	@Test
	public void testFinalScore2() {
		assertEquals(testFinalResult2.finalScore(),665,0.1);
	}
	
	@Test
	public void testFinalScore3() {
		assertEquals(testFinalResult3.finalScore(),617,0.1);
	}
	
	@Test
	public void testFinalScore4() {
		assertEquals(testFinalResult4.finalScore(),715,0.1);
	}
	
	@Test
	public void testFinalScore5() {
		assertEquals(testFinalResult5.finalScore(),648,0.1);
	}
	
	
	//BETTER SKIIER BETTER SHOOTER HASBEATEN TESTS
	Athlete testAthlete1 = new Athlete(testFinalResult1);
	Athlete testAthlete2 = new Athlete(testFinalResult2);
	
	
	//BETTER SKIIER TESTS
	@Test
	public void testBetterSkiier1() {
		assertFalse(testAthlete1.betterSkiier(testAthlete2));
	}
	
	@Test
	public void testBetterSkiier2() {
		assertTrue(testAthlete2.betterSkiier(testAthlete1));
	}
	
	
	//BETTER SHOOTER TESTS
	@Test
	public void testBetterShooter1() {
		assertFalse(testAthlete1.betterShooter(testAthlete2));
	}
	
	@Test
	public void testBetterShooter2() {
		assertFalse(testAthlete2.betterShooter(testAthlete1));
	}
	
	
	//HASBEATEN TESTS
	@Test
	public void testHasBeaten1() {
		assertTrue(testAthlete2.hasBeaten(testAthlete1));
	}
	
	@Test
	public void testHasBeaten2() {
		assertFalse(testAthlete1.hasBeaten(testAthlete2));
	}
	
	
	
}
