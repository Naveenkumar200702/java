package com.flightticketreservation.login;

import java.util.Scanner;

import com.flightticketreservation.admin.AdminView;
import com.flightticketreservation.bookticket.BookTicketView;
import com.flightticketreservation.cancelticket.CancelTicketView;

public class LoginView implements LoginViewCallBack {

	private LoginControlerViewCallBack loginControler;
	private Scanner input = new Scanner(System.in);

	public LoginView() {
		loginControler = new LoginControler(this);
	}

	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		loginView.loginIndex();
	}

	public void loginIndex() {// index for login
		System.out.println("\t---> Welcome to Flying Duchman Airlines <---");
		System.out.println();
		System.out.println("Enter 1--> Admin Login--> ");
		System.out.println("Enter 2--> User Login--> ");
		System.out.println("Enter 3--> New User--> ");
		int option = input.nextInt();
		input.nextLine();
		loginControler.chooseOption(option);
	}

	@Override
	public void userCredentials() {// get user Credential
		System.out.print("Enter UserName--> ");
		String userName = input.nextLine();
		System.out.print("Enter password--> ");
		String password = input.nextLine();
		loginControler.checkUserCredentials(userName, password);
	}

	@Override
	public void addNewUser() {// adding new user name and password
		System.out.println("Enter UserName-->");
		String userName = input.nextLine();
		System.out.println("Enter password-->");
		String password = input.nextLine();
		System.out.println("Re-Enter Password-->");
		String rePassword = input.nextLine();
		loginControler.addNewUser(userName, password, rePassword);
	}

	@Override
	public void loginSuccess(String string) {// print login success
		System.out.println("****************");
		System.out.println(string);
		System.out.println("****************");
		showbookingIndex();
	}

	public void showbookingIndex() {// index for booking and cancel
		System.out.println("Enter 1: Book Tickets-->");
		System.out.println("Enter 2: Cancel Tickets-->");
		System.out.println("Enter 3: Log Out-->");
		int option = input.nextInt();
		loginControler.chooseBooking(option);
	}

	@Override
	public void loginFailure(String string) { // to show login failure
		System.out.println(string);
		System.out.println("********************");
		checkContinue();
	}

	public void checkContinue() {// check check continue
		System.out.println("Do you want to Continue? (y/n)--> ");
		String check = input.nextLine();
		loginControler.checkContinue(check);
	}

	@Override
	public void callIndex() {
		loginIndex();
	}

	@Override
	public void exitMethod() {
		System.out.println("Thank you for visiting...");
	}

	@Override
	public void successMessage(String string) {
		System.out.println("****************");
		System.out.println(string);
		System.out.println("****************");
		checkContinue();
	}

	@Override
	public void failureMessage(String string) {
		System.out.println("****************");
		System.out.println(string);
		System.out.println("****************");
		checkContinue();
	}

	@Override
	public void callBooking(String userName) {// to call booking method
		BookTicketView bookTicketView = new BookTicketView(this);
		bookTicketView.bookTicketIndex(userName);
	}

	@Override
	public void callCancelModule(String userName) {
		CancelTicketView cancelTicketView = new CancelTicketView(this);
		cancelTicketView.CancelIndex(userName);
	}

	@Override
	public void callAdmin() {
		AdminView adminView = new AdminView(this);
		adminView.adminIndex();
	}

	@Override
	public void adminCredentials() {
		System.out.print("Enter UserName--> ");
		String userName = input.nextLine();
		System.out.print("Enter password--> ");
		System.out.println();
		String password = input.nextLine();
		loginControler.checkAdminCredentials(userName, password);

	}

}
