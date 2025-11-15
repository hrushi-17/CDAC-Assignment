package com.demo.test;

import com.demo.dsa.MyStackList;

public class TestMyStackList {

	public static void main(String[] args) {
		MyStackList slist = new MyStackList();
		slist.push(10);
		slist.push(20);
		slist.push(30);
		slist.push(40);
		slist.push(50);
		slist.displayStack();
		
		slist.pop();
		slist.displayStack();
		slist.pop();
		slist.displayStack();

	}

}
