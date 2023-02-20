package com.librarymanagement.setuplibrary;

public class SetupLibraryControler extends SetupLibraryControlerCallBack implements SetupLibraryModelControlerCallBack{
	private SetupLibraryViewCallBack setupLibraryView;
	private SetupLibraryModelCallBack setupLibraryModel;

	SetupLibraryControler(SetupLibraryView setupLibraryView) {
		this.setupLibraryView = setupLibraryView;
		setupLibraryModel = new SetupLibraryModel(this);
	}

	void libraryCheck(String libraryName, String address) {
		setupLibraryModel.validateLibrary(libraryName, address);
	}

	public void libraryFound(String libraryName) {

		setupLibraryView.libraryFound(libraryName);
	}

	public void libraryNotFound(String errorMessage) {
		setupLibraryView.libraryNotFound(errorMessage);
	}

}
