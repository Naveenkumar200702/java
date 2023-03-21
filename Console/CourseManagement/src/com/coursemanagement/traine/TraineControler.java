package com.coursemanagement.traine;

import java.util.List;

import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.TrainerCredentials;

public class TraineControler implements TraineControlerModelCallBack, TraineControlerViewCallBack {

	private TraineViewCallBack traineView;
	private TraineModelCallBack traineModel;

	public TraineControler(TraineView traineView) {
		this.traineView = traineView;
		traineModel = new TraineModel(this);
	}

	@Override
	public void showTraineProfile(String userId) {
		TrainerCredentials traineProfile = traineModel.getTraineProfile(userId);
		traineView.printProfile(traineProfile);
	}

	@Override
	public void showAssignedCourse(String userId) {
		List<CourseInfo> assignedCourse = traineModel.getAssignedCourse(userId);
		if (assignedCourse.size() == 0) {
			traineView.errorMessage("No course is allocated", userId);
		} else {
			traineView.showCourses(assignedCourse);
		}
	}

	@Override
	public void continueCheck(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			traineView.traineIndex((String) traineModel.getTraineId());
		} else {
			traineView.exitMethod("Thank you for visition");
		}

	}

	@Override
	public void setUserId(String userId) {
		traineModel.setUserId(userId);

	}

}
