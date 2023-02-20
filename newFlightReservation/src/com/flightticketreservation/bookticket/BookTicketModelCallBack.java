package com.flightticketreservation.bookticket;

import java.util.List;

import com.flightticketreservation.dto.FlightInfo;
import com.flightticketreservation.dto.PassengerInfo;

public interface BookTicketModelCallBack {

	List<FlightInfo> getFlightInfo();

	FlightInfo getCurrentFlight(int option);

	void addPassengerDetail(int flightId, String passengerName, int passengerAge, long aadharNo, String seatPosition);

	void removeDetails(int noOfTicket);

	void setUserName(String userName);

}
