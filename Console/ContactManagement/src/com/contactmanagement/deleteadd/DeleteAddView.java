package com.contactmanagement.deleteadd;

import java.util.Scanner;

import com.contactmanagement.login.LoginView;

public class DeleteAddView {
	Scanner input = new Scanner(System.in);
	DeleteAddViewModel view = new DeleteAddViewModel(this);

	public void addContact(String userName) {
		System.out.print("Enter name --> ");
		String name = input.nextLine();
		System.out.print("Enter phoneNo --> ");
		String phoneNo = input.nextLine();
		if (!view.isValidName(name)) {
			System.out.println("The given name already exists. Please enter a new name !");
			checkContinue(userName);
		} else if (!phoneNo.matches("[0-9]{10}")) {
			System.out.println("Enter a valid phoneNo");
			checkContinue(userName);
		}

		System.out.println("Do you want to add Date of birth -->(y/n) ");
		String value = input.nextLine();
		String dob = "";
		if (value.matches("y") || value.matches("Y")) {
			System.out.println("Please enter date of birth (dd/mm/yyyy)");
			dob = input.nextLine();
			if (!dob.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")) {
				System.out.println("Enter a valid date of birth");
				checkContinue(userName);
				return;
			}
		}
		if (view.addContact(userName, name, phoneNo, dob)) {
			System.out.println("Contact Added succesfully ");
			checkContinue(userName);
		} else {
			System.out.println("unable to add contact");
			checkContinue(userName);
		}
		return;
	}

	private void checkContinue(String userName) {
		System.out.print("Do you want to continue --> (y/n) ");
		String option = input.nextLine();
		if (option.matches("[y]*[Y]*[yes]*[YES]*")) {
			LoginView loginView = new LoginView();
			loginView.mainIndex(userName);
		} else {
			System.out.println("thanks for using");
		}

	}

//===============delete contact===========================
	public void deleteContact(String userName) {
		System.out.println("Enter name/phoneNo to delete");
		String name=input.nextLine();
		view.deleteContact(userName,name);
	}

	public void printMessage(String string) {
		System.out.println(string);
		checkContinue(view.getUser_Id());
	}

	public void errorMessage(String string) {
		System.out.println(string);
		checkContinue(view.getUser_Id());
		
	}

}
