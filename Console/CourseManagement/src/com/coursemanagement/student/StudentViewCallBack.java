package com.coursemanagement.student;

import java.util.List;

import com.coursemanagement.dto.CourseInfo;
import com.coursemanagement.dto.StudentInfo;

public interface StudentViewCallBack {

	void errorMessage(String string);

	void exitMethod(String string);

	void studentIndex(String studentId);

	void printStudentInfo(StudentInfo info);

	void courseMessage(String string);

	void course(List<CourseInfo> course, String string);

	void message(String string);

}
