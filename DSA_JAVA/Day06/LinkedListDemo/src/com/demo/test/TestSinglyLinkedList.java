package com.demo.test;

import com.demo.linkedlists.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addNode(12);
		list.addNode(15);
		list.addNode(10);
		list.addNode(6);
		list.addNode(2);
		list.displayData();
		
//		list.addByNum(20, 6);
//		list.displayData();
		
//		list.addByPosition(2, 30);
//		list.displayData();
		
//		list.deleteByValue(10);
//		list.displayData();
		
		list.deleteByPosition(3);
		list.displayData();
		}

}
