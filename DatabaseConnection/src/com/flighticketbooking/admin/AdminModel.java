package com.flighticketbooking.admin;

import java.sql.ResultSet;

import com.flighticketbooking.repository.DatabaseAccess;

public class AdminModel {
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private AdminControler adminControler;
	AdminModel(AdminControler adminControler){
		this.adminControler=adminControler;
	}
	public void addNewFlight(String flightName, String depature, String destination) {
		try {
		DatabaseAccess.getInstance().addNewFlight(flightName,depature,destination);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void showFlight() {
		try {
			ResultSet flightInfo=DatabaseAccess.getInstance().getFlightInfo();
			adminControler.flightInformation(flightInfo);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
