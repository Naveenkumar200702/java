package com.coursemanagement.Admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.coursemanagement.Repository.Repository;
import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.TrainerCredentials;
import com.coursemanagement.dto.TrainerInfo;

public class AdminModel implements AdminModelCallBack {

	private AdminControlerModelCallBack adminControler;

	public AdminModel(AdminControler adminControler) {
		this.adminControler = adminControler;
	}

	private String adminId;

	@Override
	public String addAdmin(String name, String password) {
		return Repository.getInstance().addAmin(name, password);
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

//====================ADDING TRAINERS=================================
	@Override
	public void addTrainer(String traineName, String dob, String experience, String phoneNo, String emailId,
			ArrayList subjects) {
		String dateArr[] = dob.split("/");
		LocalDate date = LocalDate.of(Integer.parseInt(dateArr[2]), Integer.parseInt(dateArr[1]),
				Integer.parseInt(dateArr[0]));
		String trainerId = Repository.getInstance().addTrainee(traineName, date, experience, phoneNo, emailId,
				subjects);
		adminControler.viewAddedTraine(trainerId);
	}

//=========================ADDING COURSES========================================
	@Override
	public boolean addCourses(String courseName, String courseInfo, ArrayList courseModules, LocalDate startDate,
			LocalDate endDate, LocalDate examDate, String traineeId) {
		return Repository.getInstance().addCourse(courseName, courseInfo, courseModules, startDate, endDate, examDate,
				traineeId);

	}

	@Override
	public List<CourseInfo> getCourseInfo() {
		return Repository.getInstance().getCourseInfo();
	}

	@Override
	public boolean deleteCourse(String courseId) {
		return Repository.getInstance().deleteCourse(courseId);
	}

	@Override
	public List<TrainerCredentials> trainerInfo() {
		return Repository.getInstance().getTrainerInfo();
	}

}
