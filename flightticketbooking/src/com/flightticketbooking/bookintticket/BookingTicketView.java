package com.flightticketbooking.bookintticket;

import java.util.List;
import java.util.Scanner;

import com.flightticketbooking.cancelticket.CancelTicketView;
import com.flightticketbooking.dto.FlightDetails;
import com.flightticketbooking.login.LoginView;

public class BookingTicketView {

	private Scanner input = new Scanner(System.in);
	BookingTicketControler bookTicketControler;
	LoginView loginView;

	public BookingTicketView(LoginView loginView) {
		bookTicketControler = new BookingTicketControler(this);
		this.loginView = loginView;
	}

	public void bookTicketIndex() {// index for flight ticket booking
		System.out.println("Enter 1: Book Tickets");
		System.out.println("Enter 2: Cancel Tickets");
		System.out.println("Enter 3: Log Out");
		System.out.println("Enter 4: Exit");
		int option = input.nextInt();

		bookTicketControler.choosenOption(option);
	}

	public void showFlightInfo(List<FlightDetails> flightInfo) { // to print flight details
		System.out.println("FlightId | flightName | AvailableSeats | DepaturePlace | Destination");
		for (FlightDetails flightDetail : flightInfo) {
			System.out.println(flightDetail.getFlightId() + " \t|" + flightDetail.getFlightName() + " \t|"
					+ flightDetail.getAvailableSeat() + " \t\t|" + flightDetail.getPickUpPoint() + " \t|"
					+ flightDetail.getDestinationPoint());
		}
		System.out.println("***********************************************************************");
		chooseFlightId();

	}

	private void chooseFlightId() {// get number of tickets from the user
		System.out.print("Enter Flight id to book Ticket -->");
		int flightId = input.nextInt();
		bookTicketControler.chooseFlight(flightId);
	}

	public void getTicket() { // get number of tickets from user
		System.out.print("Enter Number of Ticket to book -->");
		int noOfTicket = input.nextInt();
		input.nextLine();
		bookTicketControler.bookTicket(noOfTicket);
	}

	public void bookedSuccesfully(String string) {// booking succesfully
		System.out.println("*************");
		System.out.println(string);
		System.out.println("*************");
		checkContinue();
	}

	public void bookingFailure(String errorMessage)// tickets or not available
	{
		System.out.println(errorMessage);
	}

	public void getPassengerDetail(int passengerCount) {// to get passenger details
		System.out.println("****************************");
		System.out.println("Passenger Details--> " + passengerCount);
		System.out.print("Enter Name-->");
		String passengerName = input.nextLine();
		System.out.print("Enter age-->");
		int passengerAge = input.nextInt();
		System.out.print("Enter Aadhar No-->");
		long aadharNo = input.nextLong();
		input.nextLine();
		bookTicketControler.addPassengerDetail(passengerName, passengerAge, aadharNo);
	}

	public void callCancelMethod() {
		CancelTicketView cancelTicketView = new CancelTicketView(this);
		cancelTicketView.cancelIndex();
	}

	public void logOut() {
		loginView.loginIndex();
	}

	public void checkContinue() {
		System.out.print("Do you Want to Continue?(y/n) --> ");
		String check = input.nextLine();
		bookTicketControler.checkContinue(check);
	}

	public void exitMethod() {
		System.out.println("Thank you for visiting...");
	}

	public void payment(double price, int noOfTicket) {
		System.out.print("Proceed to pay--> "+price*noOfTicket+" (y/n)-->");
		String option=input.nextLine();
		bookTicketControler.checkPayment(option);
	}

	public void paymentFailer() {
		System.out.println("--> Payment Failed <--");
		checkContinue();
	}

}
