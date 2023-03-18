package com.coursemanagement.login;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.coursemanagement.Repository.Repository;

public class LoginModel {

	private LoginView loginView;
	private LoginModel loginModel;

	public LoginModel(LoginView loginView) {
		this.loginView = loginView;
	}
	
	private String id = "";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//================================check the id (admin,student,trainee)==================================

	public void checkUser(String userId, String password) {
		switch (userId.substring(0, 2)) {
		case "AD":
			if (Repository.getInstance().checkAdminInfo(userId, password)) {
				loginView.callAdmin(userId);
			} else {
				loginView.errorMessage("Invalid Admin name or password");
			}
			break;
		case "ST":
			if (Repository.getInstance().checkStudentInfo(userId, password)) {
				loginView.callStudent(userId);
			} else {
				loginView.errorMessage("Invalid Trainee Name or password");
			}
			break;
		case "TR":
			if (Repository.getInstance().checkTraineInfo(userId, password)) {
				loginView.callTrainee(userId);
			} else {
				loginView.errorMessage("Invalid Trainee Name or password");
			}
			break;
		default:
			loginView.errorMessage("Invalid user Credentials");
			break;
		}
	}

	public void continueCheck(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			loginView.loginIndex();
		} else {
			loginView.exitMethod("Thank you for visition");
		}
	}

	public boolean studentValidate(String name, String email, String dob, String clgName, String graduationYear,
			String intrests) {
		name = name.toLowerCase();
		intrests = intrests.toLowerCase();
		LocalDate date = null;
		intrests = intrests.toLowerCase();
		if (!name.matches("[a-z\\s]+")) {
			loginView.errorMessage("Invalid Name");
			return false;
		} else if (!email.matches("^[a-z0-9]+[@?][gmail]+[.?][com]+$")) {
			loginView.errorMessage("Invalid Email");
			return false;
		} else if (!dob.matches("[0-9]{2}[/?][0-9]{2}[/?][0-9]{4}")) {
			loginView.errorMessage("Invalid DateOfBirth");
			return false;
		} else if (!clgName.matches("[a-zA-z\\s]+")) {
			loginView.errorMessage("Invalid college name");
			return false;
		} else if (!graduationYear.matches("[0-9]+")) {
			loginView.errorMessage("Invalid Year of graduation");
			return false;
		} else if (!intrests.matches("[a-z,]+")) {
			loginView.errorMessage("please enter a valid format for intrest");
			return false;
		} else {
			String[] dateArr = dob.split("/");
			date = LocalDate.of(Integer.parseInt(dateArr[2]), Integer.parseInt(dateArr[1]),
					Integer.parseInt(dateArr[0]));			
			String[] intrestArr = intrests.split(",");
			List<String> intrest = new ArrayList(Arrays.asList(intrestArr));
			String id = Repository.getInstance().addStudentDetail(name, email, date, clgName, graduationYear, intrest);
			this.id = id;
			return true;
		}
	}

	

	public String getPassword(String id) {
		return Repository.getInstance().getPassword(id);
	}

	public void validitateOTP(String loginId, String otp) {
		if (getId().equals(loginId)) {
			if (Repository.getInstance().getPassword(getId()).equals(otp)) {
				loginView.resetPassword(loginId);
			} else {
				loginView.errorMessage("Password mismatch");
			}
		} else {
			System.out.println("Invalid username");
		}
	}

	public void setPassword(String loginId, String password, String rePassword) {
		if (password.equals(rePassword)) {
			if (setPassword(loginId, password))
				loginView.message("Password Reset succesfully");
		} else {
			loginView.passwordMisMatch("PassWord misMatch", loginId);
		}
	}

	public boolean checkFirstTimeLogin(String userId) {
		return Repository.getInstance().getFirstTimeLoginFlag(userId);
	}

	public String getFirstTimePassword(String userId) {
		return Repository.getInstance().getFirstTimeLoginPassword(userId);
	}

	public void setTrainePassword(String userId, String rePassword) {
		Repository.getInstance().setTrainePassword(userId, rePassword);
	}

	public boolean setPassword(String loginId, String password) {
		return Repository.getInstance().setPassword(loginId, password);
	}

}
