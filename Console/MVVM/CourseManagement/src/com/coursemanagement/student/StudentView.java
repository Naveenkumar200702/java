package com.coursemanagement.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.CourseRegistration;
import com.coursemanagement.dto.StudentInfo;
import com.coursemanagement.login.LoginView;

public class StudentView {

	private StudentModel studentModel;
	private Scanner input = new Scanner(System.in);

	public StudentView() {
		studentModel = new StudentModel(this);
	}

	public void studentIndex(String userId) {
		studentModel.setStudentId(userId);
		System.out.println("Welcome ---> " + userId);
		System.out.println("Enter 1 View profile");
		System.out.println("Enter 2 My courses");
		System.out.println("Enter 3: Register for a course");
		System.out.println("Enter 4: Completed course");
		System.out.println("Enter 5: LogOut");
		String option = input.nextLine();
		if (option.length() > 1) {
			System.out.println("Invalid Option");
			studentIndex(userId);
			return;
		}
		switch (Integer.parseInt(option)) {
		case 1:
			studentModel.getStudentInfo(userId);
			break;
		case 2:
			getMyRegisteredCourse(userId);
			checkContinue();
			break;
		case 3:
			selectCourse();
			break;
		case 4:
			System.out.println("No Course is being completed");
			checkContinue();
			break;
		case 5:
			new LoginView().loginIndex();
			break;
		}
	}

	private void getMyRegisteredCourse(String userId) {
		System.out.println("---> My Courses <---");
		List<CourseRegistration> myCourse = studentModel.getRegisterCourse(userId);
		if (myCourse.size() == 0) {
			System.out.println("NO course Registered...");
			return;
		} else {
			int count = 1;
			System.out.printf("%s |%15s| %15s|%n", "No", "Course_Name", "Registered_Date");
			for (CourseRegistration val : myCourse) {
				System.out.printf("%3d|%15s |%15s |%n", count, val.getCourseName(), val.getRegisterDate().toString());
				count++;
			}
		}
	}

	private void selectCourse() {
		System.out.println("Enter 1: Ongoing Course");
		System.out.println("Enter 2: Upcoming course");
		System.out.println("Enter 3: Go Back");
		String option = input.nextLine();
		if (option.length() > 1) {
			System.out.println("Invalid Option");
			selectCourse();
			return;
		}
		switch (Integer.parseInt(option)) {
		case 1:
			studentModel.getOngoingCourse();
			System.out.print("Enter Course Id to Register--> ");
			String ongoingCourseId = input.nextLine();
			studentModel.registerCourse(ongoingCourseId);
			break;
		case 2:
			studentModel.getUpcomingCourse();
			System.out.print("Enter Course Id to Register-->");
			String courseId = input.nextLine();
			studentModel.registerCourse(courseId);
			break;
		case 3:
			studentIndex(studentModel.getStudentId());
			break;
		default:
			System.out.println("Enter a valid Option");
			selectCourse();
			break;
		}
	}

//============================printing student info========================================

	public void printStudentInfo(StudentInfo info) {
		System.out.println("\t----------> MY PROFILE <--------------");
		System.out.println(" user Id ---> " + info.getUserId());
		System.out.println(" Name ---> " + info.getName());
		System.out.println("Email Id ---> " + info.getEmail());
		System.out.println("Date Of Birth --->  " + info.getDob());
		System.out.println("College Name---> " + info.getCollegeName());
		System.out.println("Passed out year ---> " + info.getPassedOut());
		System.out.println("Field of Interest ---> " + info.getIntrest());
		System.out.println("--------------------------------------------------");
		checkContinue();
	}

//===============================printing courses==================================

	public void course(List<CourseInfo> course, String courseTime) {
		System.out.println("------------> " + courseTime + " <---------------");
		for (CourseInfo val : course) {
			System.out.println("CourseId -->\t " + val.getCourseId());
			System.out.println("Course Name ---> " + val.getCourseName());
			System.out.println("Course Info --> " + val.getCourseInfo());
			System.out.println("Course Module -->" + val.getCourseModule());
			System.out.println("Course Start Date --> " + val.getStartingDate());
			System.out.println("Course Ending Date --> " + val.getEndingDate());
			System.out.println("Course Examination Date --> " + val.getExaminationDate());
			System.out.println("-------------------------------------------------------");
		}
	}

	void checkContinue() {
		System.out.print("Do you want to continue? (y/n) -->");
		String option = input.nextLine();
		studentModel.checkContinue(option);
	}

	public void errorMessage(String string) {
		System.out.println(string);
	}

	public void exitMethod(String string) {
		System.out.println(string);
	}

	public void courseMessage(String string) {
		System.out.println(string);
		selectCourse();
	}

	public void message(String string) {
		System.out.println(string);
		checkContinue();
	}

}
