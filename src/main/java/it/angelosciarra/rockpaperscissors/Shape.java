package it.angelosciarra.rockpaperscissors;

/**
 * Shape you can play in Rock-Scissors-Paper game. 
 * Each shape knows which shape it can beat.
 * 
 * @author angelosciarra
 *
 */
public enum Shape {
	ROCK("SCISSORS"), 
	SCISSORS("PAPER"), 
	PAPER("ROCK"); 
	
	private String beats;

	private Shape(final String beats) {
		this.beats = beats;
	}
	
	public boolean beats(final Shape other){
		return Shape.valueOf(beats) == other; 
	}
}
