package ua.edu.ucu.collections;

public class Queue {
	private ImmutableLinkedList queue;

	public Queue(){
		this.queue = new ImmutableLinkedList();
	}
	public Object peek() {
		///Returns the object at the beginning of the Queue without removing it
		//Returns null if queue is empty
		if (this.queue.isEmpty()){
			return null;
		}
		return this.queue.get(0);
	}
	public Object dequeue(){
		//Removes and returns the object at the beginning of the Queue.
		Object head = this.queue.getFirst();
		this.queue = this.queue.removeFirst();
		return head;
	}
	public void enqueue(Object e){
		//Adds an object to the end of the Queue.
		this.queue = this.queue.addLast(e);
	}
	public String toString(){
		return "Queue"+" HEAD > "+this.queue.toString();
	}
}
