package com.librarymanagement.setuplibrary;

public interface SetupLibraryModelControlerCallBack {
	void libraryFound(String libraryName);
	void libraryNotFound(String errorMessage);
}
