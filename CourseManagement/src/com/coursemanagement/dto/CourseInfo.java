package com.coursemanagement.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseInfo {
	
	private String courseId;
	private String courseName;
	private LocalDate startingDate;
	private LocalDate endingDate;
	private LocalDate examinationDate;
	private String courseInfo;
	private List<String> courseModule=new ArrayList();
	private String allocatedIncharge;
	
	public CourseInfo(String courseId, String courseName, String courseInfo, ArrayList courseModules,
			LocalDate startDate, LocalDate endDate, LocalDate examDate,String allocatedIncharge) {
		this.courseId=courseId;
		this.courseName=courseName;
		this.courseInfo=courseInfo;
		this.courseModule=courseModules;
		this.startingDate=startDate;
		this.endingDate=endDate;
		this.examinationDate=examDate;
		this.allocatedIncharge=allocatedIncharge;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public LocalDate getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
	public LocalDate getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}
	public LocalDate getExaminationDate() {
		return examinationDate;
	}
	public void setExaminationDate(LocalDate examinationDate) {
		this.examinationDate = examinationDate;
	}
	public String getCourseInfo() {
		return courseInfo;
	}
	public void setCourseInfo(String courseInfo) {
		this.courseInfo = courseInfo;
	}
	public List<String> getCourseModule() {
		return courseModule;
	}
	public void setCourseModule(List<String> courseModule) {
		this.courseModule = courseModule;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getAllocatedIncharge() {
		return allocatedIncharge;
	}
	public void setAllocatedIncharge(String allocatedIncharge) {
		this.allocatedIncharge = allocatedIncharge;
	}
	
	
}
