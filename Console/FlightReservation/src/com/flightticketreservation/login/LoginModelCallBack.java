package com.flightticketreservation.login;

import java.util.List;

import com.flightticketreservation.dto.AdminCredentials;
import com.flightticketreservation.dto.UserCredentials;

public interface LoginModelCallBack {

	List<UserCredentials> getUserCredentials();

	void addNewUser(String userName, String password);

	void saveUserName(String userName);

	String getUserName();

	List<AdminCredentials> getAdminCredential();
	

}
