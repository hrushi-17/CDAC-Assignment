package com.demo.stacks;

public class MyStackArray {
	
	private int[] arr;
	private int top;
	
	public MyStackArray() {
		super();
		arr = new int[10];
		top=-1;
	}
	
	public MyStackArray(int size) {
		super();
		arr = new int[size];
		top=-1;
	}
	
	public void push(int num) {
		if(!isFull()) {
			top++;
			arr[top]=num;
			System.out.println("Pushed: "+num);
		}
		else {
			System.out.println("Stack is Full");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int num = arr[top];
			top--;
			System.out.println("Popped: "+num);
			return num;
		}
		else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == arr.length-1;
	}
	

}
