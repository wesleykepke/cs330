/*
This is the implementation of the "Follower" class, which is going to be
an observer object.

Please read:
	Each "Follower" object contains three attributes: "followerName" (String),
"myObservable" (Observable), and "followersTweets" 
(Hashtable<String, Vector<String>>). I wanted to make this somewhat realistic,
so each "Follower" contains a Hashtable that helps the "Follower" view all the
tweets from a specific "Tweeter". 
	Also, please note that this class extends the "Observable"
class, which is built-in to the Java programming language.  
*/
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.util.Hashtable;
import java.util.Enumeration;
public class Follower implements Observer {
	// object attributes
	String followerName; 
	Observable myObservable; 
	Hashtable<String, Vector<String>> followersTweets; 
	
	// object methods
	public Follower(Observable observableObject, String personName) {
		followersTweets = new Hashtable<String, Vector<String>>();
		this.myObservable = observableObject;
		this.followerName = personName; 
		observableObject.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		// case for handling a "Tweeter" object
		if (obs instanceof Tweeter) {
			Tweeter incomingTweeter = (Tweeter) obs;
			String incomingTweeterName = incomingTweeter.getName();
			Vector<String> incomingUserTweets = incomingTweeter.getUsersTweets();
			followersTweets.remove(incomingTweeterName);
			this.followersTweets.put(incomingTweeterName, incomingUserTweets);
			display();
		}
		
		// case for handling a "TweeterAndFollower" object
		else if (obs instanceof TweeterAndFollower) {
			TweeterAndFollower incomingTweeter = (TweeterAndFollower) obs;
			String incomingTweeterName = incomingTweeter.getName();
			Vector<String> incomingUserTweets = incomingTweeter.getUsersTweets();
			followersTweets.remove(incomingTweeterName);
			this.followersTweets.put(incomingTweeterName, incomingUserTweets);
			display();
		}
	}
	
	public void display() {
		Enumeration<String> tweeterNames = followersTweets.keys(); 
		Vector<String> tweets;
		String tweeterName;
		while (tweeterNames.hasMoreElements()) {
			tweeterName = tweeterNames.nextElement();
			tweets = followersTweets.get(tweeterName); 
			System.out.println(followerName + " sees these tweets from " + tweeterName + ": " + tweets);
		}
		System.out.println("\n");
	}
}
