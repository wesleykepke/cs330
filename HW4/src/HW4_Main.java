/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * 
 * Main driver for HW 4. 
 */
import java.util.ArrayList;
import java.util.Iterator;

public class HW4_Main {
	public static void main(String[] args) {
		// variables
		BinaryTree tree = new BinaryTree();
		ArrayList<String> words = new ArrayList<String>();
		
		// add strings to the tree
		tree.insert("balls");
		tree.insert("star");
		tree.insert("ruffles");
		tree.insert("candies");
		tree.insert("balls");
		
		// add strings to the vector of words
		words.add("balls");
		words.add("star");
		words.add("ruffles");
		words.add("candies");
		words.add("balls");
		
		// use java's built in iterator to display the strings in our ArrayList
		Iterator<String> ArrayListItr = words.iterator();
		String str;
		System.out.println("Displaying strings from vector:\n"
				+ "(will not output in same order as balanced tree:");
		while (ArrayListItr.hasNext()) {
			str = (String) ArrayListItr.next(); 
			System.out.println(str);
		}
	
		// declare a binary tree iterator and use it to get nodes
		// from the tree
		BinaryTreeIterator btItr = new BinaryTreeIterator(tree);
		Node node;
		System.out.println("\nDisplaying strings from balanced binary tree:");
		while (btItr.hasNext()) {
			node = (Node) btItr.next();
			System.out.println(node.getDescription());
		}
	}
}