package com.flightticketreservation.bookticket;

import java.util.List;

import com.flightticketreservation.dto.FlightInfo;
import com.flightticketreservation.dto.PassengerInfo;

public class BookTicketControler implements BookTicketControlerViewCallBack, BookTicketControlerModelCallBack {

	private BookTicketViewCallBack bookTicketView;
	private BookTicketModelCallBack bookTicketModel;

	public BookTicketControler(BookTicketViewCallBack bookTicketView) {
		this.bookTicketView = bookTicketView;
		bookTicketModel = new BookTicketModel(this);
	}

	@Override
	public void getFlightInfo() {
		List<FlightInfo> flightInfo = bookTicketModel.getFlightInfo();
		bookTicketView.showFlightInfo(flightInfo);
	}

	@Override
	public void bookTicket(int flightId, String option1, int noOfTicket) {// check ticket is available are not
		FlightInfo flightDetail = bookTicketModel.getCurrentFlight(flightId);
		if (flightDetail == null) {
			bookTicketView.errorMessage("Enter a Valid FlightId");
		} else {
			if (option1.equals("e") || option1.equals("E")) {
				if (noOfTicket <= flightDetail.getEconomySeat()) {
					flightDetail.setEconomySeat(flightDetail.getEconomySeat() - noOfTicket);
					double ticketRate = flightDetail.getEconomyRate();
					getPassengerDetail(flightId, option1, noOfTicket, flightDetail, ticketRate);
				} else {
					bookTicketView.errorMessage("No of Tickets is not available");
				}
			} else {
				if (noOfTicket <= flightDetail.getBusinessSeat()) {
					flightDetail.setBusinessSeat(flightDetail.getBusinessSeat() - noOfTicket);
					double ticketRate = flightDetail.getBusinessRate();
					getPassengerDetail(flightId, option1, noOfTicket, flightDetail, ticketRate);
				} else {
					bookTicketView.errorMessage("Number of Tickets is not available");
				}
			}
		}
	}

	private void getPassengerDetail(int flightId, String levelClass, int noOfTicket, FlightInfo flightDetail,
			double ticketRate) { // loop to get passenger id
		for (int i = 1; i <= noOfTicket; i++) {
			bookTicketView.getPassengerDetails(i, flightId, levelClass, ticketRate);
		}
		bookTicketView.getPayment(ticketRate, noOfTicket, levelClass, flightDetail);
	}

	public void checkContinue(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			bookTicketView.callIndex();
		} else {
			bookTicketView.exitMethod();
		}
	}

	@Override
	public void addPassengerDetail(int flightId, String passengerName, int passengerAge, long aadharNo,
			double ticketRate,String seatPosition) {
		bookTicketModel.addPassengerDetail(flightId, passengerName, passengerAge, aadharNo,seatPosition);
	}

	@Override
	public void checkPayments(String option, int noOfTicket, String levelClass, FlightInfo flightDetails) { // check payment// status
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			bookTicketView.message("Paid Succesfully...");
		} else {
			paymentFailed(noOfTicket, levelClass, flightDetails);		
		}
	}

	private void paymentFailed(int noOfTicket, String levelClass, FlightInfo flightDetails) {// remove the saved details
		if (levelClass.equals("e") || levelClass.equals("E")) {
			flightDetails.setEconomySeat(flightDetails.getEconomySeat() + noOfTicket);
		} else {
			flightDetails.setBusinessSeat(flightDetails.getBusinessSeat() + noOfTicket);
		}
		//List<PassengerInfo> passengerInfo=bookTicketModel.getPassengerInfo();
		bookTicketModel.removeDetails(noOfTicket);
		bookTicketView.errorMessage("--> Payment Failed <--");
		bookTicketView.checkContinue();
		
	}

	@Override
	public void setUserName(String userName) {
		bookTicketModel.setUserName(userName);	
	}
}
