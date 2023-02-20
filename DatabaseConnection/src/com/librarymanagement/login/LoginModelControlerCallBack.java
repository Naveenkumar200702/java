package com.librarymanagement.login;

public interface LoginModelControlerCallBack {
	void loginSuccess(String userName);
	void loginFailure(String errorMessage);	
}
