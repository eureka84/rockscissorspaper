package it.angelosciarra.rockpaperscissors;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import it.angelosciarra.rockpaperscissors.RockScissorsPaperGame.Outcome;

public class BaseGameTest {
	
	protected Player player1; 
	protected Player player2;
	protected RockScissorsPaperGame game;
	protected Outcome outcome;
	
	protected void givenPlayerPlays(String player, Shape shape) {
		if(player.equals("P1")){
			player1 = new Player("P1", shape);
		} else {
			player2 = new Player("P2", shape); 
		}
	}
	
	protected void whenGameIsPlayed() {
		game = new RockScissorsPaperGame(player1,player2);
		outcome = game.outcome();
	}
	
	protected void thenPlayer1Wins() {
		assertThat(outcome, is(RockScissorsPaperGame.Outcome.P1WINS));
	}
	
	protected void thenPlayer2Wins() {
		assertThat(outcome, is(RockScissorsPaperGame.Outcome.P2WINS));
	}
	
	protected void thenGameResultInTie() {
		assertThat(outcome, is(RockScissorsPaperGame.Outcome.TIE));
	}

}
