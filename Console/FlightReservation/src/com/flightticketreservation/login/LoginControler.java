package com.flightticketreservation.login;

import java.util.ArrayList;
import java.util.List;

import com.flightticketreservation.dto.AdminCredentials;
import com.flightticketreservation.dto.UserCredentials;

public class LoginControler implements LoginControlerViewCallBack, LoginControlerModelCallBack {

	private LoginViewCallBack loginView;
	private LoginModelCallBack loginModel;

	LoginControler(LoginView loginView) {
		this.loginView = loginView;
		loginModel = new LoginModel(this);
	}

	@Override
	public void chooseOption(int option) {// to choose admin or user
		if (option == 1) {
			loginView.adminCredentials();
		} else if (option == 2) {
			loginView.userCredentials();
		} else if (option == 3) {
			loginView.addNewUser();
		}
	}

	@Override
	public void checkUserCredentials(String userName, String password) {// validate user credentials
		List<UserCredentials> userCredentials = loginModel.getUserCredentials();
		boolean flag = false;
		for (UserCredentials credential : userCredentials) {
			if (credential.getUserName().equals(userName) && credential.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			loginModel.saveUserName(userName);
			loginView.loginSuccess("Login Succesfully...");

		} else {
			loginView.loginFailure("Login failed..");
		}
	}

	@Override
	public void addNewUser(String userName, String password, String rePassword) {// adding new User
		boolean flag = false;
		if (password.equals(rePassword)) {
			List<UserCredentials> userCredential = loginModel.getUserCredentials();
			for (UserCredentials user : userCredential) {
				if (user.getUserName().equals(userName)) {
					flag = true;
				}
			}
			if (!flag) {
				loginModel.addNewUser(userName, password);
				loginView.successMessage("User Added Succesfully");
			} else {
				loginView.failureMessage("unable to Add user");
			}

		} else {
			loginView.failureMessage("Please enter correct password");
		}
	}

	@Override
	public void checkContinue(String check) {// checking do you want to continue
		if (check.equals("y") || check.equals("Y") || check.equals("yes") || check.equals("YES")) {
			loginView.callIndex();
		} else {
			loginView.exitMethod();
		}
	}

	@Override
	public void chooseBooking(int option) {// choose booking or cancel method
		String userName = loginModel.getUserName();
		if (option == 1) {
			loginView.callBooking(userName);
		} else if (option == 2) {
			loginView.callCancelModule(userName);
		} else if (option == 3) {
			loginView.callIndex();
		}
	}

	@Override
	public void checkAdminCredentials(String userName, String password) {
		List<AdminCredentials> credential = loginModel.getAdminCredential();
		boolean flag = false;
		for (AdminCredentials check : credential) {
			if (check.getUserName().equals(userName) && check.getPassWord().equals(password)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			loginView.callAdmin();
		} else {
			loginView.failureMessage("----> login Failed <-----");
		}

	}

}
