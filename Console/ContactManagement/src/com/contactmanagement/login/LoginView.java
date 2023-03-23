package com.contactmanagement.login;

import java.util.Scanner;

import com.contactmanagement.deleteadd.DeleteAddView;
import com.contactmanagement.searchedit.SearchEditView;

public class LoginView {
	private Scanner input=new Scanner(System.in);
	LoginViewModel loginModel=new LoginViewModel(this);
	public static void main(String[] args)
	{
		LoginView loginView=new LoginView();
		loginView.loginIndex();
	}
	private void loginIndex()
	{
		System.out.println("Contacts Management ");
		System.out.println("Enter 1 : Login");
		System.out.println("Enter 2 : SignUp");
		System.out.println("Enter 3: exit");
		String s=input.nextLine();
		if(s.length()!=1||(!s.matches("[0-9]"))){
			System.out.println("Enter a valid option");
			loginIndex();
		}
		else {
			switch(s)
			{
			case "1" :
				login();
				break;
			case "2":
				signUp();
				break;
			case "0":
				System.out.println("Come back again...");
				break;
			default:
				System.out.println("Enter a valid option");
				loginIndex();
			}
		}
	
	}

	private void signUp() {
		System.out.println("Welcome to Contacts");
		System.out.println("Enter userName -->");
		String userName = input.nextLine();
		if(!loginModel.isValidUser(userName))
		{
			System.out.println("Enter password --> ");
			String password=input.nextLine();
			System.out.println("Enter phoneNo --> ");
			String phoneNo=input.nextLine();
			loginModel.addUser(userName,password,phoneNo);
		}
		else {
			System.out.println("user name already Exists");
			loginIndex();
		}
	}
	private void login() {
		System.out.print("Enter user Name --> ");
		String userName=input.nextLine();
		System.out.print(" Enter password --> ");
		String password=input.nextLine();
		loginModel.checkUser(userName,password);
	}
	public void mainIndex(String userName) {
		System.out.println("Welcome " + userName);
		System.out.println("Enter 1: Add a contact");
		System.out.println("Enter 2: Edit a contact");
		System.out.println("Enter 3: Search Contact");
		System.out.println("Enter 4: Delete Contact");
		System.out.println("Enter 0: Log out");
		String option=input.nextLine();
		if(option.length()!=1||(!option.matches("[0-9]"))){
			System.out.println("Enter a valid option");
			mainIndex(userName);
		}
		DeleteAddView addView=new DeleteAddView();
		SearchEditView editView=new SearchEditView();
		switch(option)
		{
		case "1":
			addView.addContact(userName);
			break;
		case "2":
			editView.editContact(userName);
			break;
		case "3":
			editView.searchContact(userName);
			break;
		case "4":
			addView.deleteContact(userName);
			break;
		case "0":
			loginIndex();
			break;
		default :
			System.out.println("Enter a valid option");
			mainIndex(userName);
		}	
	}
	public void errorMessage(String string) {
		System.out.println(string);
		checkContinue();
	}
	
	private void checkContinue() {
		System.out.print("Do you want to continue --> (y/n) ");
		String option = input.nextLine();
		if (option.matches("[y]*[Y]*[yes]*[YES]*")) {
			loginIndex();
		} else {
			System.out.println("thanks for using");
		}
	}
	public void printMessage(String string) {
		System.out.println(string);
		checkContinue();
	}

}
