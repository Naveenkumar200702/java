package com.contactmanagement.searchedit;

import com.contactmanagement.dto.Contacts;
import com.contactmanagement.repository.Repository;

public class SearchEditViewModel {

	SearchEditView view;
	public SearchEditViewModel(SearchEditView searchEditView) {
		this.view=searchEditView;
	}
	public void getUser(String userName, String name) {
		Contacts contact=Repository.getInstance().getUser(userName,name);
		if(contact==null)
		{
			view.errorMessage("Unable to find Contact");
		}
		else {
			String value=view.getEditedField();
			boolean flag=Repository.getInstance().editContact(userName,name,value);
			if(flag)
			{
				view.showMessage("Editted succesfully");
			}
			else {
				view.errorMessage("Unable to edit");
			}
		}	
	}
	public void searchContact(String userName, String info) {
		Contacts searchContact=Repository.getInstance().getUser(userName, info);
		if(searchContact==null)
		{
			view.errorMessage("unable to find contact");
		}
		else {
			view.showContact(searchContact);
		}
		
	}
	

}
