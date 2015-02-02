package it.angelosciarra.rockpaperscissors;

import org.junit.Test;

public class RockBeatsScissorsTest extends BaseGameTest {

	@Test
	public void givenP1PlaysRockP1Wins(){
		givenPlayerPlays("P1", Shape.ROCK);
		givenPlayerPlays("P2", Shape.SCISSORS); 
		whenGameIsPlayed();
		thenPlayer1Wins();
	}
	
	@Test
	public void givenP2PlaysRockP2Wins(){
		givenPlayerPlays("P2", Shape.ROCK);
		givenPlayerPlays("P1", Shape.SCISSORS); 
		whenGameIsPlayed();
		thenPlayer2Wins();
	}
	
}
