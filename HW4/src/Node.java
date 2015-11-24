/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * 
 * Object: Node
 */
public class Node {
	// object members
	Node left;
	Node right;
	String decoration;
	
	// object methods
	public Node() {
		this.left = null;
		this.right = null;
		this.decoration = "";
	}
	
	public Node(Node left, Node right, String decoration) {
		this.left = left;
		this.right = right;
		this.decoration = decoration;
	}
	
	public String getDescription() {
		return this.decoration;
	}
}
