package it.angelosciarra.rockpaperscissors;

import org.junit.Test;


public class SameShapeIsATieTest extends BaseGameTest{

	@Test
	public void itShouldVerifyRuleForRock(){
		givenPlayersPlay(Shape.ROCK);
		whenGameIsPlayed();
		thenGameResultInTie();
	}

	@Test
	public void itShouldVerifyRuleForScissors(){
		givenPlayersPlay(Shape.SCISSORS);
		whenGameIsPlayed();
		thenGameResultInTie();
	}
	
	@Test
	public void itShouldVerifyRuleForPaper(){
		givenPlayersPlay(Shape.PAPER);
		whenGameIsPlayed();
		thenGameResultInTie();
	}
	
	private void givenPlayersPlay(Shape shape) {
		givenPlayerPlays("P1", shape);
		givenPlayerPlays("P2", shape);
	}

}