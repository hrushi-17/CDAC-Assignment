package com.demo.arrays;

import java.util.Arrays;

public class MyArray {

	private int[] arr;
	private int count;

	public MyArray() {
		arr = new int[10];
		count = 0;
	}

	public MyArray(int[] arr, int count) {
		this.arr = arr;
		this.count = count;
	}

	public MyArray(int size) {
		arr = new int[size];
		count = 0;
	}

	public int getCapacity() {
		return arr.length;
	}

	public int getSize() {
		return count;
	}

	public boolean add(int x) { // Add the Data at End
		if (count < arr.length) {
			arr[count] = x;
			count++;
			return true;
		}
		System.out.println("Max Length of Array achieved!");
		return false;

	}

	// add at given pos
	public boolean addAtPos(int value, int pos) {
		// shifting values one location on the rigth side and make place
		// at pos location
		if (count < arr.length && pos < count) {
			for (int i = count; i > pos; i--) {
				arr[i] = arr[i - 1];
			}
			arr[pos] = value;
			System.out.println("debug2 cout " + count);
			count++;
			System.out.println("debug3 cout " + count);
			return true;
		}
		return false;

	}

	// search the value and return its position
	public int searchByValue(int value) {
		for (int i = 0; i < count; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	// delete the value at the given position
	public boolean deleteByPos(int pos) {
		if (pos < count) {
			for (int i = pos; i < count - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[count - 1] = 0;
			count--;
			return true;
		}
		return false;
	}

	// delete first occurrence of the given value
	public boolean deleteByValue(int value) {
		int idx = searchByValue(value);
		if (idx != -1) {
			return deleteByPos(idx);
		}
		return false;
	}

	public int findMax() {
		int max = arr[0];
		for (int i = 0; i < count; i++) {
			if (max < arr[i + 1]) {
				max = arr[i + 1];
			}
		}
		return max;

	}

	public int findSum() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public void RotateArray(boolean flag, int num) {
		if(flag) {
			//right rotation
			for(int cnt=0; cnt<num; cnt++) {
				int temp = arr[count-1];
				for(int i=count-1; i>0;i--) {
					arr[i]=arr[i-1];
				}
				arr[0]=temp;
			}
		}
		else {
			//left rotation
			for(int cnt=0;cnt<num;cnt++) {
				int temp = arr[0];
				for(int i=0;i<count-1;i++) {
					arr[i]= arr[i+1];
				}
				arr[count-1]=temp;
			}
			
		}
		
	}
	
	public int[] reverseArray(boolean flag) {
		if(flag) {
			for(int i=0,j=count-1; i<j ; i++, j--) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			return arr;
		}else {
			int[] arr1 = new int[count];
			for(int i=count-1 , j=0; i>=0; i++, j--) {
				arr[j] = arr[i];
			}
			return arr1;
		}
	}
	
	public int[] exchangeIndexValue() {
		//find maximum number
		int max=findMax();
		//allocate memory for arr1 which is max+1
		int[] arr1=new int[max+1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=-1;
		}
		//exchange index with value
		for(int i=0;i<count;i++) {
			int idx=arr[i];
			int value=i;
			arr1[idx]=value;
		}
		return arr1;
	}

	public String toString() {
		return "Array -> " + Arrays.toString(arr);
	}
//	public void cout() {
//		System.out.println("Arrays:"+ Arrays.toString(arr));  
//	}


}
