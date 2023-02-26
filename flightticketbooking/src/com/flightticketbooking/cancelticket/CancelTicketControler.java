package com.flightticketbooking.cancelticket;

import java.util.List;

import com.flightticketbooking.dto.BookingDetails;

public class CancelTicketControler {

	private CancelTicketView cancelTicketView;
	private CancelTicketModel cancelTicketModel;

	CancelTicketControler(CancelTicketView cancelTicketView) {
		this.cancelTicketView = cancelTicketView;
		cancelTicketModel = new CancelTicketModel(this);
	}

	public void showBookedTicket() {// to view booked tickets to cancel
		cancelTicketModel.showBookedTicket();

	}

	public void bookingDetails(List<BookingDetails> bookingDetails) {
		if (bookingDetails.size() == 0) {
			cancelTicketView.noBookings("No booking from your account");
		} else {
			cancelTicketView.bookingTicketInfo(bookingDetails);
		}

	}

	public void cancelTicket(int cancelId) {
		cancelTicketModel.cancelTicket(cancelId);

	}

	public void cancelSuccesfully(String succesMessage) {
		cancelTicketView.cancellSuccesfully(succesMessage);

	}

	public void cancelFailure(String failureMessage) {
		cancelTicketView.cancelFailure(failureMessage);

	}

	public void checkContinue(String check) {
		if (check.equals("y") || check.equals("Y") || check.equals("yes") || check.equals("YES")) {
			cancelTicketView.callBooking();
		} else {
			cancelTicketView.exitMethod();
		}
	}

	public void checkOption(int option) {
		if(option==1)
		{
			cancelTicketView.callMethod();
		}
		else {
			cancelTicketView.cancelFailure("Please select a valid Option");
		}
		
	}
}
