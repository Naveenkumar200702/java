package com.coursemanagement.student;

import java.util.List;

import com.coursemanagement.dto.CourseRegistration;

public interface StudentControlerViewCallBack {

	void getStudentInfo(String userId);

	void checkContinue(String option);

	void setStudentId(String userId);

	void getOngoingCourse();

	String getStudentId();

	void getUpcomingCourse();

	void registerCourse(String courseId);

	List<CourseRegistration> getRegisterCourse(String userId);

}
