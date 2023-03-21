package com.flightticketreservation.admin;

import java.util.List;

import com.flightticketreservation.dto.FlightInfo;

public class AdminControler implements AdminControlerModelCallBack, AdminControlerViewCallBack {

	private AdminViewCallBack adminView;
	private AdminModelCallBack adminModel;

	public AdminControler(AdminView adminView) {
		this.adminView = adminView;
		adminModel = new AdminModel(this);
	}

	@Override
	public void chooseOption(int option) {// choosing options
		if (option == 1) {
			adminView.getflightDetails();
		} else if (option == 2) {
			adminModel.getFlightInfo();
		} else if (option == 3) {
			adminView.logOut();
		}
	}

	@Override
	public void showFlightInfo(List<FlightInfo> flightInfo) {// showing flightInfo
		adminView.showFlightInfo(flightInfo);
	}

	@Override
	public void checkContinue(String check) {
		if (check.equals("y") || check.equals("Y") || check.equals("Yes") || check.equals("YES")) {
			adminView.adminIndex();
		} else {
			adminView.exitMethod();
		}

	}

	@Override
	public void addFlightDetails(String flightName, String pickUpPoint, String destination, double businessPrice,
			double economyPrice) {
		if (adminModel.addFlightDetails(flightName, pickUpPoint, destination, businessPrice, economyPrice)) {
			adminView.flightAdded("Succesfully flight added");
		} else {
			adminView.flightNotAdded("Unable to add flight data");
		}
	}

}
