package com.mailapplication.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.mailapplication.dto.MailContent;

public class Repository {

	private List<MailContent> usermail = new ArrayList();
	private static Repository repository;
	private Statement stmt;
	private Connection con;

	private Repository() {
		con = null;
		stmt = null;
	}

	public static Repository getInstance() {
		if (repository == null) {
			repository = new Repository();
			repository.getConnection();
		}
		return repository;
	}

	private void getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/mail";
			String username = "root";
			String password = "asus";
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
		} catch (Exception e) {
			System.out.println("Unable to connect database");
		}
	}

//=================checking mail id is already exist or not====================================
	public boolean checkNewEmail(String emailId) {
		try {
			ResultSet email = stmt.executeQuery("select * from userdetail where mail_id ='" + emailId + "'");
			if (email.next())
				return false;
		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

//===================================adding new mail id==============================
	public boolean addNewUser(String emailId, String password, String firstName, String lastName, LocalDate dob,
			String gender, String phoneNo) {
		try {
			stmt.executeUpdate(
					"insert into userdetail (mail_id,first_name,last_name,dateofbirth,password,gender,phone_no) values ('"
							+ emailId + "','" + firstName + "','" + lastName + "','" + dob + "','" + password + "','"
							+ gender + "','" + phoneNo + "' ) ");
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

//===================validate mail id to send mails=====================
	public boolean validateMail(String mailId, String password) {
		try {
			ResultSet validate = stmt.executeQuery(
					"Select * from userdetail where mail_id='" + mailId + "'&& password='" + password + "'");
			if (validate.next())
				return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

//=====================================validate the receiver mail to send mail========================
	public boolean validateToMail(String receiveMailId) {
		try {
			ResultSet validate = stmt.executeQuery("Select * from userdetail where mail_id='" + receiveMailId + "'");
			if (validate.next())
				return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

//==============================sending mail ====================================
	public boolean sendMail(String mailId, String receiveMail, String content, int inbox) {
		try {
			stmt.executeUpdate("update userdetail set inbox='" + inbox + "' where mail_id='" + receiveMail + "'");
			stmt.executeUpdate("insert into mailhistory values('" + mailId + "','" + receiveMail + "','" + content
					+ "','" + LocalDate.now() + "','" + LocalTime.now() + "')");
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

//=========================get receiver inbox=============================
	public int getInbox(String mailId) {
		try {
			ResultSet rs = stmt.executeQuery("select * from userdetail where mail_id ='" + mailId + "';");
			if (rs.next())
				return rs.getInt(7);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public List<MailContent> getReceivedMail(String userMail) {
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("select * from mailhistory where to_mail='" + userMail + "';");
			while (rs.next()) {
				usermail.add(new MailContent(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usermail;
	}

	public void setInbox(String userMail) {
		try {
			int n = 0;
			stmt.executeUpdate("Update userdetail set inbox=" + n + " where mail_id='" + userMail + "';");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void getOtp(String mailId, String phoneNo, String otp) {
		try {
			stmt.executeUpdate("UPDATE userdetail SET password = '" + otp + "' WHERE mail_id ='" + mailId
					+ "' && phone_no='" + phoneNo + "';");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean setPassword(String mailId, String password) {
		try {
			stmt.executeUpdate("UPDATE userdetail SET password = '" + password + "' WHERE mail_id ='" + mailId + "';");
			return true;
		} catch (Exception e) {
			System.out.println("unable to change password");
		}
		return false;
	}
}
