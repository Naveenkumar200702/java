package com.coursemanagement.Admin;

import java.util.List;

import com.coursemanagement.dto.TrainerCredentials;

public interface AdminViewCallBack {

	void message(String string);

	void exitMethod(String string);

	void adminIndex(String adminId);

	void errorMessage(String string);

	void showTrainerInfo(List<TrainerCredentials> trainerInfo);

	void chooseTrainers(List<TrainerCredentials> trainerInfo);

}
