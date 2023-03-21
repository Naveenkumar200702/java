package com.flightticketreservation.login;

public interface LoginControlerViewCallBack {

	void chooseOption(int option);

	void checkUserCredentials(String userName, String password);

	void addNewUser(String userName, String password, String rePassword);

	void checkContinue(String check);

	void chooseBooking(int option);

	void checkAdminCredentials(String userName, String password);

}
