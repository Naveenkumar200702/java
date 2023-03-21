package com.flightticketreservation.cancelticket;

import java.util.List;

import com.flightticketreservation.dto.PassengerInfo;

public interface CancelTicketModelCallBack {

	void setUserName(String userName);

	List<PassengerInfo> getPassengerInfo();

	boolean removeTicket(int ticketId);

}
