import java.util.Scanner;

public class Array2DFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static void acceptData(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the:  " + i + " Data: " + j);
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public static void displayData(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The entered Data is: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println("");
		}

	}

	public static int addAllNums(int[][] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];

			}

		}
		return sum;
	}

	public static int[] addRowwise(int[][] arr) {

		int[] temp = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				temp[i] += arr[i][j];
			}

		}
		return temp;
	}

	public static int[] addColumnwise(int[][] arr) {
		int[] temp = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				temp[i] += arr[j][i];
			}

		}

		return temp;
	}

	public static int maxOfAllNum(int[][] arr) {
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if(arr[i][j]>max) {
					max =arr[i][j];
				}
			}

		}
		
		
		return max;
	}

	public static int[] maxRowwise(int[][] arr) {
	
		int max = 0;
		int [] temp = new int[arr[0].length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if(arr[i][j]>max) {
					max = arr[i][j];
					temp[i] = max;
					System.out.println(temp[i]);
				}
			}

		}
		
		return temp;
	}

}
