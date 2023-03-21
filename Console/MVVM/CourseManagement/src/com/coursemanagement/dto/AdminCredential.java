package com.coursemanagement.dto;

public class AdminCredential extends AdminInfo {
	private String password;

	public AdminCredential(String userName, String password,String name) {
		super(userName,name);
		this.setPassword(password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
