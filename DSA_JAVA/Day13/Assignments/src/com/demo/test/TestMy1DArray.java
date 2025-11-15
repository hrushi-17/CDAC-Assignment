package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.dsa.My1DArray;

public class TestMy1DArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		My1DArray dis = new My1DArray(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		 for(int i = 0; i<arr.length; i++) {
			 arr[i] = sc.nextInt();
		 }
		 dis.displayArray(arr);
		 	
	}

}
