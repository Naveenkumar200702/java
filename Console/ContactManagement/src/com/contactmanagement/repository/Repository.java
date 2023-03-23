package com.contactmanagement.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.contactmanagement.dto.Contacts;

public class Repository {
	Connection con;
	Statement stmt;

	private Repository() {

	}

	static Repository repository = null;

	public static Repository getInstance() {
		if (repository == null) {
			repository = new Repository();
			repository.getConnection();
		}
		return repository;
	}

	private void getConnection() {
		try {
			String address = "jdbc:mysql://localhost:3306/contact";
			String userName = "root";
			String password = "asus";
			con = DriverManager.getConnection(address, userName, password);
			stmt = con.createStatement();
		} catch (Exception e) {
			System.out.println("unable to connect database");
		}
	}

	public boolean checkUser(String userName, String password) {
		String SELECT_STATEMENT = "SELECT * FROM credential WHERE user_name = '" + userName + "'AND password = '"
				+ password + "';";
		try {
			ResultSet set = stmt.executeQuery(SELECT_STATEMENT);
			if (!set.next())
				return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean isExistingName(String name) {
		String SELECT_STATEMENT = "SELECT * FROM userdetail WHERE user_id = '" + name + "';";
		try {
			ResultSet set = stmt.executeQuery(SELECT_STATEMENT);
			if (!set.next())
				return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean addContact(String userName, String name, String phoneNo, String dob) {
		String UPDATE_SATEMENT = "INSERT INTO userdetail (user_id,cname,phoneNo,dob) values('" + userName + "' ,'"
				+ name + "','" + phoneNo + "','" + dob + "');";
		try {
			stmt.executeUpdate(UPDATE_SATEMENT);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteContact(String userName, String name) {
		String SELECT_STATEMENT = "select * from userdetail where user_id = '" + userName + "' and cname= '" + name
				+ "'or phoneNo ='" + name + "' or PhoneNo1 ='" + name + "';";
		try {
			ResultSet set = stmt.executeQuery(SELECT_STATEMENT);
			if (set.next()) {
				String DELETE_CONTACT = "delete from userdetail where user_id ='" + userName + "' and cname= '" + name
						+ "'or phoneNo = '" + name + "'or PhoneNo1 = '" + name + "';";
				stmt.executeUpdate(DELETE_CONTACT);
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean isValidUser(String userName) {
		String SELECT_STATEMENT = "SELECT * FROM credential WHERE user_name='" + userName + "';";
		try {
			ResultSet set = stmt.executeQuery(SELECT_STATEMENT);
			if (set.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean addNewUser(String userName, String password, String phoneNo) {
		String SELECT_STATEMENT = "INSERT INTO credential values ('" + userName + "','" + password + "','" + phoneNo
				+ "');";
		try {
			stmt.executeUpdate(SELECT_STATEMENT);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Contacts getUser(String userName, String info) {
		String SELECT_STATEMENT="SELECT * FROM userdetail WHERE user_id ='"+userName+"'and cname ='"+info+"';";
		Contacts contact=null;
		try {
			ResultSet set=stmt.executeQuery(SELECT_STATEMENT);
			if(!set.next())
				return contact;
			contact=new Contacts();
			contact.setUserName(userName);
			contact.setCname(set.getString("cname"));
			contact.setPhoneNo(set.getString("phoneNo"));
			contact.setDob(set.getString("dob"));
			contact.setPhoneNo1(set.getString("phoneNo1"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return contact;
	}

	public boolean editContact(String userName, String name, String value) {
		String UPDATE_STATEMENT="";
		String[] arr=value.split(",");
		if(arr[0].equals("name"))
			UPDATE_STATEMENT="UPDATE userdetail SET cname='" + arr[1] + "' where user_id ='"+userName+"' and cname='"+name+"';";
		else if(arr[0].equals("phoneNo"))
			UPDATE_STATEMENT = "UPDATE userdetail SET phoneNo='" + arr[1] + "' where user_id ='"+userName+"' and cname='"+name+"';";
		else if(arr[0].equals("dob"))
			UPDATE_STATEMENT = "UPDATE userdetail SET dob='" + arr[1] + "' where user_id ='"+userName+"' and cname='"+name+"';";
		try {
			stmt.executeUpdate(UPDATE_STATEMENT);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
