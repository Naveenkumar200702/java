package com.coursemanagement.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class CourseRegistration {

	private String courseId;
	private String studentId;
	LocalDate registerDate;
	LocalTime registerDay;
	private String courseName;
	public CourseRegistration(String courseName,String courseId,String studentId, LocalDate registerDate,LocalTime registerDay)
	{
		this.setCourseName(courseName);
		this.courseId=courseId;
		this.studentId=studentId;
		this.registerDate=registerDate;
		this.registerDay=registerDay;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public LocalDate getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}
	public LocalTime getRegisterDay() {
		return registerDay;
	}
	public void setRegisterDay(LocalTime registerDay) {
		this.registerDay = registerDay;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
