package StackFairTest;

public class Stack {

	char []stack;
	int top;
	
	public Stack(int size) {
		stack=new char[size];
		this.top=-1;
	}
	public void push(char data) {
		stack[++top]=data;
	}
	public char pop() {
		return stack[top--];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
}
