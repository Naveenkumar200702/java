package com.contactmanagement.searchedit;

import java.util.Scanner;

import com.contactmanagement.dto.Contacts;
import com.contactmanagement.login.LoginView;

public class SearchEditView {

	String userName;
	Scanner input = new Scanner(System.in);
	SearchEditViewModel viewModel = new SearchEditViewModel(this);

	public void editContact(String userName) {
		this.userName=userName;
		System.out.print("Enter name no to edit --> ");
		String name = input.nextLine();
		viewModel.getUser(userName, name);
	}

	private void checkContinue() {
		System.out.print("Do you want to continue --> (y/n) ");
		String option = input.nextLine();
		if (option.matches("[y]*[Y]*[yes]*[YES]*")) {
			new LoginView().mainIndex(userName);
		} else {
			System.out.println("thanks for using");
		}
	}

	public void errorMessage(String string) {
		System.out.println(string);
		checkContinue();
	}

	public void searchContact(String userName) {
		this.userName=userName;
		System.out.println("Enter detail to Search a Contact");
		String info = input.nextLine();
		viewModel.searchContact(userName, info);
	}

	public void showContact(Contacts searchContact) {
		System.out.println("----------------------------------------");
		System.out.println("name --> " + searchContact.getCname());
		System.out.println("phoneNo --> " + searchContact.getPhoneNo());
		if (searchContact.getDob().length() != 0) {
			System.out.println("dob --> " + searchContact.getDob());
		}
		checkContinue();
		return;
	}

	public String getEditedField() {
		System.out.println("choose a field to edit");
		System.out.println("Enter 1: name");
		System.out.println("Enter 2: phone NO");
		System.out.println("Enter 3: Date of birth");
		String s=input.nextLine();
		if(s.length()!=1||(!s.matches("[0-9]"))){
			System.out.println("Enter a valid option");
			getEditedField();
		}
		switch (s)
		{
		case "1":
			System.out.println("Enter name --> ");
			String name=input.nextLine();
			if(name.matches("[a-z]*[A-Z]*"))
				return "name,"+name;
			break;
		case "2":
			System.out.println("Enter phone No");
			String phoneNo=input.nextLine();
			if(phoneNo.matches("[0-9]{10}"))
				return "phoneNo,"+phoneNo;
			break;
		case "3": 
			System.out.println("Enter date of birth");
			String dob=input.nextLine();
			if(dob.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}"))
				return "dob,"+dob;
			break;
		default:
			System.out.println("Enter a valid option");
			checkContinue();
		}
		return null;
	}

	public void showMessage(String string) {
		System.out.println(string);
		checkContinue();		
	}
}
