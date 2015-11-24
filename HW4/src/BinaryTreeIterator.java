/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * 
 * Object: BinaryTreeIterator
 */
import java.util.Stack;
import java.util.Iterator;

public class BinaryTreeIterator implements Iterator {
	// object members
	BinaryTree bTree;
	Stack<Node> nodesInTree;
	
	// object methods
	public BinaryTreeIterator(BinaryTree bTree) {
		// variables
		Node temp; 
		
		// data members
		this.bTree = bTree;
		temp = bTree.root;
		this.nodesInTree = new Stack<Node>();
		
		// traverse as far left as possible and add nodes to stack
		while (temp != null) {
			nodesInTree.push(temp);
			temp = temp.left; 
		}
	}
	
	public Object next() {
		// check to see if there are more nodes in the stack
		if (hasNext()) {
			// pop a node from the stack
			Node nodeToReturn = nodesInTree.pop();
			Node temp = nodeToReturn; 
			
			// if there are nodes to the right, we must add them to the stack
			if (temp.right != null) {
				temp = temp.right;
				while (temp != null) {
					nodesInTree.push(temp);
					temp = temp.left; 
				}
			}
			
			// return the appropriate node
			return nodeToReturn; 
		}
		
		// no next element 
		return null; 
	}
	
	public boolean hasNext() {
		if (nodesInTree.isEmpty()) {
			return false; 
		}
		
		else return true; 
	}
	
	public void remove() {
		// not needed for this assignment
	}
}
