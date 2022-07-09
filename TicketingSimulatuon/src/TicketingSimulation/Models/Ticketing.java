package TicketingSimulation.Models;

import java.util.LinkedList;
import java.util.ListIterator;

import TicketingSimulation.Exceptions.TicketHasAlreadyBeenIssuedException;
import TicketingSimulation.Exceptions.TicketNumberOutOfBoundsException;

/*
 * This is a ticketing system simulation . 
 * Every seat has a number . We ticket the seats in correct order .
 * We must be able to ticket multiple seats at a time .
 * We must be able to see empty seats available . Row letter , and seat numbers in each row .
 */
public class Ticketing {

	private static Seats seats;
	public static ListIterator<Seats> x;

	public static LinkedList<Seats> seeAllSeatsAvailable() {

		return Seats.seatsInSaloon;
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
