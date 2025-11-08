package com.demo.test;

import com.demo.stacks.MyStackList;

public class TestMyStackList {

	public static void main(String[] args) {
		
		MyStackList slist = new MyStackList();
		
		slist.push(10);
		slist.push(20);
		slist.push(30);
		slist.push(40);
		slist.push(50);
		slist.push(60);
		
		System.out.println(slist.pop());
		System.out.println(slist.pop());
		System.out.println(slist.pop());
		System.out.println(slist.pop());
		System.out.println(slist.pop());
		System.out.println(slist.pop());
		System.out.println(slist.pop());//Stack is empty

	}

}
