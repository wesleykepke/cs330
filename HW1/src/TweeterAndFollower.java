/*
This is the implementation of the "TweeterAndFollower" class, which is going 
to be both an observable object and observer object.

Please read:
	Each "TweeterAndFollower" object contains three attributes: "myName" 
(String), "myTweets" (Vector<String>), and "tweetsFromPeopleIFollow" 
(Hashtable<String, Vector<String>>). I wanted to make this somewhat realistic,
so each "TweeterAndFollower" contains a Hashtable that helps the "Follower" 
view all the tweets from a specific "Tweeter". Moreover, each "TweeterAndFollower"
contains a Vector that contains each of their own tweets.  
	Also, please note that this class extends the "Observable" class and implements
the Observer interface, both of which are built-in to the Java programming language.  
*/
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.util.Hashtable;
import java.util.Enumeration;

public class TweeterAndFollower extends Observable implements Observer {
	// object attributes
	String myName; 
	Vector<String> myTweets;
	Hashtable<String, Vector<String>> tweetsFromPeopleIFollow;    
	
	// object methods
	public TweeterAndFollower(String personName) {
		this.myName = personName;
		tweetsFromPeopleIFollow = new Hashtable<String, Vector<String>>();
		myTweets = new Vector<String>();
	}
	
	// observable methods
	public void newTweetCreated() {
		setChanged();
		notifyObservers(); 
	}
	
	public void createTweet(String newTweet) {
		myTweets.add(newTweet);
		newTweetCreated();  
	}
	
	public void listAllTweets() {
		Enumeration<String> tweets = myTweets.elements(); 
		System.out.println(myName + "'s tweets:");
		while (tweets.hasMoreElements()) {
			String individualTweet = tweets.nextElement();
			System.out.println(individualTweet); 
		}
	}
	
	public String getName() {
		return myName; 
	}
	
	public Vector<String> getUsersTweets() {
		return myTweets;
	}
	
	// observer methods
	public void update(Observable obs, Object arg) {
		if (obs instanceof Tweeter) {
			Tweeter incomingTweeter = (Tweeter) obs;
			String incomingTweeterName = incomingTweeter.getName();
			Vector<String> incomingUserTweets = incomingTweeter.getUsersTweets();
			tweetsFromPeopleIFollow.remove(incomingTweeterName);
			this.tweetsFromPeopleIFollow.put(incomingTweeterName, incomingUserTweets);
			display();
		}
	}
	
	public void display() {
		Enumeration<String> tweeterNames = tweetsFromPeopleIFollow.keys(); 
		Vector<String> tweets;
		String tweeterName;
		while (tweeterNames.hasMoreElements()) {
			tweeterName = tweeterNames.nextElement();
			tweets = tweetsFromPeopleIFollow.get(tweeterName); 
			System.out.println(myName + " sees these tweets from " + tweeterName + ": " + tweets);
		}
	}
}
