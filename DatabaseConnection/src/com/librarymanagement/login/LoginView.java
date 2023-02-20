package com.librarymanagement.login;

import java.util.Scanner;

import com.librarymanagement.setuplibrary.SetupLibraryView;

public class LoginView implements LoginViewCallBack{

	private LoginControlerCallBack loginControler;
	private Scanner input = new Scanner(System.in);
	private SetupLibraryView setupLibraryView;

	public LoginView() {
		loginControler = new LoginControler(this);
		setupLibraryView = new SetupLibraryView();

	}

	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		loginView.checkForLogin();
	}

	public  void checkForLogin() {
		System.out.println("\t ******************");
		System.out.println("\tWelcomem to Library Management");
		System.out.println("\t ******************");
		System.out.println("Enter the UserName");
		String userName = input.nextLine();
		System.out.println("Enter Password");
		String password = input.nextLine();
		loginControler.checkValidAccount(userName, password);	
	}

	public void loginSuccess(String userName) {
		System.out.println("--> Welcome " + userName + " <--");
		System.out.println("Login successfully");
		setupLibraryView.checkLibrary();
	}

	public void loginFailure(String errorMessage) {
		System.out.println(errorMessage);
		checkForLogin();
	}


}
