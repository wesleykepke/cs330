/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns) 
 * 
 * Description: HW3 stack class.
 */
public class Stack {
	// class members
	private int[] contents;
	private int top = 0;
	
	// class functions
	public Stack(int maxSize) {
		contents = new int[maxSize]; 		
	}
	
	public int getSize() {
		return top; 
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public int pop() {
		return contents[--top];
	}
	
	public void push(int value) {
		contents[top++] = value; 
	}
}