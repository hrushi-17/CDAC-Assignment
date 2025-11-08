package com.demo.test;

import com.demo.lists.DoublyLinkedList;

public class TestDoublyLinkedList {
	
	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.addNode(20);
		dlist.addNode(2);
		dlist.addNode(50);
		dlist.addNode(6);
		dlist.addNode(66);
		dlist.displayData();
		
		dlist.addByPosition(2, 10);
		dlist.displayData();
		
		dlist.addByValue(30, 6);
		dlist.displayData();
		
		dlist.deleteByPosition(2);
		dlist.displayData();
		
		dlist.deleteByValue(30);
		dlist.displayData();
		
		
	}
}
