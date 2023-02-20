package com.flighticketbooking.login;

import java.util.Scanner;

import com.flighticketbooking.admin.AdminView;
import com.flighticketbooking.booktickets.BookTicketView;

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

	private void loginIndex() {
		System.out.println("Welcome To our AirLines");
		System.out.println("1. Admin Login");
		System.out.println("2 User Login");
		System.out.println("3 New User");
		System.out.print("Choose an option:");
		int option = input.nextInt();
		input.nextLine();
		loginControler.choosenOption(option);
	}

	public void adminLogin() {
		System.out.println("Enter UserName");
		String userName = input.nextLine();
		System.out.println("Enter PassWord");
		String password = input.nextLine();
		loginControler.adminLogin(userName, password);
	}

	public void userLogin() {
		System.out.println("Enter UserName");
		String userName = input.nextLine();
		System.out.println("Enter password");
		String password = input.nextLine();
		loginControler.userLogin(userName, password);
	}

	public void loginSuccesfully(String userName) {
		System.out.println("Welcome --> " + userName);
		BookTicketView bookTicketView = new BookTicketView();
		try {
			bookTicketView.bookTicketIndex(userName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loginFailed(String errorMessage) {
		System.out.println(errorMessage);
		loginIndex();
	}

	public void addUser() {
		System.out.println("enter the Mail id");
		String userMail = input.nextLine();
		System.out.println("enter the password");
		String password = input.nextLine();
		loginControler.newUser(userMail, password);
	}

	public void adminLoginSuccesfully(String userName) {
		System.out.println("Welcome --> " + userName);
		AdminView adminView = new AdminView();
		adminView.adminIndex(userName);
	}
}
