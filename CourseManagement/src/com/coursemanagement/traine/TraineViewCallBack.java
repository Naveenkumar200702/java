package com.coursemanagement.traine;

import java.util.List;

import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.TrainerCredentials;

public interface TraineViewCallBack {

	void printProfile(TrainerCredentials traineProfile);

	void errorMessage(String string, String userId);

	void showCourses(List<CourseInfo> assignedCourse);

	void traineIndex(String adminId);

	void exitMethod(String string);

}
