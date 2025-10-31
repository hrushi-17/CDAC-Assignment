package com.demo.arrays;

import java.util.Scanner;

public class My2DArray {

	private int[][] arr;
	
	public My2DArray() {
		arr = new int[3][3];
	}
	
	public My2DArray(int rows, int cols) {
		arr = new int[rows][cols];
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println("Enter the value of "+i+" and "+j);
				arr[i][j]= sc.nextInt();
			}
		}
		
	}
	
	public void displayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
	}
	
	public int[] findSumRowWise() {
		int[] sumRow = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				sumRow[i] += arr[i][j];
			}
			
		}
		System.out.println("sum of row wise: ");
		return sumRow;
		
	}
	
	public int[] findSumColumnWise() {
		int[] sumCol = new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0; j<arr.length;j++) {
				sumCol[i] += arr[j][i];
			}
		}
		System.out.println("----------------------------------");
		System.out.println("sum of column wise: ");
		return sumCol;
		
	}
	
	
	//adding 2 matrices
	public int[][] add2DArrays(My2DArray ob){
		if(this.arr.length== ob.arr.length && this.arr[0].length==ob.arr[0].length) {
			int[][] temp=new int[arr.length][arr[0].length];
			for(int i=0;i<this.arr.length;i++) {
				for(int j=0;j<this.arr[0].length;j++) {
					temp[i][j]=this.arr[i][j]+ob.arr[i][j];
				}
			}
			System.out.println("Addition of 2D array: ");
			return temp;
		}
		return null;
	}
		
	//subtracting 2 matrices
	public int[][] subtract2DArrays(My2DArray ob){
		if(this.arr.length== ob.arr.length && this.arr[0].length==ob.arr[0].length) {
			int[][] temp=new int[arr.length][arr[0].length];
			for(int i=0;i<this.arr.length;i++) {
				for(int j=0;j<this.arr[0].length;j++) {
					temp[i][j]=this.arr[i][j]-ob.arr[i][j];
				}
			}
			System.out.println("Subtraction of 2D array: ");
			return temp;
		}
		return null;
	}
		
	
	public void rowRotation(boolean flag, int num) {
		
		if(flag) {
			//up rotation
			
			for(int cnt=0;cnt<num;cnt++) {
				int[] temp = arr[0];
				for(int i=0;i<arr.length-1;i++) {
					arr[i] = arr[i+1];
				}
				arr[arr.length-1] = temp;
			}
			System.out.println("After "+num+" Rotation in up rotation");
		}
		else {
			//down rotation
			for(int cnt=0;cnt<num;cnt++) {
				int[] temp = arr[arr.length-1];
				for(int i=arr.length-1; i>0 ;i--) {
					arr[i] =arr[i-1];
				}
				arr[0] =temp;
			}
			System.out.println("After "+num+" Rotation in down rotation");
		}
	}
	
	public void columnRotation(boolean flag,int num){
		if(flag) {
			for(int cnt=0;cnt<num;cnt++) {
				int[] temp=new int[arr.length];
				for(int i=0;i<arr.length;i++) {
					temp[i]=arr[i][arr[0].length-1];
				}
				
				for(int i=0;i<arr.length;i++) {
					for(int j=arr[0].length-2;j>=0;j--) {
						arr[i][j+1]=arr[i][j];
					}
				}
				
				for(int i=0;i<arr.length;i++) {
					arr[i][0]=temp[i];
				}
				System.out.println("After "+num+" Rotation in right rotation");
			}
			
		}
		else {
			for(int cnt=0;cnt<num;cnt++) {
				int[] temp=new int[arr.length];
				for(int i=0;i<arr.length;i++) {
					temp[i]=arr[i][0];
				}
				for(int i=0;i<arr.length;i++) {
					for(int j=1;j<arr[0].length;j++) {
						arr[i][j-1]=arr[i][j];
					}
				}
				for(int i=0;i<arr.length;i++) {
					arr[i][arr[0].length-1]=temp[i];
				}
				System.out.println("After "+num+" Rotation in left rotation");
			}
			
		}
	}
	
	public int[][] transpose(){
		
		int[][] temp = new int[arr[0].length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				temp[j][i]=arr[i][j];
			}
		}
		System.out.println("Transpose array: ");
		return temp;
		
	}
	
	public boolean isSymentric() {
		if(arr.length==arr[0].length) {
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					if(arr[i][j]!=arr[j][i]) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	public boolean isIdentity() {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(i==j && arr[i][j]!=1) {
					return false;
				}
				if(i!=j && arr[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
	
}
