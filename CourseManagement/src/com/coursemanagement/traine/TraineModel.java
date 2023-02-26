package com.coursemanagement.traine;

import java.util.List;

import com.coursemanagement.Repository.Repository;
import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.TrainerCredentials;

public class TraineModel implements TraineModelCallBack {

	private String traineId;
	private TraineControlerModelCallBack traineControler;
	public TraineModel(TraineControler traineControler) {
		this.traineControler=traineControler;
	}
	@Override
	public TrainerCredentials getTraineProfile(String userId) {
		return Repository.getInstance().getTrainerProfile(userId);
	}
	@Override
	public List<CourseInfo> getAssignedCourse(String userId) {
		return Repository.getInstance().getAssignedCourse(userId);
	}
	@Override
	public void setUserId(String userId) {
		traineId=userId;
		
	}
	public String getTraineId() {
		return traineId;
	}
	

}
