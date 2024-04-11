package tdd;

public class Game {

	private int[][] quilles = new int[100][2];
	private int numTour = 0;
	private int numRollDansTour = 0;

	public void roll(int nb) {
		quilles[numTour][numRollDansTour] = nb;
		if (numRollDansTour == 1) {
			numTour++;
			numRollDansTour = 0;
		}
		else if (nb == 10 && numRollDansTour == 0) {
			quilles[numTour][numRollDansTour+1] = 0;
			numTour++;
		}
		else {
			numRollDansTour = 1;
		}
	}
	
	public int score() {
		int score = 0;
		for (int i = 0; i < numTour; i++) {
			for (int j = 0; j < numRollDansTour; j++) {
				score += quilles[i][j];
			}
			
			
			
			
//			if (i > 0 && (quilles[i-1] + quilles[i]) == 10) {
//				score += quilles[i+1];
//			}
//			if (quilles[i] == 10) {
//				score += (quilles[i+1] + quilles[i+2]);
//			}
			
		}
		return score;
	}
	
	
}
