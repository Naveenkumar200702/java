package com.bankingapplication.login;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.bankingapplication.Repository.Repository;
import com.bankingapplication.encryption.UserEncryption;

public class LoginModel extends UserEncryption {

	private LoginView loginView ;

	private long customerId;

public LoginModel(LoginView loginView) {
		this.loginView= loginView;
	}

	//======================================verify user credentials=========================================
	public void userVerifyCon(String customerId, String uPassword) {
		if (customerId.matches("[0-9]+")) {
			if (userVerify(customerId, uPassword)) {
				long Id = Long.parseLong(customerId);
				loginView.loginSuccesfull(Id);
			} else {
				loginView.errorMessage("your passWord is Wrong");
			}
		} else {
			loginView.errorMessage("Invalid Customer ID");
		}
	}

	public boolean userVerify(String customerId, String uPassword) {
		HashMap<Integer, String> credential = Repository.getInstance().checkValidUser(customerId, uPassword);
		if (credential.size() == 0) {
			return false;
		} else {
			int key = 0;
			String encrypt = "";
			for (Map.Entry m : credential.entrySet()) {
				key = (int) m.getKey();
				encrypt = (String) m.getValue();
			}
			String password = decrypt(encrypt, key);
			if (password.equals(uPassword)) {

				this.customerId = Long.parseLong(customerId);
				return true;
			}
		}
		return false;
	}

//==================================adding new user==================================
	public void addNewUser(String name, String gender, String phoneNo, String dob, String age, String aadharNo) { // store
		name = name.toLowerCase();
		gender = gender.toLowerCase();
		if (!name.matches("[a-z]+")) {
			loginView.errorMessage("Enter a valid Name");
		} else if (!gender.equals("male") && !(gender.equals("female"))) {
			loginView.errorMessage("Enter a valid input");
		} else if (!phoneNo.matches("[0-9]+") && !(phoneNo.length() == 10)) {
			loginView.errorMessage("Enter a valid PhoneNo");
		} else if (!age.matches("[0-9]+")) {
			loginView.errorMessage("Enter a Valid age");
		} else if (!dob.matches("[0-9/]+")) {
			loginView.errorMessage("Please enter a valid Dob");
		} else if (!aadharNo.matches("[0-9]+") && !(aadharNo.length() == 12)) {
			loginView.errorMessage("Please enter a valid aadhar No");
		} else {
			long phoneNumber = Long.parseLong(phoneNo);
			long aadharNumber = Long.parseLong(aadharNo);
			int ageNumber = Integer.parseInt(age);

			if (addNewUser(name, gender, phoneNumber, dob, ageNumber, aadharNumber)) {
				loginView.AccoutRegistermessage("Succesfully added");
			} else {
				loginView.message("Uable to Add new User");
			}
		}
	}

	public boolean addNewUser(String name, String gender, long phoneNumber, String dob, int ageNumber, // adding new
																										// User
			long aadharNumber) {
		long customerID = System.currentTimeMillis() / 6000;
		this.customerId = customerID;
		String oneTimePassword = generateOneTimePassWord();
		Map<Integer, String> encryptPassword = encrypt(oneTimePassword);
		long accountNo = System.currentTimeMillis();
		return Repository.getInstance().addNewUser(accountNo, customerID, name, gender, phoneNumber, dob, ageNumber,
				aadharNumber, encryptPassword);
	}

//=================================method to generate one time password====================
	private String generateOneTimePassWord() {
		UUID uuid = UUID.randomUUID();
		String value = uuid.toString().replace("-", "");
		String password = value.substring(value.length() - 8);
		return password;
	}

//=======================method to get customer id================================

	public long getCustomerId() {
		return customerId;
	}

//=======================method to get one time password==========================

	public String getOneTimePassword(long customerId) {
		Map<Integer, String> password = Repository.getInstance().getOneTimePassword(customerId);
		int key = 0;
		String ePassword = "";
		for (Map.Entry value : password.entrySet()) {
			key = (int) value.getKey();
			ePassword = (String) value.getValue();
		}
		String dPassword = decrypt(ePassword, key);
		return dPassword;
	}

//==================adding new password==============================

	public boolean addPassWord(long customerId, String password) {
		return Repository.getInstance().addUserCredentials(customerId, password);
	}

//================================validate first time login==============================

	public void validateFirstTimeLogin(long customerId, String password, long firstcustomerId, String firstpassword) {
		if (customerId == firstcustomerId) {
			if (password.equals(firstpassword)) {
				loginView.newPassword(customerId);
			}
		} else {
			loginView.firstTimeLoginError("Please check your customerId");
		}
	}

//==============================validate normal signup========================

	public void validatePassword(long customerId, String password, String rePassword) {
		if (password.equals(rePassword)) {
			if (addPassWord(customerId, password)) {
				loginView.passwordResetMessage("User name and password added succesfully");
			}
		} else {
			loginView.firstTimeLogin();
		}
	}
// =============================Check do you Want to continue============================

	public void continueCheck(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			loginView.loginIndex();
		} else {
			loginView.exitMethod();
		}
	}

}
