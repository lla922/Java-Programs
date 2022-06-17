package bgm.main;

import bgm.models.Players;
import bgm.models.TicTacToeGame;

public class Driver {

	public static void main(String[] args) {

		Players p1 = new Players('x', "Begum");

		Players p2 = new Players('o', "Nurkal");

		TicTacToeGame game = new TicTacToeGame(p1, p2);
		game.play();

		// game.printGame();

	}

}
