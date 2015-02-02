package it.angelosciarra.rockpaperscissors;

import org.junit.Test;

public class ScissorsBeatsPaperTest extends BaseGameTest{
	
	@Test
	public void whenP1PlaysPaperAndP2PlaysScissorsP2Wins(){
		givenPlayerPlays("P1", Shape.PAPER); 
		givenPlayerPlays("P2", Shape.SCISSORS);
		whenGameIsPlayed();
		thenPlayer2Wins();
	}
	
	@Test
	public void whenP1PlaysScissorsAndP2PlaysPaperP1Wins(){
		givenPlayerPlays("P2", Shape.PAPER); 
		givenPlayerPlays("P1", Shape.SCISSORS);
		whenGameIsPlayed();
		thenPlayer1Wins();
	}

}
