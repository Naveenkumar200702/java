package com.librarymanagement.login;

public class LoginModel implements LoginModelCallBack{

	private LoginModelControlerCallBack loginControler;

	public LoginModel(LoginControler loginControler) {
		this.loginControler = loginControler;
	}

	public void checkAccount(String userName, String password) {
		if (userName.equals("Naveen") && password.equals("findIt")) {
			loginControler.loginSuccess(userName);
		} else {
			loginControler.loginFailure("\nInvalid Account. Please Try Again.");
		}
		
	}
	
}
