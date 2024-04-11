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
		for (int i = 0; i < 10; i ++) {
			game.roll(1);
		}
		for (int i = 0; i < 10; i ++) {
			game.roll(2);
		}
		System.out.println(game.score());
		assertTrue(game.score() == 30);
	}
	
	@Test
	void test2() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		for (int i = 0; i < 17; i ++) {
			game.roll(0);
		}
		System.out.println(game.score());
		assertTrue(game.score() == 18);
	}
	
	@Test
	void test3() {
		game.roll(10);
		game.roll(3);
		game.roll(4);
		
		for (int i = 0; i < 16; i ++) {
			game.roll(0);
		}
		System.out.println(game.score());
		assertTrue(game.score() == 24);
	}
	
	
	

	

}
