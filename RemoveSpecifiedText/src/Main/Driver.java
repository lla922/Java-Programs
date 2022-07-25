package Main;

import java.io.IOException;

import Model.RemoveOccurrences;

public class Driver {

	public static void main(String[] args) {
		try {
			RemoveOccurrences.removeOccurrences(args);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
