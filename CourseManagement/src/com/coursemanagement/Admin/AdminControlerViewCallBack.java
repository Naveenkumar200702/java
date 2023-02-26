package com.coursemanagement.Admin;

import java.util.List;

import com.coursemanagement.dto.CourseInfo;

public interface AdminControlerViewCallBack {

	void addAdmin(String name, String password, String rePassword);

	void continueCheck(String option);

	void setAdminId(String userId);

	void addTrainer(String traineName, String dob, String experience, String phoneNo, String emailId, String subjects);

	void addCourse(String courseName, String courseInfo, String courseModule, String startDate, String endDate,
			String examDate, String traineId);

	List<CourseInfo> getCourseInfo();

	void deleteCourse(String courseId);

	void showTrainers();

	void viewTrainer();

}
