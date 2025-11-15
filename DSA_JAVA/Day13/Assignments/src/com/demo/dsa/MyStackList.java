package com.demo.dsa;

public class MyStackList {

	Node top;

	class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}

	}

	public MyStackList() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int val) {

		Node newNode = new Node(val);
		if (!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println("Pushed " + val);
	}

	public void pop() {
		Node temp = top;
		if (!isEmpty()) {
			top = temp.next;
			temp.next = null;
			System.out.println("Popped " + temp.data);
		} else {
			System.out.println("Stack is Empty");
		}
	}
	public void displayStack() {
		if(!isEmpty()) 
		{
			Node current = top;
			System.out.println("My Stack ->");
			while(current!=null) {
				System.out.println("|"+current.data+"|");
				current = current.next;
			}
		}
		else {
			System.out.println("Stack is Empty");
		}
		
	}

}
