package it.angelosciarra.rockpaperscissors;

import org.junit.Test;

public class PaperBeatsRockTest extends BaseGameTest{
	
	@Test
	public void givenP2PlaysPaperP2Wins(){
		givenPlayerPlays("P1", Shape.ROCK);
		givenPlayerPlays("P2", Shape.PAPER); 
		whenGameIsPlayed();
		thenPlayer2Wins();
	}
	
	@Test
	public void givenP1PlaysPaperP1Wins(){
		givenPlayerPlays("P2", Shape.ROCK);
		givenPlayerPlays("P1", Shape.PAPER); 
		whenGameIsPlayed();
		thenPlayer1Wins();
	}

}
