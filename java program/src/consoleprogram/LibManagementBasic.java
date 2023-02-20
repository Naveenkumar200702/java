package consoleprogram;
import java.util.*;
public class LibManagementBasic {
	private Scanner scanner = new Scanner(System.in);

	static public void main(String[] args) {
		LibManagementBasic libManagement = new LibManagementBasic();
		libManagement.checkForLogin();
	}

	private void checkForLogin() {
		System.out.println("Welcome to Library Management System\n ------------------------");
		System.out.println("Enter User Name");
		String userName = scanner.next();
		System.out.println("Enter password");
		String password = scanner.next();
		if (checkCredentials(userName, password)) {
			System.out.println("\n-->Welcome " + userName + "<--\n");
			System.out.println("Thanks for Login.");
		} else {
			System.out.println("\nInvalid Credentials. Please try again!\n");
			checkForLogin();
		}
	}

	private boolean checkCredentials(String userName, String password) {
		//boolean canLogin = false;
		if (userName.equals("admin") && password.equals("ZSGS")) {
			return true;
		} else if (userName.equals("bala") && password.equals("ZSGS")) {
			return true;
		}
		return false;
	}
}
