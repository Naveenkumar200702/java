package com.coursemanagement.student;

import java.util.List;

import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.CourseRegistration;
import com.coursemanagement.dto.StudentInfo;

public interface StudentModelCallBack {

	StudentInfo getStudentInfo(String userId);

	void setStudentId(String userId);
	
	public String getStudentId();

	List<CourseInfo> getOngoingCourse();

	List<CourseInfo> getUpCommingCourse();

	boolean registerCourse(String courseId);

	List<CourseRegistration> getRegisteredCourse(String userId);

}
