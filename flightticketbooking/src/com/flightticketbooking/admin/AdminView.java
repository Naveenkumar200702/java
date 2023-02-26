package com.flightticketbooking.admin;

import java.util.List;
import java.util.Scanner;

import com.flightticketbooking.dto.FlightDetails;
import com.flightticketbooking.login.LoginView;

public class AdminView {
	private Scanner input = new Scanner(System.in);
	private AdminControler adminControler;
	private LoginView loginView;

	public AdminView(LoginView loginView) {
		adminControler = new AdminControler(this);
		this.loginView = loginView;
	}

	public void adminIndex() {
		System.out.println("Enter 1: Add Flight Details");
		System.out.println("Enter 2: View Flight Details");
		System.out.println("Enter 3: Log out");

		int option = input.nextInt();
		input.nextLine();
		adminControler.chooseOption(option);
	}

	public void getFlightDetails() {
		System.out.print("Enter Flight Name-->");
		String flightName = input.nextLine();
		System.out.print("Enter Total seat-->");
		int totalSeat = input.nextInt();
		System.out.print("Enter PickupPoint-->");
		String pickUpPoint = input.nextLine();
		System.out.print("Enter Destination Point-->");
		String destination = input.nextLine();
		System.out.print("Enter price --> ");
		double price=input.nextDouble();
		input.nextLine();
		adminControler.addFlightDetails(flightName, totalSeat, pickUpPoint, destination,price);

	}

	public void showFlight(List<FlightDetails> flightInfo) {
		System.out.println("FlightId | flightName | AvailableSeats | DepaturePlace | Destination");
		for (FlightDetails flightDetail : flightInfo) {
			System.out.println(flightDetail.getFlightId() + " \t|" + flightDetail.getFlightName() + " \t|"
					+ flightDetail.getAvailableSeat() + " \t\t|" + flightDetail.getPickUpPoint() + " \t|"
					+ flightDetail.getDestinationPoint());
		}
		System.out.println("***********************************************************************");
		continueCheck();
	}

	public void addedSuccesfully(String message) {
		System.out.println(message);
		continueCheck();
	}

	private void continueCheck() {
		System.out.print("Do you Want to Continue?(y/n) -->");
		String check = input.nextLine();
		adminControler.checkContinue(check);
	}

	public void exitMethod() {
		System.out.println("Thank you for Visiting...");
	}

	public void logOut() {
		loginView.loginIndex();
	}

}
