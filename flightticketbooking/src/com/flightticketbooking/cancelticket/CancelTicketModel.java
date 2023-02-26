package com.flightticketbooking.cancelticket;

import java.util.*;
import com.flightticketbooking.dto.BookingDetails;
import com.flightticketbooking.repository.Repository;

public class CancelTicketModel {

	private CancelTicketControler cancelTicketControler;

	CancelTicketModel(CancelTicketControler cancelTicketControler) {
		this.cancelTicketControler = cancelTicketControler;
	}

	public void showBookedTicket() {// to show booked ticket
		List<BookingDetails> bookingDetails = Repository.getInstance().getBookingInfo();
		cancelTicketControler.bookingDetails(bookingDetails);
	}

	public void cancelTicket(int cancelId) {
		boolean cancelTicket = Repository.getInstance().cancelTicket(cancelId);
		if (cancelTicket) {
			cancelTicketControler.cancelSuccesfully("Tickets Cancelled Succesfully");
		} else {
			cancelTicketControler.cancelFailure("Given Ticket id is invalid");
		}

	}
}
