package TicketingSimulation.Models;

import java.util.LinkedList;

public class Seats {

	public static LinkedList<Seats> seatsInSaloon = new LinkedList<>();
	private final int seatNumber;
	private final char seatChar;

	public Seats(int seatNumber, char seatChar) {

		this.seatChar = seatChar;
		this.seatNumber = seatNumber;
		// seatsInSaloon.add(this);

	}

	private static void generateSeats() {

		char x = 'a';
		for (int i = 1; i < 51; i++) {
			if (i % 10 == 0) {
				Seats seats = new Seats(i, x);
				seatsInSaloon.add(seats);

				x++;

			} else {
				Seats seats = new Seats(i, x);
				seatsInSaloon.add(seats);

			}

		}

	}

	@Override
	public boolean equals(Object obj) {
		Seats objec = (Seats) obj;
		if (this.seatChar == objec.getSeatChar() && this.seatNumber == objec.getSeatNumber()) {
			return true;
		}
		return false;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public char getSeatChar() {
		return seatChar;
	}

	public static void fillSeats() {
		generateSeats();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(" %d-%c\n", this.seatNumber, this.seatChar);

	}

}
