package tdd;

public class Game {

	private int nb;

	public void roll(int nb) {
		this.nb += nb;
		return; 
	}
	
	public int score() {
		return nb;
	}
}
