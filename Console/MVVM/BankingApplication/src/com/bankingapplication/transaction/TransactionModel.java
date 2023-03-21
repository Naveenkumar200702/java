package com.bankingapplication.transaction;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import com.bankingapplication.Repository.Repository;
import com.bankingapplication.dto.AccountInfo;
import com.bankingapplication.dto.TransactionHistory;
import com.bankingapplication.dto.UserInfo;
import com.bankingapplication.encryption.UserEncryption;

public class TransactionModel extends UserEncryption {

	
	private TransactionView transactionView;
	private long customerId;

	public TransactionModel(TransactionView transactionView) {
		this.transactionView=transactionView;
	}

	public boolean getFlag(long customerId) {
		return Repository.getInstance().getFlag(customerId);
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getCustomerId() {
		return customerId;
	}

// -------------------ADDING ACCOUNT INFO-----------------------

	public void addAccountInfo(long customerId, String accountType, String strPin, String strRePin) {
		if (strPin.equals(strRePin)) {
			addAccountInfo(customerId, accountType, strPin);
		} else {
			transactionView.pinErrorMessage("Password Mis-Match");
		}
	}
	
	public void addAccountInfo(long customerId, String accountType, String strPin) {
		Map<Integer, String> encrypt = encrypt(strPin);
		int key = 0;
		String enPin = "";
		for (Map.Entry val : encrypt.entrySet()) {
			key = (int) val.getKey();
			enPin = (String) val.getValue();
		}
		Repository.getInstance().addAccountInfo(customerId, accountType, key, enPin);
	}

// -----------------------------------Getting User Info------------------------------------------------

	public void getMyInfo() {
		Map<UserInfo, AccountInfo> myInfo = Repository.getInstance().getMyInfo(customerId);
		transactionView.showMyInfo(myInfo);
	}

// -------------------------------WithDraw Amount-----------------------------------

	public boolean withdraw(double amount) {
		AccountInfo info = Repository.getInstance().getAccountDetail(customerId);
		addTransactionHistory(info, amount, "debit", info.getAccountNumber(), info.getAccountNumber());
		if (info.getBalance() > amount) {
			String pin = transactionView.getPin();
			if (checkPin(pin)) {
				info.setBalance(info.getBalance() - amount);
				return true;
			}
		}
		return false;
	}

// ---------------------------ADD TRANSACTION HISTORY-------------------------
	private void addTransactionHistory(AccountInfo info, double amount, String option, long sender, long receiver) {
		List<TransactionHistory> history = info.getTransactionDetail();
		history.add(
				new TransactionHistory(customerId, amount, option, sender, receiver, LocalDate.now(), LocalTime.now()));
		info.setTransactionDetail(history);
	}

	public boolean checkPin(String pin) {
		String userPin = Repository.getInstance().getPin(customerId);
		if (pin.equals(userPin)) {
			return true;
		}
		return false;
	}

	// ------------------------------Deposite Amount--------------------------

	

	public double showBalance() {
		AccountInfo info = Repository.getInstance().getAccountDetail(customerId);
		return info.getBalance();
	}

	public boolean checkBalance(double transferAmount) {
		AccountInfo info = Repository.getInstance().getAccountDetail(customerId);
		if (info.getBalance() >= transferAmount) {
			return true;
		}
		return false;
	}

// --------------------------Transfer Amount----------------------------------------
	public void checkBalanceForTransfer(double transferAmount) {// for bank transfer
		if (checkBalance(transferAmount)) {
			long transferAccount = transactionView.getTransferAccount();
			if (transferAmount(transferAccount, transferAmount)) {
				transactionView.successMessage("Transfered Succesfully");
			} else {
				transactionView.failureMessage("Unable to transfer");
			}
		} else {
			transactionView.failureMessage("Low Balance");
		}
	}

	public boolean transferAmount(long transferAccount, double transferAmount) {

		AccountInfo senderAccount = Repository.getInstance().getAccountDetail(customerId);
		AccountInfo receiverAccount = Repository.getInstance().getTransferAccount(transferAccount);
		if (receiverAccount == null) {
			transactionView.errorMessage("Please Enter a Valid Account No.");
		}
		addTransactionHistory(senderAccount, transferAmount, "debit", senderAccount.getAccountNumber(),
				receiverAccount.getAccountNumber());
		addTransactionHistory(receiverAccount, transferAmount, "credit", senderAccount.getAccountNumber(),
				receiverAccount.getAccountNumber());
		receiverAccount.setBalance(receiverAccount.getBalance() + transferAmount);
		senderAccount.setBalance(senderAccount.getBalance() - transferAmount);
		return true;
	}

	

//=======================================for loan request==========================================================

	public void loanRequest(double loanAmount, double salary) {
		Repository.getInstance().loanRequest(loanAmount, salary, customerId);
	}

	public boolean getAsked(long customerId) {
		return Repository.getInstance().getAsked(customerId);
	}

	public boolean getApproval(long customerId) {
		return Repository.getInstance().getApproval(customerId);
	}

	public boolean getRequest(long customerId) {
		return Repository.getInstance().getRequest(customerId);
	}

	public void setAsked(boolean b, long customerId) {
		Repository.getInstance().setAsked(b, customerId);
	}
	
	public void continueCheck(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			transactionView.transactionIndex(getCustomerId());
		} else {
			transactionView.exitMethod();
		}
	}
	
//===================transaction history==========================
	public void getTransactionHistory() {
		List<TransactionHistory> history = Repository.getInstance().getTransactionHistory(customerId);
		if (history.size() == 0) {
			transactionView.errorMessage("No available Transaction Details");
		} else {
			transactionView.showHistory(history);
		}

	}
// =======================deposits amount============================
	public void depositeAmount(double depositeAmount) {
		if (deposite(depositeAmount)) {
			transactionView.successMessage("Deposited Succesfully");
		} else {
			transactionView.failureMessage("Unable to Deposit");
		}
	}
	
	public boolean deposite(double depositeAmount) {
		AccountInfo info = Repository.getInstance().getAccountDetail(customerId);
		String pin = transactionView.getPin();
		if (checkPin(pin)) {
			info.setBalance(info.getBalance() + depositeAmount);
			addTransactionHistory(info, depositeAmount, "credit", info.getAccountNumber(), info.getAccountNumber());
			return true;
		}
		return false;
	}

}
