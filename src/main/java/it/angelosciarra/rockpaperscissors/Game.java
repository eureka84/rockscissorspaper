package it.angelosciarra.rockpaperscissors;

public class Game {

	private Player p1;
	private Player p2;

	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Outcome outcome(){
		if(p1.play()==p2.play()){
			return Outcome.TIE;
		} else {
			switch(p1.play()){
				case ROCK: 
					if(p2.play()==Shape.SCISSORS){
						return Outcome.P1WINS;
					} else {
						return Outcome.P2WINS;
					}
				case SCISSORS: 
					if(p2.play()==Shape.PAPER){
						return Outcome.P1WINS;
					} else {
						return Outcome.P2WINS;
					}
				case PAPER: 
					if(p2.play()==Shape.ROCK){
						return Outcome.P1WINS;
					} else {
						return Outcome.P2WINS;
					}
				default:
					return Outcome.TIE;
			}
		}
	}
	
	public enum Outcome{
		TIE, 
		P1WINS,
		P2WINS
	}
}
