/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * Description: An implementation of the UserHomePage state. 
 */
public class UserHomePage implements State {
	// member variables
	UserSession session; 
	
	// member functions
	public UserHomePage(UserSession session) {
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
		System.out.println("Logging out.");
		session.setState(session.getLoginPage());
	}

	@Override
	public void showHomePage() {
		System.out.println("Already displaying home page.");
	}

	@Override
	public void editSettings() {
		System.out.println("Loading settings page.");
		session.setState(session.getUserSettings());
	}

	@Override
	public void viewProfile() {
		System.out.println("Loading your profile.");
		session.setState(session.getUserProfile());
	}

	@Override
	public void viewMessenger() {
		System.out.println("Loading messenger.");
		session.setState(session.getMessenger());
	}
}
