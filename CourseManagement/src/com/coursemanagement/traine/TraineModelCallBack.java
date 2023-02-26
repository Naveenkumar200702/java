package com.coursemanagement.traine;

import java.util.List;

import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.TrainerCredentials;

public interface TraineModelCallBack {

	TrainerCredentials getTraineProfile(String userId);

	List<CourseInfo> getAssignedCourse(String userId);

	void setUserId(String userId);
	
	String getTraineId();

}
