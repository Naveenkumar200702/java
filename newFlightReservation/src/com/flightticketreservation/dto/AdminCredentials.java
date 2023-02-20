package com.flightticketreservation.dto;

public class AdminCredentials {

	private String userName;
	private String passWord;
	public AdminCredentials(String userName,String passWord)
	{
		this.userName=userName;
		this.passWord=passWord;
	}
	public String getPassWord() {
		return passWord;
	}
	public String getUserName() {
		return userName;
	}
}
