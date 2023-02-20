package com.flightticketreservation.bookticket;

import com.flightticketreservation.dto.FlightInfo;

public interface BookTicketControlerViewCallBack {

	void getFlightInfo();

	void bookTicket(int option, String option1, int noOfticket);

	void checkContinue(String option);

	void addPassengerDetail(int flightId, String passengerName, int passengerAge, long aadharNo, double ticketRate, String option1);

	void checkPayments(String checkPayment, int noOfTicket, String levelClass, FlightInfo flightDetails);

	void setUserName(String userName);


}
