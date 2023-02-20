package com.flightticketreservation.bookticket;

import java.util.List;
import java.util.Scanner;

import com.flightticketreservation.dto.FlightInfo;
import com.flightticketreservation.login.LoginView;

public class BookTicketView implements BookTicketViewCallBack {
	private Scanner input = new Scanner(System.in);
	private BookTicketControlerViewCallBack bookTicketControler;
	private LoginView loginView;
	public BookTicketView(LoginView loginView) {
		this.loginView=loginView;
		bookTicketControler = new BookTicketControler(this);
	}

	public void bookTicketIndex(String UserName) {
		bookTicketControler.setUserName(UserName);
		getFlightInfo();
	}

	private void getFlightInfo() { // to get flight info
		bookTicketControler.getFlightInfo();
	}

	@Override
	public void showFlightInfo(List<FlightInfo> flightInfo) {// to show flights info
		System.out.println(
				"FlightId | flightName  | DepaturePlace | Destination | EconomyTicket | BusinessTicket |EconomyPrice|BusinessPrice");
		for (FlightInfo flightDetail : flightInfo) {
			System.out.println(flightDetail.getFlightId() + " \t|" + flightDetail.getFlightName() + " \t|"
					+ flightDetail.getDepature() + " \t|" + flightDetail.getDestination() + " \t| "
					+ flightDetail.getEconomySeat() + " \t\t |" + flightDetail.getBusinessSeat() + "  \t\t|"
					+ flightDetail.getEconomyRate() + " \t|" + flightDetail.getBusinessRate());
		}
		System.out.println(
				"***************************************************************************************************************");
		chooseFlightId();
	}

	private void chooseFlightId() {// to get economy or business class
		System.out.print("Enter FlightId to Proceed Booking--> ");
		int option = input.nextInt();
		input.nextLine();
		System.out.print("Choose Economy / Business class? (E/B)-->");
		String option1 = input.nextLine();
		System.out.print("Enter Number Of Ticket-->");
		int noOfticket=input.nextInt();
		input.nextLine();
		bookTicketControler.bookTicket(option,option1,noOfticket);
	}

	@Override
	public void errorMessage(String string) {// to show all error message
		System.out.println("--> "+string+" <--");
		System.out.println("******************");
		checkContinue();
	}

	public void checkContinue() {
		System.out.print("Do you want to continue? (y/n)-->");
		String option=input.nextLine();
		System.out.println("**********************************");
		bookTicketControler.checkContinue(option);
	}

	public void callIndex() {// to call Index
		loginView.showbookingIndex();		
	}

	@Override
	public void getPassengerDetails(int passengerCount, int flightId, String option1, double ticketRate) {// get passenger details
		System.out.println("****************************");
		System.out.println("Passenger Details--> " + passengerCount);
		System.out.print("Enter Name-->");
		String passengerName = input.nextLine();
		System.out.print("Enter age-->");
		int passengerAge = input.nextInt();
		System.out.print("Enter Aadhar No-->");
		long aadharNo = input.nextLong();
		input.nextLine();
		bookTicketControler.addPassengerDetail(flightId,passengerName, passengerAge, aadharNo,ticketRate,option1);
	}

	@Override
	public void getPayment(double ticketRate, int noOfTicket,String levelClass,FlightInfo flightDetails) {
		System.out.println("Proceed to pay "+(ticketRate*noOfTicket)+" (y/n) -->");
		String checkPayment=input.nextLine();
		bookTicketControler.checkPayments(checkPayment,noOfTicket,levelClass,flightDetails);
	}

	@Override
	public void message(String string) {
		System.out.println("--> "+string+" <--");
		System.out.println("****************");
		checkContinue();
	}
	
	public void exitMethod() {
		System.out.println("--> Thank you For visiting <--");
	}

}
