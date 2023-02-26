package com.coursemanagement.traine;

import java.util.List;
import java.util.Scanner;

import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.TrainerCredentials;
import com.coursemanagement.login.LoginView;

public class TraineView implements TraineViewCallBack {

	private TraineControlerViewCallBack traineControl;
	private Scanner input = new Scanner(System.in);

	public TraineView() {
		this.traineControl = new TraineControler(this);
	}

	public void traineIndex(String userId) {
		traineControl.setUserId(userId);
		System.out.println("Welcome --> " + userId);
		System.out.println("Enter 1:My profile");
		System.out.println("Enter 2: Assignned Courses");
		System.out.println("Enter 3: Exit");
		System.out.print("Choose an Option ---> ");
		String option = input.nextLine();
		if (option.length() != 1) {
			System.out.println("Enter a valid option");
			traineIndex(userId);
			return;
		}
		int op = Integer.parseInt(option);
		switch (op) {
		case 1:
			traineControl.showTraineProfile(userId);
			break;
		case 2:
			traineControl.showAssignedCourse(userId);
			break;
		case 3:
			LoginView loginView = new LoginView();
			loginView.loginIndex();
			break;
		default:
			System.out.println("Enter a valid option");
			traineIndex(userId);
			break;
		}
	}

	@Override
	public void printProfile(TrainerCredentials traineProfile) {
		System.out.println("-------------------------------------");
		System.out.println(" User Id --> " + traineProfile.getUserId());
		System.out.println("Name --- > " + traineProfile.getName());
		System.out.println("Email ID ---> " + traineProfile.getMailId());
		System.out.println("Date-Of-Birth ---> " + traineProfile.getDob());
		System.out.println("Experience ---> " + traineProfile.getExperience());
		System.out.println("Phone No ---> " + traineProfile.getPhoneNo());
		System.out.println("----------------------------------------");
		checkContinue();
	}

	@Override
	public void errorMessage(String string, String userId) {
		System.out.println(string);
		System.out.println("----------------");
		traineIndex(userId);
	}

	void checkContinue() {
		System.out.print("Do you want to continue? (y/n) -->");
		String option = input.nextLine();
		traineControl.continueCheck(option);
	}

	@Override
	public void showCourses(List<CourseInfo> assignedCourse) {

		for (CourseInfo val : assignedCourse) {
			System.out.println("CourseId -->\t " + val.getCourseId());
			System.out.println("Course Name ---> " + val.getCourseName());
			System.out.println("Course Info --> " + val.getCourseInfo());
			System.out.println("Course Module -->" + val.getCourseModule());
			System.out.println("Course Start Date --> " + val.getStartingDate());
			System.out.println("Course Ending Date --> " + val.getEndingDate());
			System.out.println("Course Examination Date --> " + val.getExaminationDate());
			System.out.println("-------------------------------------------------------");
		}
		checkContinue();
	}

	@Override
	public void exitMethod(String string) {
		System.out.println(string);
		System.out.println("----------------------");
	}

}
