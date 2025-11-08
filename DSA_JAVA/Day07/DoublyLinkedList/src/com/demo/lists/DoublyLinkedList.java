package com.demo.lists;

public class DoublyLinkedList {
	Node head;

	class Node {
		int data;
		Node prev, next;

		public Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}

	public DoublyLinkedList() {
		head = null;
	}
	
	public void addByValue(int val, int num) {
		Node newNode = new Node(val);
		Node temp = head;
		while(temp!=null && temp.data!=num) {
			temp = temp.next;
		}
		if(temp!=null) {
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
			if(newNode.next!=null) {
				newNode.next.prev=newNode;
			}
		}
		else {
			System.out.println(num+" not found");
		}
	}

	public void addByPosition(int pos, int val) {
		Node newNode = new Node(val);
		if(pos == 1) {
			newNode.next = head;
			if(head != null) 
				head.prev = newNode;
			head = newNode;
		}else {
			Node temp = head;
			for(int i =1; temp!= null && i<pos-2; i++) {
				temp= temp.next;
			}
			if(temp!= null) {
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;
				if(newNode.next!= null ) {
					newNode.next.prev = newNode;
				}else {
					System.out.println(pos+ "Beyond the limit");
				}
			}
			else {
				System.out.println(pos+" not found");
			}
		}
	}
	
	//delete by value
		public void deleteByValue(int val) {
			Node temp=head;
			//delete from the head
			if(head.data==val) {
				head=temp.next;
				temp.next=null;
			}else {
				Node prev=null;
				while(temp!=null && temp.data!=val) {
					prev=temp;
					temp=temp.next;
				}
				//value found
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println(val + " not found");
				}
			}
		}
		
		//delete By position
		public void deleteByPosition(int pos) {
			Node temp=head;
			//delete from the head
			if(pos==1) {
				head=temp.next;
				temp.next=null;
			}else {
				Node prev=null;
				for(int i=0;temp!=null && i<pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println(pos+ " is beyond the limit");
				}
			}
			
		}
	
	public void addNode(int val) {
		Node newNode = new Node(val);
		//if list is empty add at the head
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			//place temp at the last node
			while (temp.next != null) {
				temp = temp.next;
			}
			newNode.prev = temp;
			temp.next = newNode;
		}

	}
	
	public void displayData() {
		
		Node temp = head;
		while(temp!= null) {
			System.out.print(temp.data + "--->");
			temp = temp.next;
		}
		System.out.print("Null");
		System.out.println();
	}
	
}
