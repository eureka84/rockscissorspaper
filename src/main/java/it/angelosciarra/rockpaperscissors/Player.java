package it.angelosciarra.rockpaperscissors;

import java.util.Random;

public class Player {
	
	private static Shape[] shapes = {Shape.ROCK, Shape.SCISSORS, Shape.PAPER};
	private String name; 
	private Shape shape; 
	
	public Player(String name) {
		this.name = name;
	}
	
	public Player(String name, Shape shape) {
		this(name); 
		this.shape = shape; 
	}
	
	public Shape play(){
		if (this.shape == null) {
			Random r = new Random();
			int i = r.nextInt(3);
			this.shape = shapes[i];
		} 
		return this.shape;
	}
	
	@Override
	public String toString() {
		return this.name + " has played "+this.shape;
	}

}
