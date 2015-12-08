/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * Description: An interface for all of the possible actions that can lead to 
 * transitions among states. 
 */
public interface State {
	// the following are required for assignment #1
	public void enterLoginInfo();
	public void loginInfoError();
	public void logout();
	public void showHomePage();
	public void editSettings();
	public void viewProfile();
	
	// included for assignment #3
	public void viewMessenger(); 
}