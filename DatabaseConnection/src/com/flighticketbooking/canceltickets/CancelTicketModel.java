package com.flighticketbooking.canceltickets;

import com.flighticketbooking.repository.DatabaseAccess;

public class CancelTicketModel {
	
	private CancelTicketControler cancelTicketControler;
	CancelTicketModel(CancelTicketControler cancelTicketControler)
	{
		this.cancelTicketControler=cancelTicketControler;
	}
	private String userName;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void viewFlights() {
		
		try {
			DatabaseAccess.getInstance().getFlightInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
}
