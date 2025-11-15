package com.demo.dsa;

import java.util.Arrays;

public class MyStackArray {

	private int[] arr;
	private int top;
	
	public MyStackArray() {
		this.arr = new int[10];
		this.top = -1;
	}

	
	public MyStackArray(int size) {
		arr = new int[size];
		this.top = -1;
	}


	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==arr.length-1;
	}
	
	public void push(int num) {
		
		if(!isFull()) {
			top++;
			arr[top]=num;
//			System.out.println("Pushed: "+num);
		}
		else {
			System.out.println("Stack is full");
		}
		
	}
	
	public int pop() {
		if(!isEmpty()) {
			int num = arr[top];
			top--;
//			System.out.println("Popped: "+ num);
			return num;
		}else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	public void displayStack() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			for(int i = top ; i>=0; i--) {
				System.out.println("| "+arr[i]+" |"); 
			}
		}
	}
	
	
}
