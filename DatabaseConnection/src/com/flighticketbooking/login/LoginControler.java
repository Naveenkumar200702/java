package com.flighticketbooking.login;


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
		} 
		else if(option==2)
		{
			loginView.userLogin();
		}
		else if(option==3){
			loginView.addUser();
		}
	}

	public void adminLogin(String userName, String password) {
		loginModel.adminLoginCheck(userName, password);
	}

	public void loginSuccesfully(String userName) {
		loginView.loginSuccesfully(userName);
	}

	public void userLogin(String userName, String password) {
		loginModel.userLoginCheck(userName, password);
	}

	public void loginFailed(String errorMessage) {
		loginView.loginFailed(errorMessage);
		
	}

	public void newUser(String userMail, String password) {
		loginModel.addUser(userMail,password);
		
	}

	public void adminLoginSuccesfully(String userName) {
		loginView.adminLoginSuccesfully(userName);
		
	}

}
