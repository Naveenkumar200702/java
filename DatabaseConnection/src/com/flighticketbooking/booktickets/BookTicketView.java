package com.flighticketbooking.booktickets;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BookTicketView {
	private Scanner input = new Scanner(System.in);
	BookTicketControler bookTicketControler;

	public BookTicketView() {
		bookTicketControler = new BookTicketControler(this);
	}

	public void bookTicketIndex(String userName) throws Exception {
		System.out.println("1. Book Tickets");
		int option = input.nextInt();
		bookTicketControler.choosenOption(option,userName);
	}

	public void flightInfo(ResultSet flightInfo) throws Exception {
		System.out.println("Flightid  | FlightName |  totalseat  | availableseat  |  journey start  | destination");
		while (flightInfo.next()) {
			System.out.println("  " + flightInfo.getString(1) + "\t|  " + flightInfo.getString(2) + "   |\t"
					+ flightInfo.getString(3) + "\t|\t" + flightInfo.getString(4) + "\t|" + flightInfo.getString(5)
					+ "\t|\t" + flightInfo.getString(6));
		}
		chooseFlightId();
	}

	private void chooseFlightId() throws Exception {
		System.out.println("Enter Flight Id to proceeed booking");
		int flightId = input.nextInt();
		bookTicketControler.chooseFlight(flightId);
	}

	public void numberOfTickets() {
		System.out.println("Enter number of tickets to Book");
		int noOfTickets = input.nextInt();
		input.nextLine();
		bookTicketControler.bookTickets(noOfTickets);
	}

	public void errorMessage(String string) {
		System.out.println(string);
	}

	public void bookTicketMessage(String string) {
		System.out.println(string);
	}

	public void getPassengerInfo() {
		System.out.println("Enter Passenger Name ");
		String passengerName = input.nextLine();
		System.out.println("Enter age ");
		int passengerAge = input.nextInt();
		bookTicketControler.addPassengerInfo(passengerName, passengerAge);
	}
}
