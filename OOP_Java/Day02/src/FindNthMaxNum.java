//import java.util.Scanner;
//
//public class FindNthMaxNum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Enter the size of array: ");
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int [] arr = new int[size]; 
//		System.out.println("Enter the Number in array: ");
//			for(int i = 0 ; i < arr.length ; i++) {
//				arr [i]  = sc.nextInt();
//		}
//		System.out.println("1D Array: ");
//		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.print( arr[i]+" \t");
//		}
//		System.out.println();
//		
//		System.out.println("Sorted array is: ");
//		
//		int max = arr[0];
//		int secMax = 0;
//		for(int i = 0; i< arr.length; i++) {
//			for(int j = 1; j < arr.length - i ; j++) {
//				if(arr[j] > max) {
//					
//					max = arr[j];
//				}
//				else if(secMax < arr[j] && secMax!=max) {
//					 secMax = arr[j];
//				}
//			}
//				
//		}
//		System.out.println("MAX is: "+ max);
//		System.out.println("SECOND MAX is: "+ secMax);
//				
//			
//	}
//}
//
//


import java.util.Scanner;

public class FindNthMaxNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the numbers in array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input N
        System.out.print("Enter N to find the Nth maximum: ");
        int n = sc.nextInt();

        // Selection sort in descending order
        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // Display sorted array
        System.out.println("Sorted array (descending):");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // Find Nth max
        if (n > 0 && n <= size) {
            System.out.println("The " + n + "th maximum number is: " + arr[n - 1]);
        } else {
            System.out.println("Invalid value of N. It should be between 1 and " + size);
        }

        sc.close();
    }
}
