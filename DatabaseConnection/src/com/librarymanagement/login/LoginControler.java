package com.librarymanagement.login;

public class LoginControler implements LoginControlerCallBack,LoginModelControlerCallBack{

	private LoginModelCallBack loginModel;
	private LoginViewCallBack loginView;

	public LoginControler(LoginView loginView) {
		this.loginView = loginView;
		this.loginModel = new LoginModel(this);
	}

	public void checkValidAccount(String userName, String password) {
		loginModel.checkAccount(userName, password);
	}

	public void loginSuccess(String userName) {
		loginView.loginSuccess(userName);
	}

	public void loginFailure(String errorMessage) {
		loginView.loginFailure(errorMessage);
	}

}
