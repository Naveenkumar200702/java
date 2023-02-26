package com.flightticketbooking.bookintticket;

import com.flightticketbooking.dto.FlightDetails;
import java.util.*;

public class BookingTicketControler {
	BookingTicketView bookTicketView;
	BookingTicketModel bookTicketModel;

	BookingTicketControler(BookingTicketView bookTicketView) {
		this.bookTicketView = bookTicketView;
		bookTicketModel = new BookingTicketModel(this);
	}

	public void choosenOption(int option) {
		if (option == 1) {
			bookTicketModel.getFlightInfo();
		} else if (option == 2) {
			bookTicketView.callCancelMethod();
		} else if (option == 3) {
			bookTicketView.logOut();
		} else if (option == 4) {
			bookTicketView.exitMethod();
		}
	}

	public void showFlightInfo(List<FlightDetails> flightInfo) {
		bookTicketView.showFlightInfo(flightInfo);
	}

	public void chooseFlight(int flightId) {
		bookTicketModel.chooseFlight(flightId);// choose flight to book ticket
	}

	public void getTicket() {
		bookTicketView.getTicket();
	}

	public void bookTicket(int noOfTicket) {// to reduce available ticket
		FlightDetails currentFlight = bookTicketModel.getCurrentFlight();
		int availableTickets = currentFlight.getAvailableSeat();
		if (availableTickets > noOfTicket) {
			currentFlight.setAvailableSeat(availableTickets - noOfTicket);
			getPassengerDetails(noOfTicket);
		} else {
			bookTicketView.bookingFailure("Can't able to Book ticket");
		}
	}

	private void getPassengerDetails(int noOfTicket) {
		FlightDetails currentFlight=bookTicketModel.getCurrentFlight();
		for (int i = 1; i <= noOfTicket; i++) {
			bookTicketView.getPassengerDetail(i);
		}
		bookTicketView.payment(currentFlight.getPrice(),noOfTicket);
	}

	public void addPassengerDetail(String passengerName, int passengerAge, long aadharNo) {
		bookTicketModel.addPassengerDetail(passengerName, passengerAge, aadharNo);
	}

	public void checkContinue(String check) {
		if (check.equals("y") || check.equals("Y") || check.equals("yes") || check.equals("YES")) {
			bookTicketView.bookTicketIndex();
		} else {
			bookTicketView.exitMethod();
		}
	}
	public void checkPayment(String check) {
		if (check.equals("y") || check.equals("Y") || check.equals("yes") || check.equals("YES")) {
			bookTicketView.bookedSuccesfully("Succesfully Booked");
		} else {
			bookTicketView.paymentFailer();
		}
	}
	
}
