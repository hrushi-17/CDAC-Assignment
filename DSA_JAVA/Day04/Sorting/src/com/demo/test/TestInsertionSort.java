package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.InsertionSortAlgorithm;

public class TestInsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,3,8,1,4,6,2,7};
		
		System.out.println("-------Insertion Ascending-------");
		System.out.println("Array->"+Arrays.toString(arr));
		InsertionSortAlgorithm.insertionSortAscending(arr);
		
		
		System.out.println("-------Insertion Ascending-------");
		System.out.println("Array->"+Arrays.toString(arr));
		InsertionSortAlgorithm.insertionSortDescending(arr);
	}

}
