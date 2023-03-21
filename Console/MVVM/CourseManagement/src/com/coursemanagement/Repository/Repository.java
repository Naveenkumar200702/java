package com.coursemanagement.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.coursemanagement.dto.*;

public class Repository {

	private static Repository repository = null;

	public static Repository getInstance() {
		if (repository == null) {
			repository = new Repository();
			repository.initialValues();
		}
		return repository;
	}

	String adminId = "AD";
	String studentId = "ST"; // learn inheritance for password safety in dto
	String traineId = "TR";
	String courseID = "CID";
	int adminIdNum = 2;
	int studentIdNum = 2;
	int traineIdNum = 5;
	int courseId = 5;
	private List<AdminCredential> adminInfo = new ArrayList();
	private List<TrainerCredentials> trainerInfo = new ArrayList();
	private List<StudentCredentials> studentInfo = new ArrayList();
	private List<CourseInfo> courseInfo = new ArrayList();
	private List<CourseRegistration> registration = new ArrayList();

//=========================for personal information============================

	void initialValues() {
		// --------------------------adding admin
		// info------------------------------------
		adminInfo.add(new AdminCredential("AD1", "admin", "Admin"));
		// ---------------------------------adding trainer info----------------------
		trainerInfo.add(new TrainerCredentials("TR1", "trainer", "Thamarai san", LocalDate.of(1985, 07, 20), 15,
				"9115174929", "ThamaraiSan@gmail.com", false,
				new ArrayList(Arrays.asList(new String[] { "java", "python", "sql" }))));
		trainerInfo.add(new TrainerCredentials("TR2", "trainer", "Dhana san", LocalDate.of(1990, 07, 20), 8,
				"9115174929", "DhanaSan@gmail.com", false,
				new ArrayList(Arrays.asList(new String[] { "java", "python", "sql" }))));
		trainerInfo.add(new TrainerCredentials("TR3", "trainer", "Mubashir san", LocalDate.of(1986, 07, 20), 10,
				"9115174929", "MubashirSan@gmail.com", false,
				new ArrayList(Arrays.asList(new String[] { "java", "python", "sql" }))));
		trainerInfo.add(new TrainerCredentials("TR4", "trainer", "Abirami san", LocalDate.of(1990, 07, 20), 4,
				"91123174929", "AbiramiSan@gmail.com", false,
				new ArrayList(Arrays.asList(new String[] { "java", "python", "sql" }))));
		// ------------------------adding courses-------------------
		String courseInfo = "This course is about Java fundamentals and teaches you from the veryBasic of java";
		String[] module = { "Introduction", "What is Java?", "What is JRE?", "What is JVM" };
		this.courseInfo.add(new CourseInfo("CID1", "Basic Java", courseInfo, new ArrayList(Arrays.asList(module)),
				LocalDate.parse("2023-02-01"), LocalDate.parse("2023-04-30"), LocalDate.parse("2023-05-02"), "TR1"));
		// **************************************************/
		courseInfo = "This course is about Python fundamentals and teaches you from the veryBasic of java";
		String[] module2 = { "Introduction", "What is Python?", "What is compiler?", "What is datatypes" };
		this.courseInfo.add(new CourseInfo("CID2", "Basic Python", courseInfo, new ArrayList(Arrays.asList(module2)),
				LocalDate.now(), LocalDate.parse("2023-04-30"), LocalDate.parse("2023-05-02"), "TR2"));
		// ***********************************************/
		courseInfo = "This course is about SQL fundamentals and teaches you from the veryBasic of java";
		String[] module3 = { "Introduction", "What is sql?", "What is rdbms?", "What is database?" };
		this.courseInfo.add(new CourseInfo("CID3", "Basic sql", courseInfo, new ArrayList(Arrays.asList(module3)),
				LocalDate.parse("2023-01-10"), LocalDate.parse("2023-04-30"), LocalDate.parse("2023-05-02"), "TR3"));
		// **************************************************/
		courseInfo = "This course is about Java fundamentals and teaches you from the veryBasic of java";
		String[] module4 = { "Introduction", "What is Java?", "What is JRE?", "What is JVM" };
		this.courseInfo.add(new CourseInfo("CID4", "Basic Java", courseInfo, new ArrayList(Arrays.asList(module4)),
				LocalDate.parse("2023-04-25"), LocalDate.parse("2023-05-30"), LocalDate.parse("2023-06-02"), "TR4"));
		// -------------------------------creating student
		// info---------------------------------------
		String[] arr = { "java", "Python", "sql" };
		studentInfo.add(new StudentCredentials("ST1", "naveen", "naveen@gmail.com", LocalDate.of(2002, 07, 20), "stc",
				2022, new ArrayList(Arrays.asList(arr)), "naveen"));
	}

//=========================check AdminInfo==================
	public boolean checkAdminInfo(String userId, String password) {
		for (AdminCredential val : adminInfo) {
			if ((val.getUserName().equals(userId)) && val.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

//===============================check Student info===========================
	public boolean checkStudentInfo(String userId, String password) {
		for (StudentCredentials val : studentInfo) {
			if ((val.getUserId().equals(userId)) && val.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

//=========================check Trainee info=======================
	public boolean checkTraineInfo(String userId, String password) {
		for (TrainerCredentials val : trainerInfo) {
			if ((val.getUserId().equals(userId)) && val.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

//========================================Adding new Student=====================================	
	public String addStudentDetail(String name, String email, LocalDate dob, String clgName, String graduationYear,
			List<String> intrests) {

		String Id = studentId + name + studentIdNum;
		studentIdNum++;
		String password = generatePassword();
		int passedOut = Integer.parseInt(graduationYear);
		studentInfo.add(new StudentCredentials(Id, name, email, dob, clgName, passedOut, intrests, password));
		return Id;
	}

	public String getPassword(String id) {
		for (StudentCredentials val : studentInfo) {
			if (val.getUserId().equals(id)) {
				return val.getPassword();
			}
		}
		return "";
	}

	public boolean setPassword(String loginId, String password) {
		for (StudentCredentials val : studentInfo) {
			if (val.getUserId().equals(loginId)) {
				val.setPassword(password);
				return true;
			}
		}
		return false;
	}

//=================================Adding new Admin=============================================
	public String addAmin(String name, String password) {
		String adminName = adminId + name + adminIdNum;
		adminIdNum++;
		adminInfo.add(new AdminCredential(adminName, password, name));
		return adminName;
	}

// ===================================================adding new Trainee=====================================
	public String addTrainee(String traineName, LocalDate date, String experience, String phoneNo, String emailId,
			ArrayList<String> subjects) {
		String traineUserId = traineId + traineName + traineIdNum;
		traineIdNum++;
		String password = generatePassword();
		trainerInfo.add(new TrainerCredentials(traineUserId, password, traineName, date, Integer.parseInt(experience),
				phoneNo, emailId, true, subjects));
		return traineUserId;
	}

	// ==================================generate
	// password==================================
	String generatePassword() {
		UUID uuid = UUID.randomUUID();
		String value = uuid.toString().replace("-", "");
		String password = value.substring(value.length() - 8);
		return password;
	}

//===========================adding new course========================================
	public boolean addCourse(String courseName, String courseInfo, ArrayList courseModules, LocalDate startDate,
			LocalDate endDate, LocalDate examDate, String traineeId) {

		this.courseInfo.add(new CourseInfo(courseID + courseId, courseName, courseInfo, courseModules, startDate,
				endDate, examDate, traineeId));
		courseId++;
		return true;
	}

	public List<CourseInfo> getCourseInfo() {
		return courseInfo;
	}

	public boolean deleteCourse(String courseId2) {
		int count = 0;
		for (CourseInfo val : courseInfo) {
			if (val.getCourseId().equals(courseId2)) {
				courseInfo.remove(count);
				return true;
			}
			count++;
		}
		return false;
	}

//==========================getting student info================================
	public StudentInfo getStudentInfo(String userId) {
		for (StudentInfo val : studentInfo) {
			if (val.getUserId().equals(userId))
				return val;
		}
		return null;
	}

//============================getting  ongoing course=============================
	public List<CourseInfo> getOngoingCourse() {
		List<CourseInfo> onGoingCourse = new ArrayList();
		for (CourseInfo val : courseInfo) {
			if (val.getStartingDate().isBefore(LocalDate.now())) {
				onGoingCourse.add(val);
			}
		}
		return onGoingCourse;
	}

//=============================getting upcomming course===========================

	public List<CourseInfo> getUpCommingCourse() {
		List<CourseInfo> upCommingCourse = new ArrayList();
		for (CourseInfo val : courseInfo) {
			if (val.getStartingDate().isAfter(LocalDate.now())) {
				upCommingCourse.add(val);
			}
		}
		return upCommingCourse;
	}

	public boolean registerCourse(String courseId2, String studentId2) {
		for (CourseInfo val : courseInfo) {
			if (val.getCourseId().equals(courseId2)) {
				registration.add(new CourseRegistration(val.getCourseName(), courseId2, studentId2, LocalDate.now(),
						LocalTime.now()));
				return true;
			}
		}
		return false;
	}

// ===========================	get registered course==================================
	public List<CourseRegistration> getRegisteredCourse(String userId) {
		List<CourseRegistration> registeredCourse = new ArrayList();
		for (CourseRegistration val : registration) {
			if (val.getStudentId().equals(userId)) {
				registeredCourse.add(val);
			}
		}
		return registeredCourse;
	}

	public List<TrainerCredentials> getTrainerInfo() {
		return trainerInfo;
	}

//=============================check first time login for Treinee======================
	public boolean getFirstTimeLoginFlag(String userId) {
		for (TrainerCredentials val : trainerInfo) {
			if (val.getUserId().equals(userId)) {
				return val.getNotification();
			}
		}
		return false;
	}

//====================getting first time login password======================
	public String getFirstTimeLoginPassword(String userId) {
		String password = "";
		for (TrainerCredentials val : trainerInfo) {
			if (val.getUserId().equals(userId)) {
				password = val.getPassword();
				break;
			}
		}
		return password;
	}

//========================setting first time password=======================
	public void setTrainePassword(String userId, String rePassword) {
		for (TrainerCredentials val : trainerInfo) {
			if (val.getUserId().equals(userId)) {
				val.setPassword(rePassword);
				val.setNotification(false);
			}
		}
	}

	public TrainerCredentials getTrainerProfile(String userId) {
		for (TrainerCredentials val : trainerInfo) {
			if (val.getUserId().equals(userId)) {
				return val;
			}
		}
		return null;
	}

	public List<CourseInfo> getAssignedCourse(String userId) {
		List<CourseInfo> assignedCourse = new ArrayList();
		for (CourseInfo val : courseInfo) {
			if (val.getAllocatedIncharge().equals(userId)) {
				assignedCourse.add(val);
			}
		}
		return assignedCourse;
	}
}
