package com.flighticketbooking.canceltickets;

public class CancelTicketControler {
	private CancelTicketView canceTicketView;
	private CancelTicketModel cancelTicketModel;
	CancelTicketControler(CancelTicketView cancelTicketView)
	{
		this.canceTicketView=cancelTicketView;
		cancelTicketModel =new CancelTicketModel(this);
		
	}
	public void chooseOption(int option,String userName) {
		cancelTicketModel.setUserName(userName);
		if(option==1)
		{
			cancelTicketModel.viewFlights();
		}
		
		
	}
	
}
