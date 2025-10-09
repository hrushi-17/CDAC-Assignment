import java.util.Scanner;
public class FactorialOfNumIn2DArray {

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
        
        System.out.println("Factorial Numbers of 2D Array is: ");
        int f = 1;
        for(int i=0;i<arr.length;i++){
            for(int j =0 ; j<arr[i].length; j++){
            	
            	if(arr[i][j]<7) {
            		
            		f*=arr[i][j];
            		System.out.print(f+"\t");
            	}
            	else {
            		System.out.print(arr[i][j]+"*\t");
            	}
            }
            System.out.println("");
            
            
        }
        System.out.println();
		

	}

}
