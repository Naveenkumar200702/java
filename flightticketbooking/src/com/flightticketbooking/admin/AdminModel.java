package com.flightticketbooking.admin;

import com.flightticketbooking.dto.FlightDetails;
import com.flightticketbooking.repository.Repository;
import java.util.*;

public class AdminModel {
	private AdminControler adminControler;

	AdminModel(AdminControler adminControler) {
		this.adminControler = adminControler;
	}

	public void addFlightDetails(String flightName, int totalSeat, int availableSeat, String pickUpPoint,
			String destination,double price) {
		boolean flag = Repository.getInstance().addFlightDetails(flightName, totalSeat, availableSeat, pickUpPoint,
				destination, 0,price);
		if (flag) {
			adminControler.addedSuccesfully("Flight Added Succesfully");
		}
	}

	public void showFlights() {
		List<FlightDetails> flightInfo = Repository.getInstance().getFlightInfo();
		adminControler.showFlight(flightInfo);
	}

}
