package com.flighticketbooking.admin;

import java.sql.ResultSet;
import java.util.Scanner;

public class AdminView {
	private Scanner input=new Scanner(System.in);
	AdminControler adminControler;
	public AdminView()
	{
		adminControler=new AdminControler(this);
	}
	public static void main(String[] args) {
		
		
	}
	public void adminIndex(String userName) {
		System.out.println("1 Add flight details");
		System.out.println("2 View flight details");
		int option=input.nextInt();
		adminControler.validateOption(option,userName);
		
	}
	public void addFlight() {
		input.nextLine();
		System.out.println("Enter flight Name");
		String flightName=input .nextLine();
		System.out.println("Enter depature point");
		String depature=input.nextLine();
		System.out.println("Enter destination point");
		String destination=input.nextLine();
		adminControler.addNewFlight(flightName,depature,destination);
	}
	public void flightInformation(ResultSet flightInfo)throws Exception {
		System.out.println("Flightid  | FlightName |  Totalseat  | Availableseat  |  Journey start  | destination | BookedSeats");
		while (flightInfo.next()) {
			System.out.println("  " + flightInfo.getString(1) + "\t|  " + flightInfo.getString(2) + "   |\t"
					+ flightInfo.getString(3) + "\t|\t" + flightInfo.getString(4) + "\t|" + flightInfo.getString(5)
					+ "\t|  " + flightInfo.getString(6)+"  |\t"+flightInfo.getString(7));
		}
		
	}
	
}
