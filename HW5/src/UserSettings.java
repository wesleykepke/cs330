/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * Description: An implementation of the UserSettings state. 
 */
public class UserSettings implements State {
	// member variables
	UserSession session; 
	
	// member functions
	public UserSettings(UserSession session) {
		this.session = session; 
	}
	
	@Override
	public void enterLoginInfo() {
		System.out.println("Already logged in.");
	}

	@Override
	public void loginInfoError() {
		System.out.println("Already logged in; no errors encountered.");
	}

	@Override
	public void logout() {
		System.out.println("Can't logout; not in home page.");
	}

	@Override
	public void showHomePage() {
		System.out.println("Returning to home page.");
		session.setState(session.getUserHomePage());
	}

	@Override
	public void editSettings() {
		System.out.println("Already in settings page.");
	}

	@Override
	public void viewProfile() {
		System.out.println("Can't view profile; not in home page.");
	}

	@Override
	public void viewMessenger() {
		System.out.println("Can't view messenger; not in home page.");
	}
}
