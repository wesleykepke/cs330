/*
 * Name: Wesley Kepke
 * Class: CS 330 (Design Patterns) 
 * 
 * Description: HW3 queue interface. 
 */
public interface QueueInterface {
	public int Size();
	public boolean Empty();
	public void Enqueue(int value);
	public int Dequeue(); 
}