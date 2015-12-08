/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * Description: An implementation of the LoginPage state. 
 */
public class LoginPage implements State {
	// member variables
	UserSession session; 
	
	// member functions
	public LoginPage(UserSession session) {
		this.session = session; 
	}
	
	@Override
	public void enterLoginInfo() {
		System.out.println("Login info has been input; checking for correctness.");
		session.setState(session.getCheckLoginInfo());
	}

	@Override
	public void loginInfoError() {
		System.out.println("Login info has not yet been input.");
	}

	@Override
	public void logout() {
		System.out.println("Not logged into Facebook.");
	}

	@Override
	public void showHomePage() {
		System.out.println("Not logged into Facebook.");
	}

	@Override
	public void editSettings() {
		System.out.println("Not logged into Facebook.");
	}

	@Override
	public void viewProfile() {
		System.out.println("Not logged into Facebook.");
	}

	@Override
	public void viewMessenger() {
		System.out.println("Not logged into Facebook.");
	}
}
