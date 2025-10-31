package com.demo.test;

import com.demo.sorting.BubbleSortAlgorithm;

public class TestBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {21,2,5,1,7,8,10,3};
		System.out.println("-------BUBBLE SORT-------");
		BubbleSortAlgorithm.bubbleSort(arr);
		System.out.println("-------BUBBLE SORT IMPROVED-------");
		BubbleSortAlgorithm.bubbleSortImproved(arr);
		System.out.println("-------BUBBLE SORT IMPROVED DESCENDING-------");
		BubbleSortAlgorithm.bubbleSortImprovedDescending(arr);

	}

}
