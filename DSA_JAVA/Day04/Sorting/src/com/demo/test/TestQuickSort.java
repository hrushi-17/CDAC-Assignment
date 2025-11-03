package com.demo.test;

import com.demo.sorting.QuickSortAlgorithm;

public class TestQuickSort {

	public static void main(String[] args) {
		
		int []arr = {5,3,8,1,4,6,2,7};
		System.out.println("-------QUICK SORT-------");
		
		QuickSortAlgorithm.quickSort(arr, 0, arr.length-1);
		
	}

}
