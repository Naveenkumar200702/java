package com.flightticketreservation.admin;

import java.util.List;

import com.flightticketreservation.dto.FlightInfo;

public interface AdminControlerModelCallBack {

	void showFlightInfo(List<FlightInfo> flightInfo);

}
