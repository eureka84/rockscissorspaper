package it.angelosciarra.rockpaperscissors;

import org.junit.Test;

public class PaperBeatsRockTest extends BaseGameTest{
	
	@Test
	public void whenP1PlaysRockAndP2PlaysPaperP2Wins(){
		givenPlayerPlays("P1", Shape.ROCK);
		givenPlayerPlays("P2", Shape.PAPER); 
		whenGameIsPlayed();
		thenPlayer2Wins();
	}
	
	@Test
	public void whenP1PlaysPaperAndP2PlaysRockP1Wins(){
		givenPlayerPlays("P2", Shape.ROCK);
		givenPlayerPlays("P1", Shape.PAPER); 
		whenGameIsPlayed();
		thenPlayer1Wins();
	}

}
