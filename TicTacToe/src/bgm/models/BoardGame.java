package bgm.models;

//import java.util.Scanner;

public class BoardGame {
	
	private char [][] gameTable = new char[3][3];
	
	public BoardGame() {
		//gameTable = new char[3][3];
		initialize(gameTable);
	}
	
	public void initialize(char[][] a) {   //creates a table with empty spaces 3 by 3
		for(int i = 0; i < a.length; i++) {
			for( int k = 0; k < a[0].length; k++) {
				a[i][k] = ' ';
			}
		}
	}
	

	public char[][] getGameTable() {
		// TODO Auto-generated method stub
		return gameTable;
	}
	

}
