package com.flightticketbooking.login;

import java.util.Scanner;

import com.flightticketbooking.admin.AdminView;
import com.flightticketbooking.bookintticket.BookingTicketView;

public class LoginView {
	LoginControler loginControler;
	private Scanner input = new Scanner(System.in);

	public LoginView() {
		loginControler = new LoginControler(this);
	}

	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		loginView.loginIndex();
	}

	public void loginIndex() {
		System.out.println("Welcome To  AirLines");
		System.out.println("Enter 1: Admin Login");
		System.out.println("Enter 2: User Login");
		System.out.println("Enter 3: New User");
		System.out.print("Choose an option -->");
		int option = input.nextInt();
		input.nextLine();
		loginControler.choosenOption(option);
	}

	public void adminLogin() {
		System.out.print("Enter UserName -->");
		String userName = input.nextLine();
		System.out.print("Enter PassWord -->");
		String password = input.nextLine();
		loginControler.adminLogin(userName, password);
	}

	public void userLogin() {
		System.out.print("Enter UserName -->");
		String userName = input.nextLine();
		System.out.print("Enter password -->");
		String password = input.nextLine();
		loginControler.userLogin(userName, password);
	}

	public void userLoginSuccesfully(String userName) {
		System.out.println("Welcome --> " + userName);
		BookingTicketView bookTicketView = new BookingTicketView(this);
		bookTicketView.bookTicketIndex();
	}

	public void loginFailed(String errorMessage) {
		System.out.println(errorMessage);
		System.out.println("************************");
		loginIndex();
	}

	public void addUser() {
		System.out.print("Enter the Mail id -->");
		String userMail = input.nextLine();
		System.out.println("Enter the password -->");
		String password = input.nextLine();
		System.out.print("Re-confirm password -->");
		String rePassword = input.nextLine();
		loginControler.addNewUser(userMail, password, rePassword);
	}

	public void adminLoginSuccesfully(String userName) {
		System.out.println("Welcome --> " + userName);
		AdminView adminView = new AdminView(this);
		adminView.adminIndex();
	}
}