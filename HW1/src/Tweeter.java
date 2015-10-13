/*
This is the implementation of the "Tweeter" class, which is going to be
an observable object.

Please read:
	Each "Tweeter" object contains two attributes: "userName" (String) and 
"usersTweets" (Vector<String>). When a "Tweeter" posts a new tweet,
that tweet is first stored in "usersTweets" and is then sent to 
all of the observers via the "newTweetCreated()" method below.
	Also, please note that this class extends the "Observable"
class, which is built-in to the Java programming language.  
*/
import java.util.Observable;
import java.util.Vector;
import java.util.Enumeration; 
public class Tweeter extends Observable {
	// object attributes
	String userName; 
	Vector<String> usersTweets; 
	
	// object methods
	public Tweeter(String personName) {
		userName = personName;
		usersTweets = new Vector<String>(); 
	}
	
	public void newTweetCreated() {
		setChanged(); 
		notifyObservers(); 
	}
	
	public void createTweet(String newTweet) {
		usersTweets.add(newTweet);
		newTweetCreated(); 
	}
	
	public void listAllTweets() {
		Enumeration<String> tweets = usersTweets.elements(); 
		System.out.println(userName + "'s tweets:");
		while (tweets.hasMoreElements()) {
			String individualTweet = tweets.nextElement();
			System.out.println(individualTweet); 
		}
	}
	
	public String getName() {
		return userName; 
	}
	
	public Vector<String> getUsersTweets() {
		return usersTweets;
	}
}