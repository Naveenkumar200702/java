package com.mailapplication.login;

public interface LoginControlerViewCallBack {

	void validate(String firstName, String lastName, String dob, String gender, String phoneNo);

	void continueCheck(String option);

	void validateMail(String mailId, String password);

	boolean checkMail(String mailId);

	String getOtp(String mailId, String phoneNo);

	void setPassword(String mailId, String password);

}
