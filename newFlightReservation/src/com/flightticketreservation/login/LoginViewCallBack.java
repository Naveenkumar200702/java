package com.flightticketreservation.login;

public interface LoginViewCallBack {

	void userCredentials();

	void addNewUser();

	void loginSuccess(String string);

	void loginFailure(String string);

	void callIndex();

	void exitMethod();

	void successMessage(String string);

	void failureMessage(String string);

	void callBooking(String userName);

	void callCancelModule(String userName);

	void callAdmin();

	void adminCredentials();

}
