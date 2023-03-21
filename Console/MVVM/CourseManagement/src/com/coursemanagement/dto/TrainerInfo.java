package com.coursemanagement.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrainerInfo {
	private String userId;
	private String name;
	private LocalDate dob;
	private int experience;
	private String phoneNo;
	private String mailId;
	private int rating;
	private List<String> allcoatedCources= new ArrayList();
	private List<String> subjects = new ArrayList();
	private boolean notification;

	public TrainerInfo(String userName) {
		this.userId = userName;
	}

	public TrainerInfo(String traineUserId, String traineName, LocalDate date, int experience2, String phoneNo2,
			String emailId, boolean check, ArrayList subjects) {
		this.userId = traineUserId;
		this.name = traineName;
		this.dob = date;
		this.experience = experience2;
		this.phoneNo = phoneNo2;
		this.mailId = emailId;
		this.notification = check;
		this.subjects=subjects;
		this.notification=check;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public boolean isNotification() {
		return notification;
	}

	public void setNotification(boolean notification) {
		this.notification = notification;
	}
	
	public boolean getNotification(){
		return notification;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<String> getAllcoatedCources() {
		return allcoatedCources;
	}

	public void setAllcoatedCources(List<String> allcoatedCources) {
		this.allcoatedCources = allcoatedCources;
	}

}
