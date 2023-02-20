package com.librarymanagement.managebooks;

import java.util.*;

public class ManageBooksModel extends ManageBooksModelCallBack {

	private ManageBooksModelControlerCallBack manageBooksControler;
	private HashSet<String> bookNames = new HashSet<String>();

	ManageBooksModel(ManageBooksControler manageBooksControler) {
		this.manageBooksControler = manageBooksControler;
	}

	public void addBookName(String bookName) {
		if (bookNames.add(bookName)) {
			manageBooksControler.bookAdded("One Book Added to the Library..");
		} else {
			manageBooksControler.duplicateBook("The book is already in out Library..");
		}
	}

	public void showBooks() {
		manageBooksControler.showBooks(bookNames);
	}
}
