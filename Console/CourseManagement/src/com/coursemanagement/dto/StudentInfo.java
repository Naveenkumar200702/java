package com.coursemanagement.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentInfo {

	private String userId;
	private String name;
	private String email;
	private LocalDate dob;
	private String collegeName;
	private int passedOut;
	private List<String> intrest = new ArrayList();

	public StudentInfo(String userId, String name, String email, LocalDate dob, String collegeName, int passedOut,
			List<String> intrest) {
		this.userId=userId;
		this.name=name;
		this.email=email;
		this.dob=dob;
		this.collegeName=collegeName;
		this.setPassedOut(passedOut);
		this.intrest=intrest;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<String> getIntrest() {
		return intrest;
	}

	public void setIntrest(List<String> intrest) {
		this.intrest = intrest;
	}

	public StudentInfo(String userName) {
		this.userId = userName;
	}

	public int getPassedOut() {
		return passedOut;
	}

	public void setPassedOut(int passedOut) {
		this.passedOut = passedOut;
	}

}
