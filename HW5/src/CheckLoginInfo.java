/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * Description: An implementation of the checkLoginPage state. 
 */
public class CheckLoginInfo implements State {
	// member variables
	UserSession session; 
	
	// member functions
	public CheckLoginInfo(UserSession session) {
		this.session = session; 
	}
	
	@Override
	public void enterLoginInfo() {
		System.out.println("Login info has been input; checking for correctness.");
	}

	@Override
	public void loginInfoError() {
		System.out.println("Login info is incorrect; please try again.");
		session.setState(session.getLoginPage());
	}

	@Override
	public void logout() {
		System.out.println("Can't logout; not in home page.");
	}

	@Override
	public void showHomePage() {
		System.out.println("Please wait; loading home page.");
		session.setState(session.getUserHomePage());
	}

	@Override
	public void editSettings() {
		System.out.println("Can't logout; not in home page.");
	}

	@Override
	public void viewProfile() {
		System.out.println("Can't logout; not in home page.");
	}

	@Override
	public void viewMessenger() {
		System.out.println("Can't logout; not in home page.");
	}
}
