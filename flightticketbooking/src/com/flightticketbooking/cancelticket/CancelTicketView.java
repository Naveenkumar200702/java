package com.flightticketbooking.cancelticket;

import java.util.List;
import java.util.Scanner;

import com.flightticketbooking.bookintticket.BookingTicketView;
import com.flightticketbooking.dto.BookingDetails;

public class CancelTicketView {
	private Scanner input = new Scanner(System.in);
	private CancelTicketControler cancelTicketControler;
	private BookingTicketView bookingTicketView;
	public CancelTicketView(BookingTicketView bookintTicketView) {
		this.bookingTicketView=bookintTicketView;
		cancelTicketControler = new CancelTicketControler(this);
	}

	public void cancelIndex() {
		cancelTicketControler.showBookedTicket();
	}

	public void noBookings(String errorMessage) {
		System.out.println("-->" + errorMessage);
		checkContinue();
	}

	public void bookingTicketInfo(List<BookingDetails> bookingDetails) {

		System.out.println("Booking detals-->");
		System.out.println(">---------------------------<");
		System.out.println("TicketId | Name   | Age  | AadharNumber");
		for (BookingDetails bookInfo : bookingDetails) {
			System.out.println(bookInfo.getTicketId() + " \t | " + bookInfo.getName() + " |" + bookInfo.getAge()
					+ " \t|" + bookInfo.getaadhatNo());
		}
		getTicketId();
	}
	
	private void getTicketId() {
		System.out.print("Enter TicketId to cancel--->");
		int cancelId = input.nextInt();
		input.nextLine();
		cancelTicketControler.cancelTicket(cancelId);
	}

	public void cancellSuccesfully(String succesMessage) {
		System.out.println(succesMessage);
		checkContinue();
	}
	public void checkContinue() {
		System.out.print("Do you Want to Continue?(y/n) --> ");
		String check = input.nextLine();
		cancelTicketControler.checkContinue(check);
	}

	public void cancelFailure(String failureMessage) {
		System.out.println(failureMessage);
		checkContinue();
	}

	public void exitMethod() {
		System.out.println("Thank you for Visiting");
	}

	public void callMethod() {
		cancelTicketControler.showBookedTicket();
	}

	public void callBooking() {
		bookingTicketView.bookTicketIndex();	
	}
}
