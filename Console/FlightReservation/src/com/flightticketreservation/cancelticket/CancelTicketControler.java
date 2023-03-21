package com.flightticketreservation.cancelticket;

import java.util.ArrayList;
import java.util.List;

import com.flightticketreservation.dto.PassengerInfo;

public class CancelTicketControler implements CancelTicketControlerViewCallBack, CancelTicketControlerModelCallBack {

	private CancelTicketViewCallBack cancelTicketView;
	private CancelTicketModelCallBack cancelTicketModel;

	public CancelTicketControler(CancelTicketView cancelTicketView) {
		this.cancelTicketView = cancelTicketView;
		cancelTicketModel = new CancelTicketModel(this);
	}

	@Override
	public void setUserName(String userName) {// to set the userName
		cancelTicketModel.setUserName(userName);
	}

	@Override
	public void getBookedTickets(String userName) {// to get booking details...
		List<PassengerInfo> passengerInfo = cancelTicketModel.getPassengerInfo();
		List<PassengerInfo> bookedDetail = new ArrayList<>();
		for (PassengerInfo passengerDetail : passengerInfo) {
			if (passengerDetail.getUserName().equals(userName)) {
				bookedDetail.add(passengerDetail);
			}
		}
		if (bookedDetail != null) {
			cancelTicketView.showPassengerInfo(bookedDetail);
		} else
			cancelTicketView.failed("No Booked Details...");
	}

	@Override
	public void removeTicket(int ticketId) {// to cancel a ticket
		if (cancelTicketModel.removeTicket(ticketId)) {
			cancelTicketView.removeSuccesfully("--> Ticket Remove Succesfully <--");
		} else {
			cancelTicketView.failed("--> Unable to Remove the ticket <--");
		}
	}

}
