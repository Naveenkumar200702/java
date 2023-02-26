package com.coursemanagement.student;

import java.util.List;

import com.coursemanagement.Repository.Repository;
import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.CourseRegistration;
import com.coursemanagement.dto.StudentInfo;

public class StudentModel implements StudentModelCallBack{
	
	private StudentControlerModelCallBack studentControler;
	private String studentId;
	
	@Override
	public void setStudentId(String userId) {
		this.studentId=userId;
	}

	public String getStudentId()
	{
		return studentId;
	}
	public StudentModel(StudentControler studentControler) {
		this.studentControler=studentControler;
	}

	@Override
	public StudentInfo getStudentInfo(String userId) {
		return Repository.getInstance().getStudentInfo(userId);
	}

	@Override
	public List<CourseInfo> getOngoingCourse() {
		return Repository.getInstance().getOngoingCourse();
	}

	@Override
	public List<CourseInfo> getUpCommingCourse() {
		return Repository.getInstance().getUpCommingCourse();
	}

	@Override
	public boolean registerCourse(String courseId) {
		return Repository.getInstance().registerCourse(courseId,studentId);
	}

	@Override
	public List<CourseRegistration> getRegisteredCourse(String userId) {
		
		return Repository.getInstance().getRegisteredCourse(userId);
	}

	

	
	
	

}
