package com.coursemanagement.dto;

import java.time.LocalDate;
import java.util.List;

public class StudentCredentials extends StudentInfo{
	
	private String password;
	
	public StudentCredentials(String userName,String password)
	{
		super(userName);
		this.setPassword(password);
	}

	public StudentCredentials(String stuId, String name, String email, LocalDate dob, String clgName, int passedOut,
			List<String> intrests, String password2) {
		super(stuId,name,email,dob,clgName,passedOut,intrests);
		this.password=password2;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
}
