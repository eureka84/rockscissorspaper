package it.angelosciarra.rockpaperscissors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class RockScissorsPaperGame {

	private static final Logger logger = LoggerFactory.getLogger(RockScissorsPaperGame.class);
	
	private final Player player1;
	private final Player player2;

	public RockScissorsPaperGame(final Player p1, final Player p2) {
		logInitialization(p1, p2);
		this.player1 = p1;
		this.player2 = p2;
	}

	public Outcome outcome(){
		Outcome outcome; 
		if(player1.beats(player2)){
			outcome = logAndReturn(Outcome.P1WINS);
		} else if (player2.beats(player1)) {
			outcome = logAndReturn(Outcome.P2WINS);
		} else {
			outcome = logAndReturn(Outcome.TIE);
		}
		return outcome;
	}

	
	
	private void logInitialization(final Player p1, final Player p2) {
		logger.info("----------------");
		logger.info("New game created");
		logger.info(p1.toString());
		logger.info(p2.toString());
	}
	
	private Outcome logAndReturn(final Outcome outcome) {
		logger.info(outcome.toString());
		return outcome;
	}
	
	public enum Outcome{
		TIE, 
		P1WINS,
		P2WINS
	}	
}
