package com.mailapplication.Inbox;

import java.util.List;

import com.mailapplication.dto.MailContent;

public interface InboxModelCallBack {

	boolean validateMail(String receiveMailId);

	void setMailId(String userMail);

	boolean sendMail(String receiveMailId, String content);

	Object getMailId();

	int getInboxCount(String userMail);

	List<MailContent> getReceivedMail(String userMail);

	void setInbox(String userMail);

}
