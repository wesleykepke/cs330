/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns)
 * 
 * Description: 
 * HW3, Assignment 1
 * Write an adapter to adapt queue to stack. 
 */
public class QueueAdapter extends Stack {
	// class members
	Queue queue; 
		
	// class functions
	public QueueAdapter(Queue queue) {
		/*
		 * Since I can't modify the Stack class (provided in the homework) but 
		 * I need to use Stack's constructor, I'm using the "super" command
		 * and giving a default size of 0 (since this number doesn't really 
		 * matter.  
		 */
		super(0);	
		this.queue = queue;
	}
	
	public int getSize() {
		return queue.Size();
	}
	
	public boolean isEmpty() {
		return queue.Empty();
	}
	
	public int pop() {
		return queue.Dequeue();
	}
	
	public void push(int value) {
		queue.Enqueue(value);
	}
}