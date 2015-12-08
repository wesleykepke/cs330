/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * Description: This file is used to test Mark's state pattern.   
 */
public class TestUserSession {
	public static void main(String[] args) {
		UserSession session = new UserSession();
		session.enterLoginInfo(); 
		session.showHomePage();
		session.editSettings();
		session.viewProfile(); // should not work
		session.showHomePage(); 
		session.viewProfile();
		session.logout(); // should not work
		session.showHomePage();
		session.logout(); 
	}
}