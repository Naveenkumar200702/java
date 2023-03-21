package com.bankingapplication.admin;

import java.util.List;
import java.util.Map;

import com.bankingapplication.Repository.Repository;
import com.bankingapplication.dto.AdminCredentials;
import com.bankingapplication.dto.LoanRequest;
import com.bankingapplication.encryption.UserEncryption;

public class AdminModel extends UserEncryption {

	private AdminView adminView ;

	public AdminModel(AdminView adminView) {
		this.adminView=adminView;
	}

	public void checkCredentials(String adminName, String password) {
		AdminCredentials credential = Repository.getInstance().getAdminCredentials(adminName, password);
		if (credential == null) {
			adminView.errorMessage("Enter a Valid userName");
		}
		String checkPassword = decrypt(credential.getPassWord(), credential.getKey());
		if (password.equals(checkPassword)) {
			adminView.loginSuccesfull("Login Succesfull");
			return;
		}
		adminView.loginFailure("Enter a valid credential");
		return;
	}

//=========================adding new user===================
	public void addNewAdmin(String adminName, String aPassword) {
		if (addNewUser(adminName, aPassword)) {
			adminView.loginSuccesfull("New Admin added Succesfully");
		} else {
			adminView.loginFailure("Unable to Add new Admin");
		}
	}

	public boolean addNewUser(String adminName, String aPassword) {
		Map<Integer, String> password = encrypt(aPassword);
		int key = 0;
		String passWord = "";
		for (Map.Entry set : password.entrySet()) {
			key = (int) set.getKey();
			passWord = (String) set.getValue();
		}
		return Repository.getInstance().addNewAdmin(adminName, passWord, key);
	}

//=========================================loan Request======================================

	public int getLoanRequest() {
		return Repository.getInstance().getLoanRequest();
	}

	public List<LoanRequest> getAccountLoan() {
		return Repository.getInstance().getLoanApproval();
	}

	public void validateAccount(double id, boolean check) {
		Repository.getInstance().validateLoan(id, check);
	}

	public void errorMessage(String string) {
		adminView.errorMessage(string);

	}

	public void continueCheck(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			adminView.adminMenu();
		} else {
			adminView.exitMethod();
		}
	}

}
