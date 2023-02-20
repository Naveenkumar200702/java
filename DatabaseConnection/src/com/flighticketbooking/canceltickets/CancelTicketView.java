package com.flighticketbooking.canceltickets;

import java.util.Scanner;

public class CancelTicketView {
	private Scanner input=new Scanner(System.in);
	private CancelTicketControler cancelTicketControler;
	CancelTicketView(){
		cancelTicketControler=new CancelTicketControler(this);
	}
	
	public static void main (String[] args)
	{
		CancelTicketView cancelTicketView=new CancelTicketView();
		cancelTicketView.cancelTicket("naveen");
	}
	
	private void cancelTicket(String userName) {
		System.out.println("1 Cancel Ticket");
		System.out.println("2 Cancel All Tickets");
		int option =input.nextInt();
		cancelTicketControler.chooseOption(option,userName);
	}	
}
