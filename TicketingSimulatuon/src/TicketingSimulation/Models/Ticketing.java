package TicketingSimulation.Models;

import java.util.ListIterator;

import TicketingSimulation.Exceptions.TicketHasAlreadyBeenIssuedException;
import TicketingSimulation.Exceptions.TicketNumberOutOfBoundsException;

/*
 * This is a ticketing system simulation . 
 * Every seat has a number 1-50 and every 10 seat has a char assigned .
 * We must be able to see empty seats available . 
 */
public class Ticketing {

	private static Seats seats;
	public static ListIterator<Seats> x;

	public static String seeAllSeatsAvailable() {
		StringBuilder str = new StringBuilder("AVAILABLE SEATS : \n");
		for (Seats s : Seats.seatsInSaloon) {
			str.append(s.toString());
		}
		return str.toString();
	}

	public static void ticketSeat(int seatNum, char seatChar)
			throws TicketHasAlreadyBeenIssuedException, TicketNumberOutOfBoundsException {

		seats = new Seats(seatNum, seatChar);
		x = Seats.seatsInSaloon.listIterator();
		Seats current = x.next();

		while (!current.equals(seats) && x.hasNext()) {
			current = x.next();
		}
		if (current.equals(seats)) {
			System.out.println("HERE IS YOUR TICKET FOR : " + current);
			Seats.seatsInSaloon.remove(current);
		} else if (!current.equals(seats) && seats.getSeatNumber() <= 50) {
			throw new TicketHasAlreadyBeenIssuedException();
		} else if (seats.getSeatNumber() > 50) {
			throw new TicketNumberOutOfBoundsException();
		}
	}

}
