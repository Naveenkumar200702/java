package com.coursemanagement.login;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.coursemanagement.Repository.Repository;

public class LoginModel implements LoginModelCallBack{

	private LoginControlerModelCallBack loginControler;
	private String id="";
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public LoginModel(LoginControler loginControler) {
		this.loginControler=loginControler;
	}

	@Override
	public boolean checkAdminInfo(String userId, String password) {
		return Repository.getInstance().checkAdminInfo(userId,password);
	}

	@Override
	public boolean checkStudentInfo(String userId, String password) {
		return Repository.getInstance().checkStudentInfo(userId,password);
	}

	@Override
	public boolean checkTraineInfo(String userId, String password) {
		return Repository.getInstance().checkTraineInfo(userId,password);
	}

	@Override
	public void addStudentDetail(String name, String email, LocalDate dob, String clgName, String graduationYear,
			String intrests) {
		String[] intrestArr=intrests.split(",");
		List<String> intrest=new ArrayList(Arrays.asList(intrestArr));
		String id=Repository.getInstance().addStudentDetail(name,email,dob,clgName,graduationYear,intrest);
		this.id=id;
	}
	@Override
	public String getPassword(String id) {
		return Repository.getInstance().getPassword(id);
	}
	@Override
	public boolean setPassword(String loginId, String password) {	
		return Repository.getInstance().setPassword(loginId,password);
	}
	@Override
	public boolean checkFirstTimeLogin(String userId) {
		return Repository.getInstance().getFirstTimeLoginFlag(userId);
	}
	@Override
	public String getFirstTimePassword(String userId) {
		return Repository.getInstance().getFirstTimeLoginPassword(userId);
	}
	@Override
	public void setTrainePassword(String userId, String rePassword) {
		Repository.getInstance().setTrainePassword(userId,rePassword);
	}
	
}
