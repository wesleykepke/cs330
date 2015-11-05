/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns) 
 * 
 * Description: HW3 queue class.
 */
public class Queue {
	// class members
	private int[] contents;
	private int tail; 
	
	// class functions
	public Queue(int maxSize) {
		contents = new int[maxSize];
		tail = 0; 
	}
	
	public int Size() {
		return tail; 
	}
	
	public boolean Empty() {
		return (tail == 0);
	}
	
	public void Enqueue(int value) {
		contents[tail++] = value; 
	}
	
	public int Dequeue() {
		int removedVal = contents[tail - 1];
		for (int i = 1; i < tail; i++) {
			contents[i - 1] = contents[i];
		}
		tail--;
		return removedVal; 
	}
}