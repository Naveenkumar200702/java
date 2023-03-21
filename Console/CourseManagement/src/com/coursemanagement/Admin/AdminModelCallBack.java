package com.coursemanagement.Admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.TrainerCredentials;
import com.coursemanagement.dto.TrainerInfo;

public interface AdminModelCallBack {

	String addAdmin(String name, String password);

	void setAdminId(String userId);

	Object getAdminId();

	void addTrainer(String traineName, String dob, String experience, String phoneNo, String emailId, ArrayList arrayList);

	boolean addCourses(String courseName, String courseInfo, ArrayList arrayList, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, String traineeId);

	List<CourseInfo> getCourseInfo();

	boolean deleteCourse(String courseId);

	List<TrainerCredentials> trainerInfo();

}
