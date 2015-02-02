package it.angelosciarra.rockpaperscissors;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import it.angelosciarra.rockpaperscissors.RockScissorsPaperGame.Outcome;

public class BaseGameTest {
	
	protected Player p1; 
	protected Player p2;
	protected RockScissorsPaperGame g;
	protected Outcome outcome;
	
	protected void givenPlayerPlays(String player, Shape shape) {
		if(player.equals("P1")){
			p1 = new Player("P1", shape);
		} else {
			p2 = new Player("P2", shape); 
		}
	}
	
	protected void whenGameIsPlayed() {
		g = new RockScissorsPaperGame(p1,p2);
		outcome = g.outcome();
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
