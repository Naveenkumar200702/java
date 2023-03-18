package com.mailapplication.login;

import java.time.LocalDate;

public interface LoginModelCallBack {

	boolean validate(String emailId);

	boolean addNewEmail(String emailId, String password, String firstName, String lastName, LocalDate parse,
			String gender, String phoneNo);

	boolean validateMail(String mailId, String password);

	String getOtp(String mailId, String phoneNo);

	boolean setPassword(String mailId, String password);

}
