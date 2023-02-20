package com.flighticketbooking.booktickets;

import java.sql.ResultSet;

public class BookTicketControler {

	BookTicketView bookTicketView;
	BookTicketModel bookTicketModel;

	BookTicketControler(BookTicketView bookTicketView) {
		this.bookTicketView = bookTicketView;
		bookTicketModel = new BookTicketModel(this);
	}

	public void choosenOption(int option,String userName) throws Exception {
		bookTicketModel.setUserName(userName);
		if (option == 1) {
			bookTicketModel.getFlightInfo();
		}
	}

	public void flightInfo(ResultSet flightInfo) throws Exception{
		bookTicketView.flightInfo(flightInfo);

	}

	public void chooseFlight(int flightId) throws Exception {
		bookTicketModel.chooseFlight(flightId);

	}

	public void numberOfTickets() {
		bookTicketView.numberOfTickets();
	}

	public void bookTickets(int noOfTickets) {

		int availableSeats = bookTicketModel.getAvailableSeat();
		int currentSeat = bookTicketModel.getCurrentBookedSeat();
		int flightId = bookTicketModel.getFlightId();
		if (availableSeats < noOfTickets) {
			bookTicketView.errorMessage("Tickets Are not Available");
		} else {
			while (noOfTickets > 0) {
				bookTicketView.getPassengerInfo();
				noOfTickets--;
			}
		}
	}
	
	public void bookTicketMessage(String string) {
		bookTicketView.bookTicketMessage(string);
	}
	
	public void addPassengerInfo(String passengerName, int passengerAge) {
		String flightName = bookTicketModel.getFlightName();
		String bookingId = flightName + "naveen";
		bookTicketModel.addPassengerBookingInfo(bookingId, passengerName, passengerAge);
	}

}
