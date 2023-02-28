package com.mailapplication.Inbox;

import java.util.List;

import com.mailapplication.dto.MailContent;

public interface InboxControlerViewCallBack {

	void validateMail(String receiveMailId);

	void setMailId(String userMail);

	void continueCheck(String option);

	int getInbox(String userMail);

	List<MailContent> getReceivedMail(String userMail);

	void setInbox(String userMail);

}
