package bgm.models;

import java.util.Scanner;
import java.util.Stack;

public class Players {

	private char XorO; // STATIC YAPINCA NEDEN SADECE O PRINT EDIYOR
	private static TicTacToeGame game;
	Scanner scanner = new Scanner(System.in);
	public static Stack<Character> c = new Stack<>();
	private String name;

	public char getXorO() {
		return XorO;
	}

	public void setXorO(char xorO) {
		XorO = xorO;
	}

	public Players(char XorO, String name) {
		this.XorO = XorO;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * DRAW HELPER METHOD , pushes the last entered letter on stack in order to help
	 * figure out whose turn it is. If coordinates are already filled requires new
	 * coordinates .
	 */
	private void draw(Players p) {
		char[][] table = game.getBoard();
		int fVal = scanner.nextInt();
		int secVal = scanner.nextInt();

		while (table[fVal][secVal] != ' ') {

			System.out.println("these coordinates are already filled . Please enter different coordinates :");
			fVal = scanner.nextInt();
			secVal = scanner.nextInt();

		}

		table[fVal][secVal] = p.getXorO();
		c.push(p.getXorO());
		System.out.println(game.printGame());

		// game.printGame();
	}

	/*
	 * Draw method , which the play method uses . Controls turns by checking game
	 * stack.
	 */
	public void draw() {
		if (c.isEmpty()) {
			System.out.println(game.getxPlayer().getName() + " please enter coordinates (x) :");
			draw(game.getxPlayer());
		} else if (c.peek() == 'o') {
			System.out
					.println(game.getxPlayer().getName() + " it`s your turn.. enter your coordinates one by one (x) :");
			draw(game.getxPlayer());
		} else if (c.peek() == 'x') {
			System.out.println(game.getoPlayer().getName() + " it`s your turn.. your coordinates one by one (o) : ");
			draw(game.getoPlayer());
		}
	}

	/*
	 * Play method , requires 2 players . If game is not finished , keeps calling
	 * draw method . If it is finished, calls congrats message to announce winner .
	 */
	public void play(Players a, Players b) {
		game = new TicTacToeGame(a, b);

		do {

			draw();

		} while (!game.isPoints());

		System.out.println(game.congratsMessage());
	}

}
