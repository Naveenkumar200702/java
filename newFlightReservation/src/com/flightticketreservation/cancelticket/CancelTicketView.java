package com.flightticketreservation.cancelticket;

import java.util.List;
import java.util.Scanner;

import com.flightticketreservation.dto.PassengerInfo;
import com.flightticketreservation.login.LoginView;

public class CancelTicketView implements CancelTicketViewCallBack {
	private Scanner input = new Scanner(System.in);
	private CancelTicketControlerViewCallBack cancelTicketControler;
	private LoginView loginView;

	public CancelTicketView(LoginView loginView) {
		cancelTicketControler = new CancelTicketControler(this);
		this.loginView = loginView;
	}

	public void CancelIndex(String userName) {// index login index call this method
		cancelTicketControler.setUserName(userName);
		showBookedTickets(userName);
	}

	private void showBookedTickets(String userName) {// this method get passenger Info
		cancelTicketControler.getBookedTickets(userName);
	}

	@Override
	public void showPassengerInfo(List<PassengerInfo> bookedDetail) {// this method print booked details
		System.out.println("TicketId | FlightId | PassengerName | aadharNo | seat Class");
		for (PassengerInfo detail : bookedDetail) {
			System.out.println(detail.getTicketId() + "  \t|  " + detail.getFlightId() + " \t\t |"
					+ detail.getPassengerName() + " \t|" + detail.getAadharNo() + " \t |" + detail.getSeatPosition());
		}
		chooseTicketId();
	}

	private void chooseTicketId() {
		System.out.println("****************************");
		System.out.print("Enter Ticket Id --> ");

		int ticketId = input.nextInt();
		cancelTicketControler.removeTicket(ticketId);
	}

	@Override
	public void removeSuccesfully(String string) {
		System.out.println("****************************");
		System.out.println(string);
		System.out.println("****************************");
		loginView.showbookingIndex();
	}

	@Override
	public void failed(String string) {
		System.out.println("****************************");
		System.out.println(string);
		System.out.println("****************************");
		loginView.showbookingIndex();
	}
}
