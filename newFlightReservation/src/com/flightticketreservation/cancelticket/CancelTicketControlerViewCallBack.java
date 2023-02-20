package com.flightticketreservation.cancelticket;

public interface CancelTicketControlerViewCallBack {

	void setUserName(String userName);

	void getBookedTickets(String userName);

	void removeTicket(int ticketId);

}
