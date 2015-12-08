/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * Description: The context file for our state pattern.  
 */
public class UserSession {
	// member variables
	State loginPage;
	State checkLoginInfo;
	State userHomePage;
	State userSettings;
	State userProfile;
	State state;
	
	// included for assignment #3
	State messenger;
	
	// constructor
	public UserSession() {
		System.out.println("Creating a Facebook user session.");
		loginPage = new LoginPage(this);
		checkLoginInfo = new CheckLoginInfo(this);
		userHomePage = new UserHomePage(this);
		userSettings = new UserSettings(this);
		userProfile = new UserProfile(this);
		messenger = new Messenger(this);
		state = loginPage; 
	}
	
	// member functions
	public void enterLoginInfo() {
		state.enterLoginInfo(); 
	}
	
	public void loginInfoError() {
		state.loginInfoError(); 
	}
	
	public void logout() {
		state.logout(); 
	}
	
	public void showHomePage() {
		state.showHomePage(); 
	}
	
	public void editSettings() {
		state.editSettings(); 
	}
	
	public void viewProfile() {
		state.viewProfile(); 
	}
	
	// included for assignment #3
	public void viewMessenger() {
		state.viewMessenger(); 
	}
	
	public void setState(State newState) {
		this.state = newState; 
	}
	
	public State getLoginPage() {
		return loginPage; 
	}
	
	public State getCheckLoginInfo() {
		return checkLoginInfo; 
	}
	
	public State getUserHomePage() {
		return userHomePage;
	}
	
	public State getUserSettings() {
		return userSettings;
	}
	
	public State getUserProfile() {
		return userProfile; 
	}
	
	// included for assignment #3
	public State getMessenger() {
		return messenger; 
	}
}
