package com.flightticketbooking.dto;

public class AdminCredentials {
	private String userName;
	private String password;
	
	public AdminCredentials(String userName, String password) {
		this.userName=userName;
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
