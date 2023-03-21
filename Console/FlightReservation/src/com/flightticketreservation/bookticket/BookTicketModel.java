package com.flightticketreservation.bookticket;

import java.util.List;

import com.flightticketreservation.dto.FlightInfo;
import com.flightticketreservation.dto.PassengerInfo;
import com.flightticketreservation.repository.Repository;

public class BookTicketModel implements BookTicketModelCallBack {

	private BookTicketControlerModelCallBack bookTicketControler;

	public BookTicketModel(BookTicketControler bookTicketControler) {
		this.bookTicketControler = bookTicketControler;
	}

	private String userName;

	@Override
	public List<FlightInfo> getFlightInfo() {// get flight info from repository
		return Repository.getInstance().getFlightInfo();
	}

	@Override
	public FlightInfo getCurrentFlight(int option) {
		return Repository.getInstance().getCurrentFlight(option);
	}

	@Override
	public void addPassengerDetail(int flightId, String passengerName, int passengerAge, long aadharNo,
			String seatPosition) {
		Repository.getInstance().addPassengerInfo(flightId, passengerName, passengerAge, aadharNo, userName,
				seatPosition);
	}

	@Override
	public void removeDetails(int noOfTicket) {
		Repository.getInstance().removePassengerInfo(noOfTicket);

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
