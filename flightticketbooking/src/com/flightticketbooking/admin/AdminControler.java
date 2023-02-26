package com.flightticketbooking.admin;

import java.util.List;

import com.flightticketbooking.dto.FlightDetails;

public class AdminControler {
	private AdminView adminView;
	private AdminModel adminModel;

	AdminControler(AdminView adminView) {
		this.adminView = adminView;
		adminModel = new AdminModel(this);
	}

	public void chooseOption(int option) {
		if (option == 1) {
			adminView.getFlightDetails();
		} else if (option == 2) {
			adminModel.showFlights();
		} else if (option == 3) {
			adminView.logOut();
		}
	}

	public void addFlightDetails(String flightName, int totalSeat, String pickUpPoint, String destination,double price) {
		adminModel.addFlightDetails(flightName, totalSeat, totalSeat, pickUpPoint, destination,price);
	}

	public void showFlight(List<FlightDetails> flightInfo) {
		adminView.showFlight(flightInfo);
	}

	public void addedSuccesfully(String message) {
		adminView.addedSuccesfully(message);
	}

	public void checkContinue(String check) {
		if (check.equals("y") || check.equals("Y") || check.equals("yes") || check.equals("YES")) {
			adminView.adminIndex();
		} else {
			adminView.exitMethod();
		}
	}
	
}
