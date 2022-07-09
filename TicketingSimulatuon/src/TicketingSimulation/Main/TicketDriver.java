package TicketingSimulation.Main;

import TicketingSimulation.Exceptions.TicketHasAlreadyBeenIssuedException;
import TicketingSimulation.Exceptions.TicketNumberOutOfBoundsException;
import TicketingSimulation.Models.Seats;
import TicketingSimulation.Models.Ticketing;

public class TicketDriver {

	public static void main(String[] args) {

		// System.out.println(Ticketing.seeAllSeats());
		Seats.fillSeats();
		// Seats seat = new Seats(22, 'a');
		// Seats seat1 = new Seats(22, 'a');
		// Ticketing.ticketSeat(1, 'a');

		try {
			Ticketing.ticketSeat(4, 'a');
		} catch (TicketHasAlreadyBeenIssuedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // fine
		catch (TicketNumberOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Ticketing.ticketSeat(4, 'a');
		} catch (TicketHasAlreadyBeenIssuedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // fine
			// System.out.println(Seats.seatsInSaloon.contains(seat));
		catch (TicketNumberOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Ticketing.ticketSeat(11, 'b');
		} catch (TicketHasAlreadyBeenIssuedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TicketNumberOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Ticketing.ticketSeat(2, 'a');
		} catch (TicketHasAlreadyBeenIssuedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TicketNumberOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Ticketing.ticketSeat(50, 'e');
		} catch (TicketHasAlreadyBeenIssuedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TicketNumberOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Ticketing.ticketSeat(50, 'e');
		} catch (TicketHasAlreadyBeenIssuedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TicketNumberOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Ticketing.ticketSeat(47, 'e');
		} catch (TicketHasAlreadyBeenIssuedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TicketNumberOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Ticketing.ticketSeat(100, 'e');
		} catch (TicketHasAlreadyBeenIssuedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TicketNumberOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Ticketing.seeAllSeatsAvailable());

		/*
		 * 
		 */

	}

}
