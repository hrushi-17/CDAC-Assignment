package com.demo.stacks;

public class MyQueueList {
	Node rear;
	Node front;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		 
	}
	public MyQueueList() {
		rear = null;
		front = null;
	}
	
	public boolean isEmpty() {
		return rear==null && front==null;
	}
	
	public void enQueue(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			front=newNode;
		}else {
			rear.next = newNode;
		}
		rear = newNode;
		System.out.println("Added Num" + val);
	}
	
	public int deQueue() {
		if(!isEmpty()) {
			Node temp = front;
			front = front.next;
			if(front == null) {
				rear = null;
			}
			temp.next = null;
			return temp.data;
		}else {
			System.out.println("Queue is Empty");
			return -1;
		}	
	}
}
