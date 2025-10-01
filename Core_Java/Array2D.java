import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 		int [][] arr = new int [3][3];
				Array2DFunctions.acceptData(arr);
				Array2DFunctions.displayData(arr);
		int choice = 0;
		do{
			System.out.println("1.Add all the Numbers.\n2.Do Rowwise Addition. \n3.Do Columnwise Addition.");
			System.out.println("4.Maximum of all Numbers. \n5.Maximum Rowwise. \n6.Maximum Columnwise. \n7.Add 2DArrays.");
			System.out.println("8.Multiply 2D Arrays. \n9.Find Transpose of Array. \n10. CHeck Identity Mattrix. \n11.Rotate Matrix Rows. ");
			System.out.println("12.Rotate Matrix Column. \n13.Convewrt into 1D Array. \n14.Exit ");
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			switch(choice) 
			{
			case 1:
				int ans = Array2DFunctions.addAllNums(arr);
				System.out.println("The sum of all numbers in Array is: "+ans);
				System.out.println("-----------------------------------------");
				break;
			case 2:
				int [] add = Array2DFunctions.addRowwise(arr);
				System.out.println("The Addition of Rowwise is: ");
				for(int val:add) {
					System.out.println(val);
				}
				System.out.println("-----------------------------------------");
				break;
			case 3:
				
				int [] col = Array2DFunctions.addColumnwise(arr);
				System.out.println("The Addition of Columnwise is: ");
				for(int val:col) {
					System.out.print(val+"\t");
				}
				System.out.println(" ");
				System.out.println("-----------------------------------------");
				break;
				
			case 4:
				
				int max1 = Array2DFunctions.maxOfAllNum(arr);
				System.out.println("The Maximum of 2D array is: "+max1);
			
				System.out.println("-----------------------------------------");
				break;
				
			case 5:
				int []maxRow = Array2DFunctions.maxRowwise(arr);
				System.out.println("The Maximum of Rowwise is: ");
				for(int val:maxRow) {
					System.out.println(val);
				}
				System.out.println("-----------------------------------------");
				break;
			}
		}while(choice !=14 );

	}

}
