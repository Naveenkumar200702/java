package com.coursemanagement.Admin;

import java.util.List;
import java.util.Scanner;

import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.TrainerCredentials;
import com.coursemanagement.login.LoginView;

public class AdminView implements AdminViewCallBack {

	private AdminControlerViewCallBack adminControler;
	private Scanner input = new Scanner(System.in);

	public AdminView() {
		adminControler = new AdminControler(this);
	}

//========================Admin Index=============================================
	public void adminIndex(String userId) {
		adminControler.setAdminId(userId);
		System.out.println("Welcome --->" + userId);
		System.out.println("Enter 1: Add Admin");
		System.out.println("Enter 2: Add Trainer");
		System.out.println("Enter 3: View Trainers");
		System.out.println("Enter 4: View Courses");
		System.out.println("Enter 5: Add courses");
		System.out.println("Enter 6: remove Courses");
		System.out.println("Enter 7: LogOut");
		System.out.println("Enter option--->");
		String option = input.nextLine();
		if (option.length() != 1) {
			System.out.println("Enter a valid option");
			adminIndex(userId);
			return;
		}
		int op = Integer.parseInt(option);
		switch (op) {
		case 1:
			System.out.print("Enter Admin Name --->");
			String name = input.nextLine();
			System.out.print("Enter new Password --->");
			String password = input.nextLine();
			System.out.print("Re-enter password --->");
			String rePassword = input.nextLine();
			adminControler.addAdmin(name, password, rePassword);
			break;
		case 2:
			System.out.print("Trainer Name --->");
			String traineName = input.nextLine();
			System.out.print("Trainer dob (dd/mm/yyyy)--->");
			String dob = input.nextLine();
			System.out.print("Experience in years ---> ");
			String experience = input.nextLine();
			System.out.print("Enter phone Number -->");
			String phoneNo = input.nextLine();
			System.out.print("Email Id ---> ");
			String emailId = input.nextLine();
			System.out.print("Enter subjects -->(separated by coma(,) --->");
			String subjects = input.nextLine();
			adminControler.addTrainer(traineName, dob, experience, phoneNo, emailId, subjects);
			break;
		case 3:
			adminControler.showTrainers();
			break;
		case 4:
			List<CourseInfo> courseInformation = adminControler.getCourseInfo();
			if (courseInformation == null) {
				System.out.println("No course Available");
				return;
			}
			printCourses(courseInformation);
			break;
		case 5:
			System.out.print("Enter course Name --->");
			String courseName = input.nextLine();
			System.out.print("Enter course Info in a paragraph --->");
			String courseInfo = input.nextLine();
			System.out.println("Enter course Modules --->(Separated by coma(,) -->");
			String courseModule = input.nextLine();
			System.out.print("Enter course Starting date (yyyy/mm/dd)-->");
			String startDate = input.nextLine();
			System.out.print("Enter course Ending Date(yyyy/mm/dd) --> ");
			String endDate = input.nextLine();
			System.out.print("Enter course Examination Date(yyyy/mm/dd) --> ");
			String examDate = input.nextLine();
			adminControler.viewTrainer();
			System.out.print("Enter Trainee ID to choose --->");
			String traineId = input.nextLine();
			adminControler.addCourse(courseName, courseInfo, courseModule, startDate, endDate, examDate, traineId);

		case 6:
			System.out.print("Enter course Id to remove the course --->");
			String courseId = input.nextLine();
			if (!courseId.substring(0, 3).equals("CID")) {
				System.out.println("Invalid courseID");
				checkContinue();
			} else
				adminControler.deleteCourse(courseId);
			break;
		case 7:
			LoginView loginView = new LoginView();
			loginView.loginIndex();
		}
	}

//==================================printing cources===================================
	private void printCourses(List<CourseInfo> courseInformation) {
		if (courseInformation.size() == 0) {
			System.out.println("No courses Available");
			System.out.println("------------------------");
			checkContinue();
			return;
		}
		for (CourseInfo val : courseInformation) {
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

	// ==============================Check continue================================
	public void checkContinue() {
		System.out.print("Do you want to continue? (y/n) -->");
		String option = input.nextLine();
		adminControler.continueCheck(option);
	}

//=============================printMessage=================================
	@Override
	public void message(String string) {
		System.out.println(string);
		checkContinue();
	}

//===========================Exit method========================================
	@Override
	public void exitMethod(String string) {
		System.out.println("Thanks for visiting");
	}

//==================error messages======================================
	@Override
	public void errorMessage(String string) {
		System.out.println(string);
		checkContinue();
	}

//==========================printing trainers info=================================
	@Override
	public void showTrainerInfo(List<TrainerCredentials> trainerInfo) {
		System.out.printf("%15s |%15s |%15s |%15s |%15s |%20s  |%n", "UserId", "name", "Date-Of-Birth", "Experience",
				"PhoneNo", "mailId");
		for (TrainerCredentials val : trainerInfo) {
			System.out.printf("%15s |%15s |%15s |%15d |%15s | %20s |%n", val.getUserId(), val.getName(),
					val.getDob().toString(), val.getExperience(), val.getPhoneNo(), val.getMailId());
		}
		checkContinue();
	}

	@Override
	public void chooseTrainers(List<TrainerCredentials> trainerInfo) {
		System.out.printf("%5s |%15s |%15s |%15s |%15s |%15s | %n", "UserId", "name", "Date-Of-Birth", "Experience",
				"PhoneNo", "mailId");
		for (TrainerCredentials val : trainerInfo) {
			System.out.printf("%5s |%15s |%15s |%15d |%15s |%15s | %n", val.getUserId(), val.getName(),
					val.getDob().toString(), val.getExperience(), val.getPhoneNo(), val.getMailId());
		}
	}
}
