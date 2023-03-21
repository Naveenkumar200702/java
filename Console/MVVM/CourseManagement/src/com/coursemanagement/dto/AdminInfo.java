package com.coursemanagement.dto;

public class AdminInfo {
	private String userName;
	private String name;
	
	public AdminInfo(String userName,String name)
	{
		this.userName=userName;
		this.name=name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}	
	
}
