package com.flightticketbooking.login;

public class LoginControler {

	private LoginView loginView;
	private LoginModel loginModel;

	public LoginControler(LoginView loginView) {
		this.loginView = loginView;
		loginModel = new LoginModel(this);
	}

	public void choosenOption(int option) {
		if (option == 1) {
			loginView.adminLogin();
		} else if (option == 2) {
			loginView.userLogin();
		} else if (option == 3) {
			loginView.addUser();
		}else if(option ==4) {
			loginView.Exit();
		}
		else {
			loginView.loginFailed("Please Enter a valid Option");
		}
	}

	public void userLoginSuccesfully(String userName) {
		loginView.userLoginSuccesfully(userName);
	}

	public void userLogin(String userName, String password) {// userLogin
		loginModel.userLoginCheck(userName, password);
	}

	public void loginFailed(String errorMessage) {
		loginView.loginFailed(errorMessage);
	}

	public void adminLogin(String userName, String password) {
		loginModel.adminLoginCheck(userName, password);
	}

	public void adminLoginSuccesfully(String userName) {
		loginView.adminLoginSuccesfully(userName);

	}

	public void addNewUser(String userMail, String password, String rePassword) {
		
		if (password.equals(rePassword)) {
			loginModel.addUser(userMail, password);
			loginView.loginIndex();
		} else {
			loginView.loginFailed("Failed to add User");
		}

	}

}
