package com.coursemanagement.login;

import java.time.LocalDate;

public interface LoginModelCallBack {

	boolean checkAdminInfo(String userId, String password);

	boolean checkStudentInfo(String userId, String password);

	boolean checkTraineInfo(String userId, String password);

	void addStudentDetail(String name, String email, LocalDate dob, String clgName, String graduationYear,
			String intrests);

	String getId();

	String getPassword(String id);

	boolean setPassword(String loginId, String password);

	boolean checkFirstTimeLogin(String userId);

	String getFirstTimePassword(String userId);

	void setTrainePassword(String userId, String rePassword);

	

}
