package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.search.SearchingService;

public class TestSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------SEQUENTIAL SEARCH----------------");
		int [] arr = {10,5,4,7,8,3,2,15};
		System.out.println("Array->"+ Arrays.toString(arr));
	
		System.out.println("Enter the Number to Find: ");
		int Num = sc.nextInt();
		int pos = SearchingService.sequentialSearch(arr,Num);
		if(pos!=-1) {
				System.out.println("Number Successfully Found! ");
				System.out.println("Position->"+pos);
		}else {
			System.out.println("Number not Found in Array ");
		}
//		-------------------------------------------------------------------------
		System.out.println("----------------BINARY SEARCH----------------");
		int[] arr1= {12,13,16,23,27,45,56,58,62,65,70};
		System.out.println("Array->" + Arrays.toString(arr1));
		System.out.println("Enter the Number to Search: ");
		Num = sc.nextInt();
		pos = SearchingService.binarySearchNonRecurssive(arr1, Num);
		if(pos!=-1) {
			System.out.println("Binary Search Found Sucessfully!");
			System.out.println("Position->" +pos);
		}else {
			System.out.println("Binary Search not Found");
		}
//		-------------------------------------------------------------------------
		System.out.println("----------------BINARY SEARCH Recurssive----------------");
		System.out.println("Array->" + Arrays.toString(arr1));
		System.out.println("Enter the Number to Search(Recurssive):");
		Num=sc.nextInt();
		
		pos = SearchingService.binarySearchingRecurssive(arr1,Num, 0, arr1.length-1);
			if(pos!=-1) {
				System.out.println("BinarySearch (recurssive)Found!" +pos);
			}else {
				System.out.println("BinarySearch (recurssive) not Found!");

			}
		
	}
}
