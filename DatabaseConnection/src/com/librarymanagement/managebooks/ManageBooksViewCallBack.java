package com.librarymanagement.managebooks;

import java.util.HashSet;

public abstract class ManageBooksViewCallBack {
	abstract void manageBooksIndex();
	abstract void getBookName();
	abstract void bookAdded(String message);
	abstract void duplicateBook(String message);
	abstract void showBooks(HashSet<String> bookNames);
	abstract void exitMethod();	
}
