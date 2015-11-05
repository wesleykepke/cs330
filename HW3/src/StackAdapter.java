/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * 
 * Description: 
 * HW3, Assignment 1
 * Write an adapter to adapt stack to queue (don't worry about  
 * preserving order). 
 */
public class StackAdapter implements QueueInterface {
	// data members
	Stack stack;
	
	// class functions
	public StackAdapter(Stack stack) {
		this.stack = stack; 
	}
	
	public int Size() {
		return stack.getSize(); 
	}
	
	public boolean Empty() {
		return stack.isEmpty();
	}
	
	public void Enqueue(int value) {
		stack.push(value);
	}
	
	public int Dequeue() {
		return stack.pop();
	}
}