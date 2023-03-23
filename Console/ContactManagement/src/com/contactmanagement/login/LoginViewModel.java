package com.contactmanagement.login;

import com.contactmanagement.repository.Repository;

public class LoginViewModel {
	LoginView loginView;

	public LoginViewModel(LoginView loginView) {
		this.loginView=loginView;
	}

	public void checkUser(String userName, String password) {
		if(Repository.getInstance().checkUser(userName,password))
		{
			loginView.mainIndex(userName);
		}
		else {
			loginView.errorMessage("unable to Login");
		}
	}

	public boolean isValidUser(String userName) {
		return Repository.getInstance().isValidUser(userName);
	}

	public void addUser(String userName, String password, String phoneNo) {
		if(Repository.getInstance().addNewUser(userName,password,phoneNo))
		{
			loginView.printMessage("User Added succesfully");
		}
		else {
			loginView.errorMessage("Unable to add user");
		}
		
	}

}
