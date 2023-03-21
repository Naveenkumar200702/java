package com.mailapplication.Inbox;

import java.util.List;

import com.mailapplication.dto.MailContent;

public class InboxControler implements InboxControlerModelCallBack, InboxControlerViewCallBack {

	private InboxViewCallBack inboxView;
	private InboxModelCallBack inboxModel;

	public InboxControler(InboxView inboxView) {
		this.inboxView = inboxView;
		inboxModel = new InboxModel(this);
	}

	@Override
	public void validateMail(String receiveMailId) {
		if (inboxModel.validateMail(receiveMailId)) {
			String content = inboxView.getContent();
			boolean flag = inboxModel.sendMail(receiveMailId, content);
			if (flag)
				inboxView.message("Mail Send Succesfully");
			else
				inboxView.errorMessage("Unable to send mail due to Network error");
		} else {
			inboxView.invalidMail("Enter a valid mail");
		}
	}

	@Override
	public void setMailId(String userMail) {
		inboxModel.setMailId(userMail);
	}

	@Override
	public void continueCheck(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			inboxView.inboxIndex((String) inboxModel.getMailId());
		} else {
			inboxView.exitMethod();
		}
	}

	@Override
	public int getInbox(String userMail) {
		return inboxModel.getInboxCount(userMail);
	}

	@Override
	public List<MailContent> getReceivedMail(String userMail) {
		return inboxModel.getReceivedMail(userMail);
	}

	@Override
	public void setInbox(String userMail) {
		inboxModel.setInbox(userMail);

	}

}
