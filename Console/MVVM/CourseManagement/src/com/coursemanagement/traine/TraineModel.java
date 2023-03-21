package com.coursemanagement.traine;

import java.util.List;

import com.coursemanagement.Repository.Repository;
import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.TrainerCredentials;

public class TraineModel {

	private TraineView traineView;

	public TraineModel(TraineView traineView) {
		this.traineView = traineView;
	}

	private String traineId;

	public void setUserId(String userId) {
		traineId = userId;
	}

	public String getTraineId() {
		return traineId;
	}

	public void showTraineProfile(String userId) {
		TrainerCredentials traineProfile = Repository.getInstance().getTrainerProfile(userId);
		traineView.printProfile(traineProfile);
	}

	public void showAssignedCourse(String userId) {
		List<CourseInfo> assignedCourse = Repository.getInstance().getAssignedCourse(userId);
		if (assignedCourse.size() == 0) {
			traineView.errorMessage("No course is allocated", userId);
		} else {
			traineView.showCourses(assignedCourse);
		}
	}

	public void continueCheck(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			traineView.traineIndex((String) getTraineId());
		} else {
			traineView.exitMethod("Thank you for visition");
		}

	}

}
