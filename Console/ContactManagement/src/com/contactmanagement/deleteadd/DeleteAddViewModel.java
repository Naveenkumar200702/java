package com.contactmanagement.deleteadd;

import com.contactmanagement.repository.Repository;

public class DeleteAddViewModel {
	String user_Id="";
	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	DeleteAddView deleteView=null;
	public DeleteAddViewModel(DeleteAddView deleteAddView) {
		this.deleteView=deleteAddView;
	}

	public boolean isValidName(String name) {
		return Repository.getInstance().isExistingName(name);
	}

	public boolean addContact(String userName, String name, String phoneNo, String dob) {
		return Repository.getInstance().addContact(userName,name,phoneNo,dob);	
	}

	public void deleteContact(String userName, String name) {
		if(Repository.getInstance().deleteContact(userName,name))
		{
			deleteView.printMessage("Contact Deleted succesfully");
		}else {
			deleteView.errorMessage("Unable to Delete Contact");
		}
	}

}
