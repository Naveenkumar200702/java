package com.flightticketreservation.login;

import java.util.List;

import com.flightticketreservation.dto.AdminCredentials;
import com.flightticketreservation.dto.UserCredentials;
import com.flightticketreservation.repository.Repository;

public class LoginModel implements LoginModelCallBack {
	
	private LoginControlerModelCallBack loginControler;

	LoginModel(LoginControler loginControler) {
		this.loginControler = loginControler;
	}

	private String userName;
	@Override
	public List<UserCredentials> getUserCredentials() {//get usercredential to validate
		return Repository.getInstance().getUserCredentials();
	}

	@Override
	public void addNewUser(String userName, String password) {
		Repository.getInstance().addNewUser(userName,password);	
	}

	@Override
	public void saveUserName(String userName) {
		this.userName=userName;	
	}

	public String getUserName() {
		return userName;
	}

	@Override
	public List<AdminCredentials> getAdminCredential() {
		// TODO Auto-generated method stub
		return Repository.getInstance().getAdminCredentials();
	}

}
