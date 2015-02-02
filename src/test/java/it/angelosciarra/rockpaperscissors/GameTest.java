package it.angelosciarra.rockpaperscissors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import it.angelosciarra.rockpaperscissors.Game;
import it.angelosciarra.rockpaperscissors.Player;
import it.angelosciarra.rockpaperscissors.Shape;

import org.junit.Test;

/**
 * The game is played between two players. Each player simultaneously forms one of three shapes with an outstretched hand. 
 * These shapes are 
 * 	- "rock" (a simple fist), 
 *  - "paper" (a flat hand),
 *  - "scissors" (a fist with the index and middle fingers together forming a V). 
 *  
 * The game has only three possible outcomes other than a tie: a player who decides to play rock will beat another player 
 * who has chosen scissors ("rock crushes scissors") but will lose to one who has played paper ("paper covers rock"); 
 * a play of paper will lose to a play of scissors ("scissors cut paper"). 
 * If both players throw the same shape, the game is tied.
 * 
 * @author angelosciarra
 *
 */
public class GameTest {

	private Player p1; 
	private Player p2;
	private Game g;
	
	@Test
	public void whenPlayersPlaySameShapeOutcomeIsTie(){
		givenPlayersPlaySameShape();
		thenGameOutcomeIsTie();
	}
	
	@Test
	public void whenP1PlaysRockAndP2PlaysScissorsP1Wins() {
		givenP1PlaysRock();
		givenP2PlaysScissors(); 
		thenGameOutcomeIsP1Wins();
	}

	@Test
	public void whenP1PlaysRockAndP2PlaysPaperP2Wins(){
		givenP1PlaysRock();
		givenP2PlaysPaper();
		thenGameOutcomeIsP2Wins();
	}
	
	@Test
	public void whenP1PlaysPaperAndP2PlaysScissorsP2Wins(){
		givenP1PlaysPaper(); 
		givenP2PlaysScissors();
		thenGameOutcomeIsP2Wins(); 
	}
	
	@Test
	public void whenP1PlaysScissorsAndP2PlaysRockP2Wins(){
		givenP1PlaysScissors(); 
		givenP2PlaysRock(); 
		thenGameOutcomeIsP2Wins();
	}
	
	@Test
	public void testGameOutcomeIsNotNull() throws Exception {
		p1 = new Player("P1");
		p2 = new Player("P2");
		g = new Game(p1, p2);
		assertThat(g.outcome(), not(nullValue()));
	}
	
	private void givenP2PlaysRock() {
		p2 = new Player("P2", Shape.ROCK);
	}

	private void givenP1PlaysScissors() {
		p1 = new Player("P1", Shape.SCISSORS);
	}

	private void givenP1PlaysPaper() {
		p1 = new Player("P1", Shape.PAPER);
	}

	private void thenGameOutcomeIsP2Wins() {
		g = new Game(p1, p2);
		assertThat(g.outcome(), is(Game.Outcome.P2WINS));
	}

	private void givenP2PlaysPaper() {
		p2 = new Player("P2", Shape.PAPER);
	}

	private void thenGameOutcomeIsP1Wins() {
		g = new Game(p1, p2); 
		assertThat(g.outcome(), is(Game.Outcome.P1WINS));
	}

	private void givenP2PlaysScissors() {
		p2 = new Player("P2", Shape.SCISSORS);
	}

	private void givenP1PlaysRock() {
		p1 = new Player("P1", Shape.ROCK);
	}

	private void thenGameOutcomeIsTie() {
		g = new Game(p1, p2);
		assertThat(g.outcome(), is(Game.Outcome.TIE));
	}

	private void givenPlayersPlaySameShape() {
		p1 = new Player("P1", Shape.ROCK);
		p2 = new Player("P2", Shape.ROCK);
	}
	
}
