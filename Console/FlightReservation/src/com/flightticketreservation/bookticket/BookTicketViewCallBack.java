package com.flightticketreservation.bookticket;

import java.util.List;

import com.flightticketreservation.dto.FlightInfo;

public interface BookTicketViewCallBack {

	void showFlightInfo(List<FlightInfo> flightInfo);

	void errorMessage(String string);

	void getPassengerDetails(int i, int flightId,String option1, double ticketRate);

	void getPayment(double ticketRate, int noOfTicket, String levelClass, FlightInfo flightDetail);

	void message(String string);

	void checkContinue();

	void callIndex();

	void exitMethod();

}
