package com.flightticketreservation.admin;

import java.util.List;

import com.flightticketreservation.dto.FlightInfo;
import com.flightticketreservation.repository.Repository;

public class AdminModel implements AdminModelCallBack{
	
	private AdminControlerModelCallBack adminControler;
	
	public AdminModel(AdminControler adminControler) {
		this.adminControler=adminControler;
	}

	public void getFlightInfo() {
		List<FlightInfo> flightInfo=Repository.getInstance().getFlightInfo();
		adminControler.showFlightInfo(flightInfo);
	}

	@Override
	public boolean addFlightDetails(String flightName, String pickUpPoint, String destination, double businessPrice,
			double economyPrice) {
		return Repository.getInstance().addNewFlightDetails(flightName,pickUpPoint,destination,businessPrice,economyPrice);
	}

	
	
	
}
