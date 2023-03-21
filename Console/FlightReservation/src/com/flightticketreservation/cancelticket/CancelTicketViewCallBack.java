package com.flightticketreservation.cancelticket;

import java.util.List;

import com.flightticketreservation.dto.PassengerInfo;

public interface CancelTicketViewCallBack {

	void showPassengerInfo(List<PassengerInfo> bookedDetail);

	void removeSuccesfully(String string);

	void failed(String string);

	

}
