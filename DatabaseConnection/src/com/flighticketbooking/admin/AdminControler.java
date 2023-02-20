package com.flighticketbooking.admin;

import java.sql.ResultSet;

public class AdminControler {
	private AdminView adminView;
	private AdminModel adminModel;
	AdminControler(AdminView adminView)
	{
		this.adminView=adminView;
		this.adminModel=new AdminModel(this);
	}
	public void validateOption(int option,String userName) {
		adminModel.setUserName(userName);
		if(option==1)
		{
			adminView.addFlight();
		}
		else if(option==2)
		{
			adminModel.showFlight();
		}
	}
	public void addNewFlight(String flightName, String depature, String destination) {
		adminModel.addNewFlight(flightName,depature,destination);
		
	}
	public void flightInformation(ResultSet flightInfo) throws Exception{
		adminView.flightInformation(flightInfo);
		
	}
	
}
