package com.coursemanagement.login;

import java.time.LocalDate;

public class LoginControler implements LoginControlerViewCallBack, LoginControlerModelCallBack {

	private LoginViewCallBack loginView;
	private LoginModelCallBack loginModel;

	public LoginControler(LoginView loginView) {
		this.loginView = loginView;
		loginModel = new LoginModel(this);
	}

//================================check the id (admin,student,trainee)==================================
	@Override
	public void checkUser(String userId, String password) {
		switch (userId.substring(0, 2)) {
		case "AD":
			if (loginModel.checkAdminInfo(userId, password)) {
				loginView.callAdmin(userId);
			} else {
				loginView.errorMessage("Invalid Admin name or password");
			}
			break;
		case "ST":
			if (loginModel.checkStudentInfo(userId, password)) {
				loginView.callStudent(userId);
			} else {
				loginView.errorMessage("Invalid Trainee Name or password");
			}
			break;
		case "TR":
			if (loginModel.checkTraineInfo(userId, password)) {
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

	@Override
	public void continueCheck(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			loginView.loginIndex();
		} else {
			loginView.exitMethod("Thank you for visition");
		}
	}

	@Override
	public boolean studentValidate(String name, String email, String dob, String clgName, String graduationYear,
			String intrests) {
		name = name.toLowerCase();
		intrests=intrests.toLowerCase();
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
		} else if (!graduationYear.matches("[0-9]+")){
			loginView.errorMessage("Invalid Year of graduation");
			return false;
		} else if (!intrests.matches("[a-z,]+")) {
			loginView.errorMessage("please enter a valid format for intrest");
			return false;
		} else {
			String[] dateArr = dob.split("/");
			date = LocalDate.of(Integer.parseInt(dateArr[2]), Integer.parseInt(dateArr[1]),
					Integer.parseInt(dateArr[0]));

			loginModel.addStudentDetail(name, email, date, clgName, graduationYear, intrests);
			return true;
		}
	}

	@Override
	public String getId() {
		return loginModel.getId();
	}

	@Override
	public String getPassword(String id) {	
		return loginModel.getPassword(id);
	}

	@Override
	public void validitateOTP(String loginId, String otp) {
		if(loginModel.getId().equals(loginId))
		{
			if(loginModel.getPassword(loginModel.getId()).equals(otp))
			{
				loginView.resetPassword(loginId);
			}
			else {
				loginView.errorMessage("Password mismatch");
			}
		}	
		else {
			System.out.println("Invalid username");
		}
	}

	@Override
	public void setPassword(String loginId, String password, String rePassword) {
		if(password.equals(rePassword)) {
			if(loginModel.setPassword(loginId,password))
				loginView.message("Password Reset succesfully");		
		}
		else {
			loginView.passwordMisMatch("PassWord misMatch",loginId);
		}
	}

	@Override
	public boolean checkFirstTimeLogin(String userId) {
		return loginModel.checkFirstTimeLogin(userId);
	}

	@Override
	public String getFirstTimePassword(String userId) {
		return loginModel.getFirstTimePassword(userId);
	}

	@Override
	public void setTrainePassword(String userId, String rePassword) {
		loginModel.setTrainePassword(userId,rePassword);
	}

}
