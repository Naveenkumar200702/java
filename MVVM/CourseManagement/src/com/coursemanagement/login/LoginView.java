package com.coursemanagement.login;

import java.util.Scanner;

import com.coursemanagement.Admin.AdminView;
import com.coursemanagement.student.StudentView;
import com.coursemanagement.traine.TraineView;

public class LoginView {

	private LoginModel loginModel;
	private Scanner input = new Scanner(System.in);

	public LoginView() {
		loginModel = new LoginModel(this);
	}

	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		loginView.loginIndex();
	}

	public void loginIndex() {
		System.out.println("\t-----> Welcome to Free Course Management <-----");
		System.out.println("Enter 1: Login ");
		System.out.println("Enter 2: SignUp (Only for students)");
		System.out.println("Enter 3: exit");
		String option = input.nextLine();
		if (option.length() != 1) {
			System.out.println("Enter a valid option");
			loginIndex();
			return;
		}
		int op = Integer.parseInt(option);
		switch (op) {
		case 1:
			System.out.print("Enter user ID ---> ");
			String userId = input.nextLine();
			boolean flag = loginModel.checkFirstTimeLogin(userId); // check for trainee first time login
			if (flag == true) {
				traineFirstTimeLogin(userId);
				return;
			}
			System.out.print("Enter password --->");
			String password = input.nextLine();
			if (userId.length() >= 3) {
				loginModel.checkUser(userId, password);
			} else {
				System.out.println("Please Enter a Valid data");
				continueCheck();
			}
			break;
		case 2:
			System.out.println("--Welcome to Online Course---");
			System.out.print("Enter your Name ---> ");
			String name = input.nextLine();
			System.out.print("Enter Your Email Id -->");
			String email = input.nextLine();
			System.out.print("Enter Date of Birth --> ");
			String dob = input.nextLine();
			System.out.print("Enter college name --->");
			String clgName = input.nextLine();
			System.out.print("Enter the year of Graduation --->");
			String graduationYear = input.nextLine();
			System.out.println("Enter Intrested Fields --->Separated by coma(,)");
			String intrests = input.nextLine();
			if (loginModel.studentValidate(name, email, dob, clgName, graduationYear, intrests)) {
				System.out.println(" ----> Account Created Succesfully <----");
				firstTimeLogin();
			}
			break;
		case 3:
			System.out.println("Thanks for Visiting");
			break;
		default:
			System.out.println("Enter a valid option");
			break;
		}
	}

	private void traineFirstTimeLogin(String userId) {
		String password = loginModel.getFirstTimePassword(userId);
		// System.out.println("PassWord for your Account ---> "+password);
		System.out.println("---> Please set password <---");
		System.out.print("Enter password ---> ");
		String trainePassword = input.nextLine();
		System.out.print("Re-Enter password --> ");
		String rePassword = input.nextLine();
		if (trainePassword.equals(rePassword)) {
			loginModel.setTrainePassword(userId, rePassword);
			loginIndex();
		} else {
			System.out.println("Invalid password");
			traineFirstTimeLogin(userId);
		}
	}

	// ========================first time login for
	// student=============================
	private void firstTimeLogin() {
		String id = loginModel.getId();
		String password = loginModel.getPassword(id);
		System.out.println("This is your Login Id --> " + id);
		System.out.println("This is your password --> " + password);
		System.out.println("Please Login with your login Id and password");
		System.out.print("Login Id --> ");
		String loginId = input.nextLine();
		System.out.print("Enter password --->");
		String otp = input.nextLine();
		loginModel.validitateOTP(loginId, otp);
	}

	// ============================call functions to admin,student andd
	// trainee=====================

	public void callAdmin(String userId) {
		AdminView adminView = new AdminView();
		adminView.adminIndex(userId);
	}

	public void callStudent(String userId) {
		StudentView studentView = new StudentView();
		studentView.studentIndex(userId);
	}

	public void callTrainee(String userId) {
		TraineView traineView = new TraineView();
		traineView.traineIndex(userId);
	}
//==========================================================================================	

	private void continueCheck() {
		System.out.print("Do you want to continue? (y/n) -->");
		String option = input.nextLine();
		loginModel.continueCheck(option);
	}

	public void errorMessage(String string) {
		System.out.println("Invalid Option");
		continueCheck();
	}

	public void exitMethod(String message) {
		System.out.println(message);
	}

	public void resetPassword(String loginId) {
		System.out.println("---> Please Set password <---");
		System.out.print("Enter Password --->");
		String password = input.nextLine();
		System.out.print("Re-Enter password --->");
		String rePassword = input.nextLine();
		loginModel.setPassword(loginId, password, rePassword);

	}

	public void passwordMisMatch(String string, String userId) {
		System.out.println(string);
		resetPassword(userId);
	}

	public void message(String string) {
		System.out.println(string);
		continueCheck();
	}
}
