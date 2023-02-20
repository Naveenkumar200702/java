package com.librarymanagement.managebooks;

import java.util.HashSet;

public class ManageBooksControler extends ManageBooksControlerCallBack implements ManageBooksModelControlerCallBack {

	private ManageBooksViewCallBack manageBooksView;
	private ManageBooksModelCallBack manageBooksModel;

	ManageBooksControler(ManageBooksView manageBooksView) {
		this.manageBooksView = manageBooksView;
		manageBooksModel = new ManageBooksModel(this);
	}

	public void givenOption(int option) {
		if (option == 1) {
			manageBooksView.getBookName();
		} else if (option == 2) {
			manageBooksModel.showBooks();
		} else if (option == 3) {
			manageBooksView.exitMethod();
		}
	}

	public void addBookName(String bookName) {
		manageBooksModel.addBookName(bookName);
	}

	public void bookAdded(String message) {
		manageBooksView.bookAdded(message);

	}

	public void duplicateBook(String message) {
		manageBooksView.duplicateBook(message);
	}

	public void showBooks(HashSet<String> bookNames) {
		manageBooksView.showBooks(bookNames);
	}
}
