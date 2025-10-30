package com.demo.test;

import java.util.stream.IntStream;

import com.demo.arrays.MyArray;

public class TestArray {

	public static void main(String[] args) {
		MyArray ob = new MyArray();
		
		System.out.println("Capacity: "+ ob.getCapacity());
		ob.add(7);
		ob.add(14);
		ob.add(21);
		ob.add(28);
		System.out.println(ob);
		ob.addAtPos(8, 2);
		System.out.println(ob);
//		ob.cout();
		System.out.println("Value to be search at index : "+ ob.searchByValue(28));		
		ob.deleteByPos(2);
		System.out.println(ob);
		ob.deleteByValue(28);
		System.out.println("After deleting value: "+ob);
		System.out.println("Maximum in the Array is: " +ob.findMax());
		
		System.out.println("The sum of Array is: "+ob.findSum());
		
		System.out.println(ob);
		ob.RotateArray(true, 1);
		System.out.println("After rotating Array: "+ob);
		
		ob.reverseArray(true);
		System.out.println("Reverse Array: "+ob);
		
		int[] arr1=ob.exchangeIndexValue();
		IntStream.of(arr1).forEach(e->System.out.print(e+","));
		arr1=ob.reverseArray(true);
		System.out.println(ob);
		IntStream.of(arr1).forEach(e->System.out.print(e+","));
		
	}

}
