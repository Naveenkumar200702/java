package com.librarymanagement.setuplibrary;

public class SetupLibraryModel extends SetupLibraryModelCallBack{
	private SetupLibraryModelControlerCallBack setupLibraryControler;

	SetupLibraryModel(SetupLibraryControler setupLibraryControler) {
		this.setupLibraryControler = setupLibraryControler;
	}

	void validateLibrary(String libraryName, String address) {
		if (libraryName.equals("STC library") && address.equals("STC")) {
			setupLibraryControler.libraryFound(libraryName);
		} else if (libraryName.equals("ZOHO library") && address.equals("ZOHO")) {
			setupLibraryControler.libraryFound(libraryName);
		} else {
			setupLibraryControler.libraryNotFound("Please Enter a valid Address");
		}
	}
}
