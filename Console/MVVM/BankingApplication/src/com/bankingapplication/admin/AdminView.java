package com.bankingapplication.admin;

import java.util.List;
import java.util.Scanner;

import com.bankingapplication.dto.LoanRequest;
import com.bankingapplication.login.LoginView;

public class AdminView {
	private AdminModel adminModel;
	
	public AdminView() {
		adminModel=new AdminModel(this);
	}

	private Scanner input = new Scanner(System.in);

	public void adminIndex() {
		System.out.print("Enter Admin Name --->");
		String adminName = input.nextLine();
		System.out.print("Enter Password -->");
		String password = input.nextLine();
		adminModel.checkCredentials(adminName, password);
	}

	public void adminMenu() {
		int loanRequest = adminModel.getLoanRequest();
		if (loanRequest > 0) {
			System.out.println("\t\t---> You Have " + loanRequest + " loan request");
		}
		System.out.println("Enter 1: Add Admin -->");
		System.out.println("Enter 2: Loan Request");
		System.out.println("Enter 3: Log out --->");
		char value = input.next().charAt(0);
		input.nextLine();
		int option = Character.getNumericValue(value);
		switch (option) {
		case 1:
			System.out.print("Enter admin Name --->");
			String adminName = input.nextLine();
			System.out.print("Enter password --->");
			String aPassword = input.nextLine();
			adminModel.addNewAdmin(adminName, aPassword);
			break;
		case 2:
			System.out.println("loans Requests are");
			approveLoanRequest(loanRequest);
			break;
		case 3:
			new LoginView().loginIndex();
			break;
		default:
			System.out.println("Enter a valid option");
			adminMenu();
		}
	}

	private void approveLoanRequest(int loanRequest) {
		List<LoanRequest> list = adminModel.getAccountLoan();
		for (LoanRequest val : list) {
			if (val.isLoanRequest() == true) {
				System.out.printf("%15s| %15s| %15s |%n", "customerId", "Salary", "Loan Amount");
				System.out.printf("| %15d| %15.2f |%15.2f |%n", val.getCustomerId(), val.getCustomerSalary(),
						val.getLoanAmount());
				System.out.println("===============-==============");
				System.out.print("Enter Id to proceed -->");
				double id = input.nextDouble();
				System.out.print("Enter approve(true/false) --->");
				boolean check = input.nextBoolean();
				adminModel.validateAccount(id, check);
			}
		}
		input.nextLine();
		continueCheck();

	}

	public void continueCheck() {
		System.out.print("Do you want to continue? (y/n) -->");
		String option = input.nextLine();
		adminModel.continueCheck(option);
	}

	public void loginSuccesfull(String string) {
		System.out.println(string);
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-");
		adminMenu();
	}

	public void loginFailure(String erroeMessage) {
		System.out.println(erroeMessage);
		System.out.println("--------------");
		continueCheck();
	}

	public void exitMethod() {
		System.out.println("Thanks for visiting");
	}

	public void errorMessage(String string) {
		System.out.println(string);
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-");
		continueCheck();
	}

}
