package TicketingSimulation.Exceptions;

public class TicketNumberOutOfBoundsException extends Exception {

	private static final String MESSAGE = "the ticket number entered is out of bounds .";

	public TicketNumberOutOfBoundsException(String msg) {
		super(msg);
	}

	public TicketNumberOutOfBoundsException() {
		super(MESSAGE);
	}

}
