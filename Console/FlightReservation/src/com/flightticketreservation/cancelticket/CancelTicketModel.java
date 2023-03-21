package com.flightticketreservation.cancelticket;

import java.util.List;

import com.flightticketreservation.dto.PassengerInfo;
import com.flightticketreservation.repository.Repository;

public class CancelTicketModel implements CancelTicketModelCallBack {
	private CancelTicketControlerModelCallBack cancelTicketControler;

	public CancelTicketModel(CancelTicketControler cancelTicketControler) {
		this.cancelTicketControler = cancelTicketControler;
	}

	private String userName;

	public String getUserName() {
		return userName;
	}

	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<PassengerInfo> getPassengerInfo() {
		return Repository.getInstance().getPassengerInfo();
	}

	@Override
	public boolean removeTicket(int ticketId) {// to delete a particular user
		return Repository.getInstance().removeTicket(ticketId);

	}

}
