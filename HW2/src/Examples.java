import static org.junit.Assert.*;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

//Jacob Chlebowski, Zaq Humphrey

public class Examples {

	LinkedList<ShootingRound> rounds = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> rounds1 = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> rounds2 = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> rounds3 = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> rounds4 = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> rounds5 = new LinkedList<ShootingRound>();
	ShootingRound testRound1 = new ShootingRound(1, true);
	ShootingRound testRound2 = new ShootingRound(2, false);
	ShootingRound testRound3 = new ShootingRound(3, true);
	ShootingRound testRound4 = new ShootingRound(4, false);
	ShootingRound testRound5 = new ShootingRound(5, true);

	@Before
	public void setup() {
		rounds.add(testRound1);
		rounds.add(testRound2);
		rounds.add(testRound3);
		rounds.add(testRound4);
		rounds1.add(testRound2);
		rounds1.add(testRound4);
		rounds1.add(testRound5);
		rounds1.add(testRound2);
		rounds2.add(testRound5);
		rounds2.add(testRound1);
		rounds2.add(testRound4);
		rounds2.add(testRound3);
		rounds3.add(testRound3);
		rounds3.add(testRound4);
		rounds3.add(testRound3);
		rounds3.add(testRound4);
		rounds4.add(testRound1);
		rounds4.add(testRound4);
		rounds4.add(testRound5);
		rounds4.add(testRound3);
		rounds5.add(testRound4);
		rounds5.add(testRound4);
		rounds5.add(testRound4);
		rounds5.add(testRound4);
	}

	// POINTS EARNED AND GET PENALTIES TESTS

	@Test // returns double
	public void PointsEarnedShootingResult() {
		ShootingResult testShootingResult = new ShootingResult(rounds);
		assertEquals(testShootingResult.pointsEarned(), 10, .01);
	}

	@Test
	public void PointsEarnedSkiingResult() {
		SkiingResult testSkiingResult = new SkiingResult(2, 60, 45, 51, 49, 3);
		assertEquals(testSkiingResult.pointsEarned(), 205, 0.1);
	}

	@Test
	public void getPenaltiesShootingResult() {
		ShootingResult testShootingResult = new ShootingResult(rounds);
		assertEquals(testShootingResult.getPenalties(), 600, 0.1);
	}

	@Test
	public void getPenaltiesSkiingResult() {
		SkiingResult testSkiingResult = new SkiingResult(2, 60, 45, 51, 49, 3);
		assertEquals(testSkiingResult.getPenalties(), 15, 0.1);
	}

