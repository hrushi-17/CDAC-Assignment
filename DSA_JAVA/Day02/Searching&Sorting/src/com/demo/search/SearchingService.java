package com.demo.search;

public class SearchingService {

	public static int sequentialSearch(int[] arr, int search) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i;
			}
		}
		return -1;
		}

	public static int binarySearchNonRecurssive(int[] arr1, int search) {
		
		int low = 0;
		int high = arr1.length-1;
		int cnt=0;
		
		while(low <= high) {
			int mid = (low+high)/2;
			cnt++;
			if(arr1[mid] == search) {
				System.out.println("Comparisons are: "+cnt);
				return mid;
				
			}
			if(search<arr1[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		
		System.out.println("Comparisons are: "+cnt);
		return -1;
	}

	public static int binarySearchingRecurssive(int[] arr1, int Search, int low, int high) {
		
		System.out.println("Binary Search Called-> "+low+"-----"+high);
		if(low<=high) {
			int mid = (high+low)/2;
			if(arr1[mid] == Search) {
				return mid;
				
			}else if(Search<arr1[mid]){
				return binarySearchingRecurssive(arr1, Search, low, mid-1);
			}else {
				return binarySearchingRecurssive(arr1, Search, mid+1, high);
			}
		}
		return -1	;
	}
	
	

}
