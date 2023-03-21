package com.mailapplication.login;

import java.time.LocalDate;
import java.util.UUID;

import com.mailapplication.Repository.Repository;

public class LoginModel implements LoginModelCallBack {

	private LoginControlerModelCallBack loginControler;

	public LoginModel(LoginControler loginControler) {
		this.loginControler = loginControler;
	}

	@Override
	public boolean validate(String emailId) {
		return Repository.getInstance().checkNewEmail(emailId);
	}

	@Override
	public boolean addNewEmail(String emailId, String password, String firstName, String lastName, LocalDate dob,
			String gender, String phoneNo) {
		return Repository.getInstance().addNewUser(emailId, password, firstName, lastName, dob, gender, phoneNo);

	}

	@Override
	public boolean validateMail(String mailId, String password) {
		return Repository.getInstance().validateMail(mailId, password);
	}

	@Override
	public String getOtp(String mailId, String phoneNo) {
		UUID uuid = UUID.randomUUID();
		String value = uuid.toString().replace("-", "");
		String otp = value.substring(value.length() - 8);
		Repository.getInstance().getOtp(mailId, phoneNo, otp);
		return otp;
	}

	@Override
	public boolean setPassword(String mailId, String password) {
		return Repository.getInstance().setPassword(mailId, password);
	}

}
