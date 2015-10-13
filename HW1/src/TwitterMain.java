/*
Name: Wesley Kepke
Class: CS 330 (Design Patterns)
Homework: #1 (Twitter)
Due Date: September 16, 2015

This is the main file for the implementation of the Twitter exercise
involving the observer (and observable) design pattern. 
*/
public class TwitterMain {
	public static void main(String[] args) {
		// create two "Tweeter" objects
		Tweeter wesley = new Tweeter("Wesley Kepke");
		Tweeter ernest = new Tweeter("Ernest Landrito");
		ernest.createTweet("I'm Ernest!");
		wesley.createTweet("I'm Wesley!");
		
		// create a "Follower" object - make it follow two "Tweeters" 
		Follower kyle = new Follower(wesley, "Kyle Lee");
		wesley.createTweet("Whoah, Kyle is following me!"); 
		ernest.addObserver(kyle);
		ernest.createTweet("Kyle's following me too!");
		
		// create another "Follower" object - make it follow "wesley"
		Follower renee = new Follower(wesley, "Renee Iinuma");
		wesley.createTweet("I see Renee Iinuma is now following me too.");
		
		// create a "TweeterAndFollower" object - let's see what it can do.. 
		TweeterAndFollower quinn = new TweeterAndFollower("Quinn Jonas");
		quinn.addObserver(kyle); 
		quinn.createTweet("I'm Quinn Jonas!");
		ernest.addObserver(quinn); // at this point, "quinn" is both a "Follower" and a "Tweeter"
		ernest.createTweet("Quinn?");
		ernest.deleteObserver(kyle); // at this point, "quinn" is the only observer for "ernest"
		ernest.createTweet("Kyle's not following me anymore.. :("); 
	}
}