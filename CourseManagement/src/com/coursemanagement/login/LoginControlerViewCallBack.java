package com.coursemanagement.login;

public interface LoginControlerViewCallBack {

	void checkUser(String userId, String password);

	void continueCheck(String option);

	boolean studentValidate(String name, String email, String dob, String clgName, String graduationYear,
			String intrests);

	String getId();

	String getPassword(String id);

	void validitateOTP(String loginId, String otp);

	void setPassword(String loginId, String password, String rePassword);

	boolean checkFirstTimeLogin(String userId);

	String getFirstTimePassword(String userId);

	void setTrainePassword(String userId, String rePassword);

	

}
