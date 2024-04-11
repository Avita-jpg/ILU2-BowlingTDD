package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest extends Game {

	private Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}
	
	
	@Test
	void test1() {
		assertTrue(game.score() == 0);
	}

}
