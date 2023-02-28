package com.mailapplication.Inbox;

import java.util.List;

import com.mailapplication.Repository.Repository;
import com.mailapplication.dto.MailContent;

public class InboxModel implements InboxModelCallBack {

	private InboxControlerModelCallBack sendReceiveControler;
	private String mailId;

	public InboxModel(InboxControler sendReceiveControler) {
		this.sendReceiveControler = sendReceiveControler;
	}

	public String getMailId() {
		return mailId;
	}

	@Override
	public boolean validateMail(String receiveMailId) {
		return Repository.getInstance().validateToMail(receiveMailId);
	}

	@Override
	public void setMailId(String userMail) {
		this.mailId = userMail;
	}

	@Override
	public boolean sendMail(String receiveMail, String content) {
		int inbox = Repository.getInstance().getInbox(receiveMail);
		return Repository.getInstance().sendMail(mailId, receiveMail, content, inbox + 1);
	}

	@Override
	public int getInboxCount(String userMail) {
		return Repository.getInstance().getInbox(userMail);
	}

	@Override
	public List<MailContent> getReceivedMail(String userMail) {
		return Repository.getInstance().getReceivedMail(userMail);
	}

	@Override
	public void setInbox(String userMail) {
		Repository.getInstance().setInbox(userMail);

	}

}