	// FINAL SCORE TESTS (tested SkiingResult at pos 1,2,3,4, and 5)
	ShootingResult finalScoreShootingResult1 = new ShootingResult(rounds1);
	ShootingResult finalScoreShootingResult2 = new ShootingResult(rounds2);
	ShootingResult finalScoreShootingResult3 = new ShootingResult(rounds3);
	ShootingResult finalScoreShootingResult4 = new ShootingResult(rounds4);
	ShootingResult finalScoreShootingResult5 = new ShootingResult(rounds5);

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
		assertEquals(testFinalResult1.finalScore(), 673, 0.1);
	}

	@Test
	public void testFinalScore2() {
		assertEquals(testFinalResult2.finalScore(), 665, 0.1);
	}

	@Test
	public void testFinalScore3() {
		assertEquals(testFinalResult3.finalScore(), 617, 0.1);
	}

	@Test
	public void testFinalScore4() {
		assertEquals(testFinalResult4.finalScore(), 715, 0.1);
	}

	@Test
	public void testFinalScore5() {
		assertEquals(testFinalResult5.finalScore(), 648, 0.1);
	}

	// BETTER SKIIER BETTER SHOOTER HASBEATEN TESTS
	Athlete testAthlete1 = new Athlete(testFinalResult1, "Jacob");
	Athlete testAthlete2 = new Athlete(testFinalResult2, "Zaq");

	// BETTER SKIIER TESTS

	@Test
	public void testBetterSkiier1() {
		assertFalse(testAthlete1.betterSkiier(testAthlete2));
	}

	@Test
	public void testBetterSkiier2() {
		assertTrue(testAthlete2.betterSkiier(testAthlete1));
	}

	// BETTER SHOOTER TESTS

	@Test
	public void testBetterShooter1() {
		assertFalse(testAthlete1.betterShooter(testAthlete2));
	}

	@Test
	public void testBetterShooter2() {
		assertFalse(testAthlete2.betterShooter(testAthlete1));
	}

	// HASBEATEN TESTS

	@Test
	public void testHasBeaten1() {
		assertTrue(testAthlete2.hasBeaten(testAthlete1));
	}

	@Test
	public void testHasBeaten2() {
		assertFalse(testAthlete1.hasBeaten(testAthlete2));
	}

	// bestRoundByType TESTS

	@Test
	public void testBestRoundByTypeEmptyRounds() {
		LinkedList<ShootingRound> emptyRounds = new LinkedList<ShootingRound>();
		ShootingResult emptyRounds1 = new ShootingResult(emptyRounds);
		assertEquals(emptyRounds1.bestRoundByType(true), null);
	}

	@Test
	public void testBestRoundByTypeStandingRounds() {
		ShootingResult testShootingResult = new ShootingResult(rounds);
		assertEquals(testShootingResult.bestRoundByType(true), testRound3);
	}

	@Test
	public void testBestRoundByTypeProneRounds() {
		ShootingResult testShootingResult = new ShootingResult(rounds);
		assertEquals(testShootingResult.bestRoundByType(false), testRound4);
	}
	
	
	@Test
	public void testBestRoundByTypeMoreThanOneBestRound() {
		ShootingResult testShootingResult = new ShootingResult(rounds5);
		assertEquals(testShootingResult.bestRoundByType(false), testRound4);
	}
	
	
	//ShootingDNF TESTS
	
	@Test
	public void everyoneFinishedShootingDNF() {
		LinkedList<Athlete> everyoneFinished = new LinkedList<Athlete>();
		everyoneFinished.add(testAthlete1);
		everyoneFinished.add(testAthlete2);
		LinkedList<Athlete> emptyList = new LinkedList<Athlete>();
		Competition aCompetition = new Competition(4,everyoneFinished);
		assertEquals(aCompetition.shootingDNF() , emptyList);
	}
	
	
	@Test
	public void notEveryoneFinishedShootingDNF() {
		LinkedList<Athlete> notEveryoneFinished = new LinkedList<Athlete>();
		notEveryoneFinished.add(testAthlete1);
		notEveryoneFinished.add(testAthlete2);
		LinkedList<String> names = new LinkedList<String>();
		names.add(testAthlete1.name);
		names.add(testAthlete2.name);
		Competition aCompetition = new Competition(5, notEveryoneFinished);
		assertEquals(aCompetition.shootingDNF() , names);
	}
	
	
	//finalScoreForAthlete TESTS
	@Test
	public void testFinalScoreForAthlete() {
		LinkedList<Athlete> athletes = new LinkedList<Athlete>();
		athletes.add(testAthlete1);
		athletes.add(testAthlete2);
		Competition aCompetition = new Competition(4, athletes);
		assertEquals(aCompetition.finalScoreForAthlete(testAthlete1.name), 673.0, 0.1);
	}
	
	
	//anyImprovement TESTS
	@Test
	public void testAnyImprovementSameScore() {
		LinkedList<Athlete> athletes = new LinkedList<Athlete>();
		athletes.add(testAthlete1);
		athletes.add(testAthlete2);
		Competition aCompetition = new Competition(4, athletes);
		assertFalse(aCompetition.anyImprovement(aCompetition));
	}
	
	
	@Test
	public void testAnyImprovement1() {
		LinkedList<Athlete> athletes = new LinkedList<Athlete>();
		Athlete testAthlete10 = new Athlete(testFinalResult2, "Jacob");
		athletes.add(testAthlete10);
		Competition aCompetition = new Competition(4, athletes);
		
		LinkedList<Athlete> athletes2 = new LinkedList<Athlete>();
		athletes2.add(testAthlete1);
		Competition aCompetition2 = new Competition(4, athletes2);
		
		assertTrue(aCompetition2.anyImprovement(aCompetition));
	}
	
	
	
	@Test
	public void testAnyImprovement2() {
		LinkedList<Athlete> athletes = new LinkedList<Athlete>();
		Athlete testAthlete10 = new Athlete(testFinalResult2, "Jacob");
		athletes.add(testAthlete10);
		Competition aCompetition = new Competition(4, athletes);
		
		LinkedList<Athlete> athletes2 = new LinkedList<Athlete>();
		athletes2.add(testAthlete1);
		Competition aCompetition2 = new Competition(4, athletes2);
		
		assertFalse(aCompetition.anyImprovement(aCompetition2));
	}
	

	
	
	
	
	
}