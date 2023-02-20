package com.librarymanagement.login;

public interface LoginViewCallBack {
	void loginSuccess(String userName);
	void loginFailure(String errorMessage);
}
