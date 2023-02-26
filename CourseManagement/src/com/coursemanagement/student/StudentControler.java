package com.coursemanagement.student;

import java.util.List;

import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.CourseRegistration;
import com.coursemanagement.dto.StudentInfo;

public class StudentControler implements StudentControlerViewCallBack,StudentControlerModelCallBack {

	private StudentViewCallBack studentView;
	private StudentModelCallBack studentModel;
	public StudentControler(StudentView studentView) {
		this.studentView=studentView;
		studentModel=new StudentModel(this);
	}
	@Override
	public void getStudentInfo(String userId) {
		StudentInfo info=studentModel.getStudentInfo(userId);
		if(info==null)
				studentView.errorMessage("Invalid student id");
		else
			studentView.printStudentInfo(info);
	}
	
	@Override
	public void checkContinue(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			studentView.studentIndex(studentModel.getStudentId());
		} else {
			studentView.exitMethod("Thank you for visition");
		}
		
	}
	
	
	
	@Override
	public void setStudentId(String userId) {
		studentModel.setStudentId(userId);
	}
	
	//========================getting ongoing course=======================
	@Override
	public void getOngoingCourse() {
		List<CourseInfo> onGoingCourse=studentModel.getOngoingCourse();	
		if(onGoingCourse.size()==0)
		{
			studentView.courseMessage("currently there is no ongoing course");
		}
		else
		{
			studentView.course(onGoingCourse,"Ongoing Course");
		}
	}
//================================getting upcomming course=====================
	@Override
	public void getUpcomingCourse() {
		List<CourseInfo> upCommingCourse=studentModel.getUpCommingCourse();
		if(upCommingCourse.size()==0)
		{
			studentView.courseMessage("currently there is no ongoing course");
		}
		else
		{
			studentView.course(upCommingCourse,"Upcomming Course");
		}
	}
	@Override
	public String getStudentId() {
		return studentModel.getStudentId();
	}
	@Override
	public void registerCourse(String courseId) {
		if(studentModel.registerCourse(courseId))
		{
			studentView.message("Course Registered Succesfully");
		}
		else {
			studentView.errorMessage("Enter a Valid course Id");
		}	
	}
	@Override
	public List<CourseRegistration> getRegisterCourse(String userId) {
		return studentModel.getRegisteredCourse(userId);
	}	
}
