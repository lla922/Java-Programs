package bgm.models;

import java.util.Scanner;

public class TicTacToeGame {

	private static Scanner scanner = new Scanner(System.in);
	private Players xPlayer;
	private Players oPlayer;
	private Players winner;

	private BoardGame tictactoegame;
	private char[][] tictactoeboard;

	/*
	 * Yeni bir boardgame yaratildi ismi tictactoe . Otomatik initialize edinlen 3'e
	 * 3 oyun tahtasina erisildi ve tictactoeboard`a atandi , islem yapilmak uzere.
	 * 
	 */

	public TicTacToeGame(Players xPlayer, Players oPlayer) {

		tictactoegame = new BoardGame();
		tictactoeboard = tictactoegame.getGameTable();
		this.xPlayer = xPlayer;
		this.oPlayer = oPlayer;

	}

	public boolean isPoints() {

		return isRow() || isDiagonal() || isCDiagonal() || isColumn();

	}

	public String congratsMessage() {
		if (isPoints()) {
			if (getWinner() == xPlayer) {
				return "CONGRATS ! " + xPlayer.getName() + " is the winner ! (x)";
			} else if (getWinner() == oPlayer) {
				return "CONGRATS !  " + oPlayer.getName() + " O is the winner ! (o)";
			}
		}
		return null;
	}

	private boolean isColumn() {

		int x = 0;

		for (int i = 0; i < 3; i++) {
			if (tictactoeboard[x][i] != ' ') {
				if (tictactoeboard[x][i] == tictactoeboard[x + 1][i]
						&& tictactoeboard[x + 1][i] == tictactoeboard[x + 2][i]) {
					if (tictactoeboard[x][i] == xPlayer.getXorO()) {
						setWinner(xPlayer);
					} else if (tictactoeboard[x][i] == oPlayer.getXorO()) {
						setWinner(oPlayer);
					}

					return true;
				}
			}

		}
		return false;

	}

	private boolean isRow() {

		for (int m = 0; m < 3; m++) {

			boolean row = false;
			boolean row2 = false;
			boolean row3 = false;

			switch (m) {
			case 0:

				int x = 0;
				if (tictactoeboard[m][x] != ' ') {
					if (tictactoeboard[m][x] == tictactoeboard[m][x + 1]
							&& tictactoeboard[m][x + 1] == tictactoeboard[m][x + 2]) {
						if (tictactoeboard[m][x] == xPlayer.getXorO()) {
							setWinner(xPlayer);
						} else {
							setWinner(oPlayer);
						}
						row = true;
						break;
					}
				}
			case 1:

				int w = 0;
				if (tictactoeboard[m][w] != ' ') {
					if (tictactoeboard[m][w] == tictactoeboard[m][w + 1]
							&& tictactoeboard[m][w + 1] == tictactoeboard[m][w + 2]) {
						if (tictactoeboard[m][w] == xPlayer.getXorO()) {
							setWinner(xPlayer);
						} else {
							setWinner(oPlayer);
						}
						row2 = true;
						break;
					}
				}
			case 2:

				int y = 0;
				if (tictactoeboard[m][y] != ' ') {
					if (tictactoeboard[m][y] == tictactoeboard[m][y + 1]
							&& tictactoeboard[m][y + 1] == tictactoeboard[m][y + 2]) {
						if (tictactoeboard[m][y] == xPlayer.getXorO()) {
							setWinner(xPlayer);
						} else {
							setWinner(oPlayer);
						}
						row3 = true;
						break;
					}
				}

			}
			if (row == true || row2 == true || row3 == true) {
				return true;
			}

		}
		return false;

	}

	private boolean isDiagonal() {
		int x = 0;
		int y = 0;
		if (tictactoeboard[x][y] != ' ') {
			if ((tictactoeboard[x][y] == tictactoeboard[x + 1][y + 1]
					&& tictactoeboard[x + 1][y + 1] == tictactoeboard[x + 2][y + 2])) {
				if (tictactoeboard[x][y] == xPlayer.getXorO()) {
					setWinner(xPlayer);
				} else if (tictactoeboard[x][y] == oPlayer.getXorO()) {
					setWinner(oPlayer);
				}
				return true;
			}
		}
		return false;
	}

	private boolean isCDiagonal() {
		int x = 0;
		int y = 0;
		if (tictactoeboard[x][y + 2] != ' ') {
			if ((tictactoeboard[x][y + 2] == tictactoeboard[x + 1][y + 1]
					&& tictactoeboard[x + 1][y + 1] == tictactoeboard[2][y])) {
				if (tictactoeboard[x][y + 2] == xPlayer.getXorO()) {
					setWinner(xPlayer);
				} else if (tictactoeboard[x][y + 2] == oPlayer.getXorO()) {
					setWinner(oPlayer);
				}
				return true;
			}
		}
		return false;
	}

	public Players getWinner() {
		return winner;
	}

	public void setWinner(Players winner) {
		this.winner = winner;
	}

	public String printGame() {

		StringBuilder stringbuilder = new StringBuilder("");
		for (int i = 0; i < 3; i++) {
			stringbuilder.append("|");
			for (int k = 0; k < 3; k++) {
				stringbuilder.append(tictactoeboard[i][k]).append("_|");
			}

			stringbuilder.append("\n").append("");
		}

		stringbuilder.delete(32, 33);
		return stringbuilder.toString();

	}

	public Players getoPlayer() {
		return oPlayer;
	}

	public Players getxPlayer() {
		return xPlayer;
	}

	public void play() { // I did thus because I want people to call PLAY on tictactoe instance
							// in order to play .
		System.out.println("Welcome to TIC TAC TOE !");
		xPlayer.play(xPlayer, oPlayer);

	}

	public char[][] getBoard() {
		return tictactoeboard;
	}

}
