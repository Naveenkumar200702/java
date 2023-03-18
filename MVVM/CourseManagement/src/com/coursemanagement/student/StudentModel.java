package com.coursemanagement.student;

import java.util.List;

import com.coursemanagement.Repository.Repository;
import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.CourseRegistration;
import com.coursemanagement.dto.StudentInfo;

public class StudentModel {

	private StudentView studentView;

	public StudentModel(StudentView studentView) {
		this.studentView = studentView;
	}

	private String studentId;

	public void setStudentId(String userId) {
		this.studentId = userId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void getStudentInfo(String userId) {
		StudentInfo info = Repository.getInstance().getStudentInfo(userId);
		if (info == null)
			studentView.errorMessage("Invalid student id");
		else
			studentView.printStudentInfo(info);
	}

	public void checkContinue(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			studentView.studentIndex(getStudentId());
		} else {
			studentView.exitMethod("Thank you for visition");
		}
	}

	// ========================getting ongoing course=======================

	public void getOngoingCourse() {
		List<CourseInfo> onGoingCourse = Repository.getInstance().getOngoingCourse();
		if (onGoingCourse.size() == 0) {
			studentView.courseMessage("currently there is no ongoing course");
		} else {
			studentView.course(onGoingCourse, "Ongoing Course");
		}
	}

//================================getting upcomming course=====================

	public void getUpcomingCourse() {
		List<CourseInfo> upCommingCourse = Repository.getInstance().getUpCommingCourse();
		if (upCommingCourse.size() == 0) {
			studentView.courseMessage("currently there is no ongoing course");
		} else {
			studentView.course(upCommingCourse, "Upcomming Course");
		}
	}

	public void registerCourse(String courseId) {
		if (Repository.getInstance().registerCourse(courseId, studentId)) {
			studentView.message("Course Registered Succesfully");
		} else {
			studentView.errorMessage("Enter a Valid course Id");
		}
	}

	public List<CourseRegistration> getRegisterCourse(String courseId) {
		return Repository.getInstance().getRegisteredCourse(studentId);
	}
}
