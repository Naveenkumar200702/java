package com.flighticketbooking.login;

import com.flighticketbooking.repository.DatabaseAccess;

public class LoginModel {
	private LoginControler loginControler;

	public LoginModel(LoginControler loginControler) {
		this.loginControler = loginControler;
	}

	String userName;

	public void adminLoginCheck(String userName, String password) {
		try {
			if (DatabaseAccess.getInstance().checkAdmin(userName, password)) {
				this.userName = userName;
				loginControler.adminLoginSuccesfully(userName);
			} else {
				loginControler.loginFailed("Invalid UserName or Password! Please try again");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userLoginCheck(String userName, String password) {
		try {
			if (DatabaseAccess.getInstance().checkUser(userName, password)) {
				this.userName = userName;
				loginControler.loginSuccesfully(userName);
			} else {
				loginControler.loginFailed("Invalid username of Password! please try again");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addUser(String userMail, String password) {
		try {
			DatabaseAccess.getInstance().addUser(userMail, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
