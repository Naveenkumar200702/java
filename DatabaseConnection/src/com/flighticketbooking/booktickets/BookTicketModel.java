package com.flighticketbooking.booktickets;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.flighticketbooking.repository.DatabaseAccess;

public class BookTicketModel {

	private int flightId;
	private int availableSeat;
	private int currentBookedSeat;
	private String flightName;
	private String userName;// login user name
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getFlightId() {
		return flightId;
	}

	public int getAvailableSeat() {
		return availableSeat;
	}

	public int getCurrentBookedSeat() {
		return currentBookedSeat;
	}

	public BookTicketControler getBookTicketControler() {
		return bookTicketControler;
	}

	public String getFlightName() {
		return flightName;
	}

	private BookTicketControler bookTicketControler;

	BookTicketModel(BookTicketControler bookTicketControler) {
		this.bookTicketControler = bookTicketControler;
	}

	public void getFlightInfo() {	
		ResultSet flightInfo = null;
		try {
			flightInfo = DatabaseAccess.getInstance().getFlightInfo();
			bookTicketControler.flightInfo(flightInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void chooseFlight(int flightId) throws Exception {
		this.flightId = flightId;
		ResultSet flightSeats = null;
		try {
			flightSeats = DatabaseAccess.getInstance().getRemainingSeat(flightId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (flightSeats.next()) {
			this.flightName = flightSeats.getString(1);
			this.availableSeat = Integer.parseInt(flightSeats.getString(2));
			this.currentBookedSeat = Integer.parseInt(flightSeats.getString(3));

		}
		bookTicketControler.numberOfTickets();
	}

	public void updateData(int flightId2, int availableSeats, int currentSeat) {
		try {
			if (DatabaseAccess.getInstance().updateValues(flightId2, availableSeats, currentSeat))
				bookTicketControler.bookTicketMessage("Tickets Booked Succesfully");
			else
				bookTicketControler.bookTicketMessage("Unable to Book tickets");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addPassengerBookingInfo(String bookingId, String passengerName, int passengerAge) {
		try {
			if (DatabaseAccess.getInstance().addPassengerBookingInfo(bookingId, passengerName, passengerAge))
				bookTicketControler.bookTicketMessage("Tickets Booked Succesfully");
			else
				bookTicketControler.bookTicketMessage("Can't able to book ticket");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

}
