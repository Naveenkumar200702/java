package com.coursemanagement.dto;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrainerCredentials extends TrainerInfo{

	private String password;
	public TrainerCredentials(String userName,String password)
	{
		super(userName);
		this.setPassword(password);
	}
	public TrainerCredentials(String traineUserId, String password2, String traineName, LocalDate date, int experience,
			String phoneNo, String emailId, boolean check, ArrayList subjects) {
		super(traineUserId,traineName,date,experience,phoneNo,emailId,check,subjects);
		this.password=password2;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
