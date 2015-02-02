package it.angelosciarra.rockpaperscissors;

/**
 * Player has a name and knows the shape he will play.
 * 
 * @author angelosciarra
 *
 */
public class Player {
	
	private final String name; 
	private final Shape shape; 
	
	public Player(final String name, final Shape shape) {
		this.name = name; 
		this.shape = shape; 
	}
	
	public Shape getShape(){
		return shape;
	}
	
	@Override
	public String toString() {
		return name + " has played "+shape;
	}
	
	public boolean beats(Player other){
		return shape.beats(other.shape);
	}

}
