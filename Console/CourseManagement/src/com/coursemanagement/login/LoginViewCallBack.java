package com.coursemanagement.login;

public interface LoginViewCallBack {

	void errorMessage(String string);

	void exitMethod(String string);

	void loginIndex();

	void callAdmin(String userId);

	void callStudent(String userId);

	void callTrainee(String userId);

	void resetPassword(String loginId);

	void passwordMisMatch(String string, String loginId);

	void message(String string);

}
