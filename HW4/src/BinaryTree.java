/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * 
 * Object: BinaryTree
 */
public class BinaryTree {
	// object members
	Node root;
	
	// object methods
	public BinaryTree() {
		this.root = null; 
	}
	
	public void insert(String description) {
		root = insertHelper(root, description);
	}
	
	public int getNumberOfNodes(Node node) {
		// bottom out in the tree, return 0 (no  more nodes)
		if (node == null) {
			return 0; 
		}
		
		// determine the number of nodes in the tree 
		int numLeftNodes = getNumberOfNodes(node.left);
		int numRightNodes = getNumberOfNodes(node.right);
		return (1 + numLeftNodes + numRightNodes); 
	}
	
	private Node insertHelper(Node node, String description) {
		// found where to place node in tree
		if (node == null) {
			return new Node(null, null, description);
		}

		else {
			// determine the number of nodes in the left and right subtrees
			int numLeftNodes = getNumberOfNodes(node.left);
			int numRightNodes = getNumberOfNodes(node.right);
			
			// add node to left subtree
			if (numLeftNodes <= numRightNodes) {
				node.left = insertHelper(node.left, description);
			} else { // add node to right subtree
				node.right = insertHelper(node.right, description);
			}
		}
		
		return node;
	}
}
