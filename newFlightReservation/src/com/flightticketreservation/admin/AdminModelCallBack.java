package com.flightticketreservation.admin;

public interface AdminModelCallBack {

	void getFlightInfo();

	boolean addFlightDetails(String flightName, String pickUpPoint, String destination, double businessPrice,
			double economyPrice);

}
