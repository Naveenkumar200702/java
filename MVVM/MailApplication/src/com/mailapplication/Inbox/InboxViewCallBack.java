package com.mailapplication.Inbox;

public interface InboxViewCallBack {

	String getContent();

	void invalidMail(String string);

	void message(String string);

	void inboxIndex(String MailId);

	void exitMethod();

	void errorMessage(String string);

}
