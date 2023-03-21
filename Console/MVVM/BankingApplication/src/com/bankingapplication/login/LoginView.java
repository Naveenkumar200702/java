package com.bankingapplication.login;

import java.util.Scanner;

import com.bankingapplication.admin.AdminView;
import com.bankingapplication.transaction.TransactionView;

public class LoginView {

	private Scanner input = new Scanner(System.in);
	private LoginModel loginModel;
	
	public LoginView()
	{
		loginModel=new LoginModel(this);
	}

	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		loginView.loginIndex();
	}

//=========================Login Index====================================================
	public void loginIndex() { // login index
		System.out.println("\t-----> Welcome to Indian Bank <------\n");
		System.out.println("Enter 1: Admin Login");
		System.out.println("Enter 2: Existing User");
		System.out.println("Enter 3: New User");
		System.out.println("Enter 4: exit");
		char value = input.next().charAt(0);
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		input.nextLine();
		int option = Character.getNumericValue(value);
		switch (option) {
		case 1:
			System.out.println("Welcome to Admin Login --->");
			new AdminView().adminIndex();
			break;
		case 2:
			System.out.println("Welcome to Indian Bank --->");
			System.out.print("Enter Customer Id--->");
			String customerId = input.nextLine();
			System.out.print("Enter password-->");
			String uPassword = input.nextLine();
			loginModel.userVerifyCon(customerId, uPassword);
			break;
		case 3:
			System.out.print("Enter your name --->");
			String name = input.nextLine();
			System.out.print("Enter your Gender --->");
			String gender = input.nextLine();
			System.out.print("Enter your phoneNo -->");
			String phoneNo = input.nextLine();
			System.out.print("Date-Of-Birth (DD/MM/YYYY) --->");
			String dob = input.nextLine();
			System.out.print("Enter your age-->");
			String age = input.nextLine();
			System.out.print("Enter your aadharNo --->");
			String aadharNo = input.nextLine();
			loginModel.addNewUser(name, gender, phoneNo, dob, age, aadharNo);
			break;
		case 4:
			exitMethod();
			break;
		default:
			System.out.println("Enter a valid option");
			System.out.println("--------------------");
			loginIndex();
			break;
		}
	}

//========================================FirstTime Login========================================
	public void firstTimeLogin() {
		long customerId = loginModel.getCustomerId();
		String password = loginModel.getOneTimePassword(customerId);
		;
		System.out.println("This is your customer-->" + customerId);
		System.out.println("This is one time passWord " + password);
		System.out.print("Enter Customer ID --->");
		long firstcustomerId = input.nextLong();
		input.nextLine();
		System.out.print("Enter password --->");
		String firstpassword = input.nextLine();
		loginModel.validateFirstTimeLogin(customerId, password, firstcustomerId, firstpassword);
	}

//======================Printing Messages============================================

	public void message(String message) {
		System.out.println();
		System.out.println("\t" + message);
		System.out.println("\t------------");
		continueCheck();
	}

//=====================================Getting new Password===========================
	public void newPassword(long customerId) {
		System.out.print("Please Enter new PassWord --->");
		String password = input.nextLine();
		System.out.print("Please re-enter passWord --->");
		String rePassword = input.nextLine();
		loginModel.validatePassword(customerId, password, rePassword);
	}

//======================first timeLogin=======================================

	public void firstTimeLoginError(String string) {
		System.out.println(string);
		System.out.println("--------------");
		firstTimeLogin();
	}

//===============================check to continue or Not==========================
	public void continueCheck() {
		System.out.print("Do you want to continue? (y/n) -->");
		String option = input.nextLine();
		loginModel.continueCheck(option);
	}

//==============================Erroe Messages======================================

	public void errorMessage(String string) {
		System.out.println(string);
		System.out.println("-------------------");
		continueCheck();
	}

//=============================Exiting method========================================

	public void exitMethod() {
		System.out.println("Thank you for visiting...");
	}

//=============================passWord reset message================================

	public void passwordResetMessage(String string) {
		System.out.println(string);
		System.out.println("----------------");
		continueCheck();
	}

//============================Account Registration====================================

	public void AccoutRegistermessage(String string) {
		System.out.println(string);
		System.out.println("---------------");
		firstTimeLogin();
	}

//===============================loginsuccesfull message==================================

	public void loginSuccesfull(long customerId) {
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		new TransactionView().transactionIndex(customerId);
	}
}
