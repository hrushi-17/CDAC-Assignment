package com.demo.test;

import com.demo.stacks.MyStackArray;

public class TestMyStackArray {

	public static void main(String[] args) {
		MyStackArray ob = new MyStackArray(5);
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		ob.push(50);
		ob.push(60);//Stack is full
		
		System.out.println("--------------------------------------");
		
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());//Stack is Empty
		
		

	}

}
