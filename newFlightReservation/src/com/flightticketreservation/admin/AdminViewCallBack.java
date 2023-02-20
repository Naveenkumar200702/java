package com.flightticketreservation.admin;

import java.util.List;

import com.flightticketreservation.dto.FlightInfo;

public interface AdminViewCallBack {

	void showFlightInfo(List<FlightInfo> flightInfo);

	void adminIndex();

	void exitMethod();

	void getflightDetails();

	void flightAdded(String string);

	void flightNotAdded(String string);

	void logOut();

}
