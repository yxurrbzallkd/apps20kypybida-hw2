package ua.edu.ucu.collections;

public class Stack {
	private ImmutableLinkedList stack;

	public Stack(){
		this.stack = new ImmutableLinkedList();
	}
    public Object peek(){
		//Returns the object from the top of the Stack without removing it
		//Returns null if stack is empty
		if (this.stack.isEmpty()){
			return null;
		}
		return this.stack.getLast();
	}
	public Object pop(){
		//Removes and returns the object from the top of the Stack
		Object top = this.stack.getLast();
		this.stack = this.stack.removeLast();
		return top;
	}
	public void push(Object e){
		//Adds an object to the the top of the Stack
		this.stack = this.stack.addLast(e);
	}
	public String toString(){
		return "Stack "+this.stack.toString()+" < TOP";
	}
}
