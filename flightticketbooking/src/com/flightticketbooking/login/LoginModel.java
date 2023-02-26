package com.flightticketbooking.login;

import com.flightticketbooking.dto.AdminCredentials;
import com.flightticketbooking.repository.Repository;

public class LoginModel {
	private LoginControler loginControler;

	public LoginModel(LoginControler loginControler) {
		this.loginControler = loginControler;
	}

	private String userName;

	public void adminLoginCheck(String adminName, String password) {

		AdminCredentials credential = Repository.getInstance().adminCheck(adminName, password);
		if (credential != null) {
			loginControler.adminLoginSuccesfully(adminName);
		} else {
			loginControler.loginFailed("Invalid UserName or Password! Please try again");
		}
	}

	public void userLoginCheck(String userName, String password) {

		if (Repository.getInstance().checkUserCredential(userName, password)) {
			this.userName = userName;
			loginControler.userLoginSuccesfully(userName);
		} else {
			loginControler.loginFailed("Invalid username of Password! please try again");
		}
	}

	public void addUser(String userMail, String password) {
		Repository.getInstance().addUser(userMail, password);
		
	}
}
