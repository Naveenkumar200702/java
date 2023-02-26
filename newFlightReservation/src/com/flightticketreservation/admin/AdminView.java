package com.flightticketreservation.admin;

import java.util.List;
import java.util.Scanner;

import com.flightticketreservation.dto.FlightInfo;
import com.flightticketreservation.login.LoginView;

public class AdminView implements AdminViewCallBack {

	private Scanner input = new Scanner(System.in);

	private AdminControlerViewCallBack adminControler;
	private LoginView loginView;

	public AdminView(LoginView loginView) {
		this.loginView = loginView;
		adminControler = new AdminControler(this);
	}

	public void adminIndex() {// to choose Option
		System.out.println("Enter 1: Add Flight Details");
		System.out.println("Enter 2: View Flight Details");
		System.out.println("Enter 3: Log out");
		int option = input.nextInt();
		input.nextLine();
		adminControler.chooseOption(option);
	}

	@Override
	public void showFlightInfo(List<FlightInfo> flightInfo) {// printing flight info
		System.out.println(
				"FlightId | flightName | AvailableSeats | DepaturePlace | Destination|EconomySeat|BusinessSeat|EconomyRate|BusinessRate");
		for (FlightInfo flightDetail : flightInfo) {
			System.out.println(flightDetail.getFlightId() + " \t|" + flightDetail.getFlightName() + " \t|"
					+ flightDetail.getTotalSeat() + " \t\t|" + flightDetail.getDepature() + " |\t"
					+ flightDetail.getDestination() + "  |\t" + flightDetail.getEconomySeat() + " \t|"
					+ flightDetail.getBusinessSeat() + "\t|\t" + flightDetail.getEconomyRate() + "\t|\t"
					+ flightDetail.getBusinessRate());
		}
		System.out.println(
				"**************************************************************************************************************************");
		checkContinue();
	}

	private void checkContinue() {
		System.out.print("Do you Want to Continue?(y/n) -->");
		String check = input.nextLine();
		adminControler.checkContinue(check);
	}

	@Override
	public void exitMethod() {
		System.out.println("Thank you For Visiting");
	}

	@Override
	public void getflightDetails() {
		System.out.print("Enter Flight Name-->");
		String flightName = input.nextLine();
		System.out.print("Enter PickupPoint-->");
		String pickUpPoint = input.nextLine();
		System.out.print("Enter Destination Point-->");
		String destination = input.nextLine();
		System.out.print("Enter Business Seat price --> ");
		double businessPrice = input.nextDouble();
		System.out.print("Enter EconomySeat price-->");
		double economyPrice = input.nextDouble();
		input.nextLine();
		adminControler.addFlightDetails(flightName, pickUpPoint, destination, businessPrice, economyPrice);
	}

	@Override
	public void flightAdded(String string) {
		System.out.println("**************************");
		System.out.println(string);
		System.out.println("<------------------>");
		checkContinue();

	}

	@Override
	public void flightNotAdded(String string) {
		System.out.println("*****************************");
		System.out.println(string);
		System.out.println("<--------------------->");
		checkContinue();

	}

	@Override
	public void logOut() {
		loginView.loginIndex();

	}

}
