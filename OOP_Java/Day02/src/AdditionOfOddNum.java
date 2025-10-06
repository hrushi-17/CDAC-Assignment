import java.util.Scanner;

public class AdditionOfOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of array: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns of array: ");
        int columns = sc.nextInt();
        int [][] arr = new int[rows][columns];
            System.out.println("Enter the 2D Array: ");
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j <arr[i].length; j++){
                 arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Addition of 2D Odd Array is: ");
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j =0 ; j<arr[i].length; j++){
                if(arr[i][j]%2!=0) {
                	
                	sum += arr[i][j];
                }
            }
            
            
        }
        System.out.println(sum);

	}

}
