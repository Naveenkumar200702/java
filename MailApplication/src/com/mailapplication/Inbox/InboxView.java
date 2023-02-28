package com.mailapplication.Inbox;

import java.util.List;
import java.util.Scanner;

import com.mailapplication.dto.MailContent;
import com.mailapplication.login.LoginView;

public class InboxView implements InboxViewCallBack {

	private InboxControlerViewCallBack inboxControler;
	private Scanner input = new Scanner(System.in);

	public InboxView() {
		inboxControler = new InboxControler(this);
	}

	public void inboxIndex(String userMail) {
		inboxControler.setMailId(userMail);
		System.out.println("Welcome --->" + userMail);
		int inboxCount = inboxControler.getInbox(userMail);
		if (inboxCount > 0)
			System.out.println("----> You have - " + inboxCount + " - unread mail");

		System.out.println("Enter 1: Send mail");
		System.out.println("Enter 2: Inbox");
		System.out.println("Enter 3: LogOut");
		String option = input.nextLine();
		switch (Integer.parseInt(option)) {
		case 1:
			sendMail();
			break;
		case 2:
			inbox(userMail);
			break;
		case 3:
			new LoginView().loginIndex();
		default:
			System.out.println("invalid option");
			break;
		}
	}

	private void inbox(String userMail) {
		List<MailContent> mailContent = inboxControler.getReceivedMail(userMail);
		if (mailContent.size() == 0) {
			System.out.println("Inbox is empty");
			checkContinue();
			return;
		}
		for (MailContent val : mailContent) {
			System.out.println("From -->" + val.getFrom());
			System.out.println("To --->" + val.getTo());
			System.out.println("Content ---> " + val.getContent());
			System.out.println("Date ---> " + val.getDate());
			System.out.println("Time ---> " + val.getTime());
		}
		inboxControler.setInbox(userMail);
		checkContinue();

	}

	private void sendMail() {
		System.out.print("Enter the receiver mail id ---> ");
		String receiveMailId = input.nextLine();
		inboxControler.validateMail(receiveMailId);
	}

	@Override
	public String getContent() {
		System.out.println("Enter Body of the Mail Id");
		String content = input.nextLine();
		return content;
	}

	@Override
	public void invalidMail(String string) {
		System.out.println(string);
		sendMail();
	}

	void checkContinue() {
		System.out.print("Do you want to continue? (y/n) -->");
		String option = input.nextLine();
		inboxControler.continueCheck(option);
	}

	@Override
	public void message(String string) {
		System.out.println(string);
		checkContinue();
	}

	@Override
	public void exitMethod() {
		System.out.println("Thanks for Visiting");
	}

	@Override
	public void errorMessage(String string) {
		System.out.println(string);
		checkContinue();
	}
}
