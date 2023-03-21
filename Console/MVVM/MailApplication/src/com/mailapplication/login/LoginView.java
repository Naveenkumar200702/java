package com.mailapplication.login;

import java.util.Scanner;

import com.mailapplication.Inbox.InboxView;

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

	public void loginIndex() {
		System.out.println("----> Welcome to Mail Service <----");
		System.out.println("Enter 1: LogIn ");
		System.out.println("Enter 2: SignUp");
		System.out.println("Enter 3: Forget Password");
		System.out.print("Enter your option --->");
		String option = input.nextLine();
		if (option.length() > 1) {
			System.out.println("Enter a valid option ");
			loginIndex();
		}
		switch (Integer.parseInt(option)) {
		case 1:
			mailLogin();
			break;
		case 2:
			getDetails();
			break;
		case 3:
			forgetPassword();
		default:
			System.out.println("Enter a valid option ");
			break;
		}
	}

	private void forgetPassword() {
		System.out.print("Enter mailId ---> ");
		String mailId = input.nextLine();
		if (!loginControler.checkMail(mailId)) {
			System.out.print("Enter phoneNo --->");
			String phoneNo = input.nextLine();
			String otp = loginControler.getOtp(mailId, phoneNo);
			System.out.println("This is your Otp ---> " + otp);
			System.out.println("-------------------------");
			System.out.print("Enter OTP --->");
			String otP = input.nextLine();
			if (otP.equals(otp))
				setPassword(mailId);
			else {
				System.out.println("Invalid OTP");
				checkContinue();
			}
			return;
		} else {
			System.out.println("invalid mail id");
			checkContinue();
		}
	}

	private void setPassword(String mailId) {
		System.out.print("Enter password ---> ");
		String password = input.nextLine();
		System.out.print("Re-enter password ---> ");
		String rePassword = input.nextLine();
		if (!password.equals(rePassword)) {
			System.out.println("Password Mis match");
			setPassword(mailId);
			return;
		}
		loginControler.setPassword(mailId, password);

	}

	private void mailLogin() {
		System.out.print("Enter mail Id --->");
		String mailId = input.nextLine();
		System.out.print("Enter Password --->");
		String password = input.nextLine();
		loginControler.validateMail(mailId, password);
	}

	public void getDetails() {
		System.out.print("Enter First Name --> ");
		String firstName = input.nextLine();
		System.out.print("Enter Last Name ---> ");
		String lastName = input.nextLine();
		System.out.print("Enter Date Of Birth (yyyy-mm-dd) --->");
		String dob = input.nextLine();
		System.out.print("Enter gender(male/female) ---> ");
		String gender = input.nextLine();
		System.out.print("Enter phone no---> ");
		String phoneNo = input.nextLine();
		loginControler.validate(firstName, lastName, dob, gender, phoneNo);
	}

	@Override
	public String getUserName() {
		System.out.print("Enter user name (___@gmail.com)---> ");
		String emailId = input.nextLine();
		return emailId;
	}

	@Override
	public void errorMessage(String string) {
		System.out.println(string);
		checkContinue();
	}

	public void checkContinue() {
		System.out.print("Do you want to continue? (y/n) -->");
		String option = input.nextLine();
		loginControler.continueCheck(option);
	}

	@Override
	public void exitMethod() {
		System.out.println("Thank you for Visiting");
	}

	@Override
	public String getPassword() {
		System.out.print("Enter password --->");
		String password = input.nextLine();
		return password;
	}

	@Override
	public void callSendReceive(String mailId) {
		InboxView inboxView = new InboxView();
		inboxView.inboxIndex(mailId);
	}

	@Override
	public void message(String string) {
		System.out.println(string);
		checkContinue();
	}

	@Override
	public void userNotAvailable(String string) {
		System.out.println(string);
		checkContinue();
	}

}
