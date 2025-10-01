
import java.util.Scanner;
public class Find2ndMaxIn2DArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter the size of array: ");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int [] arr = new int[size]; 
			System.out.println("Enter the Number in array: ");
				for(int i = 0 ; i < arr.length ; i++) {
					arr [i]  = sc.nextInt();
			}
			System.out.println("1D Array: ");
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.print( arr[i]+" \t");
			}
			System.out.println();
			
			int max = arr[0];
			int secMax = 0;
			for(int i = 0; i< arr.length; i++) {
				for(int j = 1; j < arr.length - i ; j++) {
					if(arr[j] > max) {
						
						max = arr[j];
					}
					else if(secMax < arr[j] && secMax!=max) {
						 secMax = arr[j];
					}
				}
					
			}
			System.out.println("MAX is: "+ max);
			System.out.println("SECOND MAX is: "+ secMax);
			
				
				
		}

}
