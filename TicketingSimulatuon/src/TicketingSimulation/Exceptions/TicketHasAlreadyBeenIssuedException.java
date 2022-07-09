package TicketingSimulation.Exceptions;

public class TicketHasAlreadyBeenIssuedException extends Exception {

	public TicketHasAlreadyBeenIssuedException() {
		super("This ticket has already been issued .");
	}

}
