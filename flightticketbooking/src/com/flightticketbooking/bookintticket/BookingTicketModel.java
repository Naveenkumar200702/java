package com.flightticketbooking.bookintticket;

import com.flightticketbooking.dto.FlightDetails;
import com.flightticketbooking.repository.Repository;
import java.util.*;

public class BookingTicketModel {

	private BookingTicketControler bookTicketControler;
	private FlightDetails currentFlight = null;

	public FlightDetails getCurrentFlight() {
		return currentFlight;
	}

	BookingTicketModel(BookingTicketControler bookTicketControler) {
		this.bookTicketControler = bookTicketControler;
	}

	public void getFlightInfo() {
		List<FlightDetails> flightInfo = Repository.getInstance().getFlightInfo();
		bookTicketControler.showFlightInfo(flightInfo);
	}

	public void chooseFlight(int flightId) {// to choose flight to book ticket
		this.currentFlight = Repository.getInstance().getCurrentFlight(flightId);
		bookTicketControler.getTicket();
	}

	public void addPassengerDetail(String passengerName, int passengerAge, long aadharNo) {
		String userName = "naveen";
		String flightName = currentFlight.getFlightName();
		int flightId = currentFlight.getFlightId();
		Repository.getInstance().addPassengerDetail(flightId, flightName + userName, passengerName, passengerAge,
				aadharNo);
	}

}
