package com.flightticketreservation.admin;

public interface AdminControlerViewCallBack {

	void chooseOption(int option);

	void checkContinue(String check);

	void addFlightDetails(String flightName, String pickUpPoint, String destination, double businessPrice,
			double economyPrice);

}
