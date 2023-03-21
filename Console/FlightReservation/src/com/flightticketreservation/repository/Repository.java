package com.flightticketreservation.repository;

import java.util.ArrayList;
import java.util.List;

import com.flightticketreservation.dto.AdminCredentials;
import com.flightticketreservation.dto.FlightInfo;
import com.flightticketreservation.dto.PassengerInfo;
import com.flightticketreservation.dto.UserCredentials;

public class Repository {
	private Repository() {
	}

	private static Repository repository = null;
	private List<UserCredentials> userCredentials = new ArrayList<>();// username and password
	private List<FlightInfo> flightInfo = new ArrayList<>();// flight detailsWSS
	private List<PassengerInfo> passengerInfo = new ArrayList<>();
	private List<AdminCredentials> adminCredentials = new ArrayList<>();

	private static int ticketId = 1;
	private static int bookingId = 3;

	public static Repository getInstance() {// singleton class
		if (repository == null) {
			repository = new Repository();
			repository.initialSetup();
		}
		return repository;
	}

	void initialSetup() {// initial values for pojo class
		userCredentials.add(new UserCredentials("naveen", "naveen"));
		flightInfo.add(new FlightInfo(1, "Indico", "Chennai", "Coimbatore", 2000.0, 3000.0));
		flightInfo.add(new FlightInfo(2, "AirIndia", "Coimbatore", "Chennai", 2000.0, 3000.0));
		adminCredentials.add(new AdminCredentials("admin", "admin"));
	}

	public List<UserCredentials> getUserCredentials() { // to get user credential
		return userCredentials;
	}

	public void addNewUser(String userName, String password) {// adding new user
		userCredentials.add(new UserCredentials(userName, password));
	}

	public List<FlightInfo> getFlightInfo() {// to get all flight details
		return flightInfo;
	}

	public FlightInfo getCurrentFlight(int option) {// to get current flight id
		for (FlightInfo flight : flightInfo) {
			if (flight.getFlightId() == option) {
				return flight;
			}
		}
		return null;
	}

	public void addPassengerInfo(int flightId, String passengerName, int passengerAge, long aadharNo, String userName,
			String seatPosition) {
		passengerInfo.add(
				new PassengerInfo(flightId, passengerName, passengerAge, aadharNo, userName, ticketId, seatPosition));
		ticketId++;
	}

	public void removePassengerInfo(int noOfTicket) {// remove passsenger info while payment cancelled
		for (int i = 0; i < noOfTicket; i++) {
			passengerInfo.remove(passengerInfo.size() - 1);
		}
	}

	public List<PassengerInfo> getPassengerInfo() {// to get all passenger info
		return passengerInfo;
	}

	public boolean removeTicket(int ticketId) {// to remove a ticket
		int i = 0;
		for (PassengerInfo detail : passengerInfo) {
			if (detail.getTicketId() == ticketId) {
				addSeatCount(detail);
				passengerInfo.remove(i);
				return true;
			}
			i++;
		}
		return false;
	}

	private void addSeatCount(PassengerInfo detail) {
		int flightId = detail.getFlightId();
		String seat = detail.getSeatPosition();
		for (FlightInfo info : flightInfo) {
			if (flightId == info.getFlightId()) {
				if (seat.equals("e") || seat.equals("E")) {
					info.setEconomySeat(info.getEconomySeat() + 1);
				} else {
					info.setBusinessSeat(info.getBusinessSeat() + 1);
				}
			}
		}

	}

	public boolean addNewFlightDetails(String flightName, String pickUpPoint, String destination, double businessPrice,
			double economyPrice) {
		flightInfo.add(new FlightInfo(bookingId, flightName, pickUpPoint, destination, economyPrice, businessPrice));
		return true;
	}

	public List<AdminCredentials> getAdminCredentials() {
		return adminCredentials;
	}
}
