package com.librarymanagement.setuplibrary;

public abstract class SetupLibraryViewCallBack {
	abstract void checkLibrary();
	abstract void libraryFound(String libraryName);
	abstract void libraryNotFound(String errorMessage);
	
}
