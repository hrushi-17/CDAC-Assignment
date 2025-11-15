package com.demo.test;

import java.util.Scanner;

import com.demo.dsa.MyStackArray;

public class TestMyStackArray {

	public static void main(String[] args) {
		
//		MyStackArray sarr = new MyStackArray(5);
//		sarr.push(10);
//		sarr.push(20);
//		sarr.push(30);
//		sarr.push(40);
//		sarr.push(10);
//		sarr.displayStack();
//		sarr.pop();
//		sarr.pop();
//		sarr.displayStack();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		char[] str =sc.next().toCharArray();
		
		MyStackArray sarr = new MyStackArray(5);
		
		for(int i=0;i<str.length;i++) {
			sarr.push(str[i]);
		}
		
		boolean ispalindrom = true;
		for(int i=0;i<str.length;i++) {
			char popped = (char) sarr.pop();
			if(str[i]!=popped) {
				ispalindrom = false;
				break;
			}
		}
		
		if(ispalindrom) {
			System.out.println("String is palidrom");
		}
		else {
			System.out.println("String is not palidrom");
		}

	}

}
