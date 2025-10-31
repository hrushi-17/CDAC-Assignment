package com.demo.test;

import java.util.Arrays;

import com.demo.arrays.My2DArray;

public class TestMy2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My2DArray ob1 = new My2DArray();
		ob1.acceptData();
		ob1.displayData();
		
		My2DArray ob2=new My2DArray();
		//My2DArray ob2=new My2DArray(2,2);
		ob2.acceptData();
		ob1.displayData();
		
//		System.out.println("Sum of Rowwise Array: "+Arrays.toString(ob1.findSumRowWise()));
		int[] rowSum = ob1.findSumRowWise();
		for(int sum: rowSum) {
			System.out.println(sum);
		}
		
		int[] colSum = ob1.findSumColumnWise();
		for(int sum: colSum) {
			System.out.print(sum+"\t");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		
		ob1.rowRotation(true, 1);
		ob1.displayData();
		
		ob1.rowRotation(false, 1);
		ob1.displayData();
		
		ob1.columnRotation(true, 1);
		ob1.displayData();
		
		ob1.columnRotation(false, 1);
		ob1.displayData();
		
		int[][] arr = ob1.transpose();
		displayArray(arr);
		System.out.println("----------------------------------");
		
		
		if(ob1.isSymentric()) {
			System.out.println("Array is Symentric");
		}
		else {
			System.out.println("Array is not Symentric");
		}
		System.out.println("----------------------------------");
		
		if(ob1.isIdentity()) {
			System.out.println("Array is Identitty");
		}
		else {
			System.out.println("Array is not Identitty");
		}
		System.out.println("----------------------------------");
		
		int[][] arr1=ob1.add2DArrays(ob2);
		if(arr1!=null) {
			displayArray(arr1);
		}else {
			System.out.println("dimenssions doesnot match");
		}
		System.out.println("----------------------------------");
		
		int[][] arr2=ob1.subtract2DArrays(ob2);
		if(arr2!=null) {
			displayArray(arr2);
		}else {
			System.out.println("dimenssions doesnot match");
		}
		
	}

	private static void displayArray(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
