package com.librarymanagement.managebooks;

import java.util.*;

public class ManageBooksView extends ManageBooksViewCallBack {
	private Scanner input = new Scanner(System.in);
	private ManageBooksControlerCallBack manageBooksControler;

	public ManageBooksView() {
		manageBooksControler = new ManageBooksControler(this);
	}

	public void manageBooksIndex() {
		System.out.println("1. Add Books");
		System.out.println("2. Show Books");
		System.out.println("3. exit");
		int option = input.nextInt();
		manageBooksControler.givenOption(option);
	}

	public void getBookName() {
		System.out.println("Enter a Book Name to Add");
		String bookName = input.nextLine();
		manageBooksControler.addBookName(bookName);
		
	}

	public void bookAdded(String message) {
		System.out.println(message);
		manageBooksIndex();
	}

	public void duplicateBook(String message) {
		System.out.println(message);
		manageBooksIndex();
	}

	public void showBooks(HashSet<String> bookNames) {
		int index = 1;
		System.out.println("The available books are..");
		for (String bookName : bookNames) {
			System.out.println(index + ". " + bookName);
			index++;
		}
		System.out.println("*************");
		manageBooksIndex();
	}

	public void exitMethod() {
		System.out.println("Thank you for visiting...");
	}

}
