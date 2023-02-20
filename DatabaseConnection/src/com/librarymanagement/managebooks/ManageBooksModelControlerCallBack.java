package com.librarymanagement.managebooks;

import java.util.HashSet;

public interface ManageBooksModelControlerCallBack {
	void bookAdded(String message);

	void duplicateBook(String message);

	void showBooks(HashSet<String> bookNames);
}
