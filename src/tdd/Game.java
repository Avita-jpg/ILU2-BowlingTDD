package tdd;

public class Game {
	
	private int[] scores = new int[100];
	private int numRoll = 0;
	
	public void roll(int nb) {
		scores[numRoll] = nb;
		numRoll++;
	}

	public int score() {
		int score = 0;
		for (int i = 0; i < numRoll; i++) {
			score += scores[i];
			if (scores[i] == 10) {
				score += 7;
			}
			else {
				if (i > 0 && scores[i-1] != 10 &&(scores[i-1] + scores[i]) == 10)
					score += 4;
			}
		}
		return score;
	}
	
}
