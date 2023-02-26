package com.flightticketbooking.repository;

import java.util.*;

import com.flightticketbooking.dto.*;

public class Repository {
	private Repository() {
	}

	private static Repository repository;
	private int ticketid = 1;
	private int flightId = 3;

	public static Repository getInstance() {
		if (repository == null) {
			repository = new Repository();
			repository.initialSetup();
		}
		return repository;
	}

	private List<AdminCredentials> adminCredentials = new ArrayList<AdminCredentials>();// admin username password
	private List<FlightDetails> flightDetails = new ArrayList<FlightDetails>();// flight details
	private List<BookingDetails> bookingDetails = new ArrayList<BookingDetails>();// booking status
	private List<UserCredentials> userCredentials = new ArrayList<UserCredentials>();

	private void initialSetup() {
		adminCredentials.add(new AdminCredentials("admin", "admin"));
		userCredentials.add(new UserCredentials("naveen", "naveen"));
		flightDetails.add(new FlightDetails(1, "AirIndia", 90, 90, "chennai", "udumalpet", 0,4000.0));
		flightDetails.add(new FlightDetails(2, "Indico", 90, 90, "udumalpet", "Chennai", 0,5000.0));
	}

	public List<FlightDetails> getFlightInfo() {
		return flightDetails;
	}

	public FlightDetails getCurrentFlight(int flightId) {
		for (FlightDetails currentFlight : flightDetails) {
			if (currentFlight.getFlightId() == flightId) {
				return currentFlight;
			}
		}
		return null;
	}

	public AdminCredentials adminCheck(String userName, String password) {
		for (AdminCredentials credential : adminCredentials) {
			if (credential.getUserName().equals(userName) && credential.getPassword().equals(password)) {
				return credential;
			}
		}
		return null;
	}

	public void addPassengerDetail(int flightId, String bookingId, String passengerName, int passengerAge,
			long aadharNo) {
		bookingDetails.add(new BookingDetails(bookingId, flightId, ticketid, passengerName, passengerAge, aadharNo));
		ticketid++;
	}

	public List<BookingDetails> getBookingInfo() {
		return bookingDetails;
	}

	public boolean cancelTicket(int cancelId) {
		int i = 0;
		for (BookingDetails cancelTicket : bookingDetails) {
			if (cancelTicket.getTicketId() == cancelId) {
				bookingDetails.remove(i);
				return true;
			}
			i++;
		}
		return false;
	}

	public boolean checkUserCredential(String userName, String password) {
		for (UserCredentials checkCredential : userCredentials) {
			if (checkCredential.getUserName().equals(userName) && checkCredential.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public boolean addFlightDetails(String flightName, int totalSeat, int availableSeat, String pickUpPoint,
			String destination, int currentBooking,double price) {
		flightDetails.add(new FlightDetails(flightId, flightName, totalSeat, availableSeat, pickUpPoint, destination,
				currentBooking,price));
		return true;
	}

	public void addUser(String userMail, String password) {
		userCredentials.add(new UserCredentials(userMail, password));
	}

}
