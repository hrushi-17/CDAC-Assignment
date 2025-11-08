package com.demo.test;

import com.demo.stacks.MyStackListGeneric;

public class TestMyStackListGeneric {

	public static void main(String[] args) {
		
		MyStackListGeneric<Integer> slist = new MyStackListGeneric<>();
		
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
