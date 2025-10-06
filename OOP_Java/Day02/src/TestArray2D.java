import java.util.Scanner;
import java.util.stream.Stream;

public class TestArray2D {

	public static void main(String[] args) {
		//int[][] arr3=new int[3][]; 
		//int[][][] arr31=new int[3][][]; 
		int[][] arr= {{4,5,6},{3,4,5},{1,2,3}};
		int[][] arr1= {{1,5,6},{3,2,7},{10,20,30}};
		//int[][] arr=new int[3][4];
		Scanner sc=new Scanner(System.in);
		//Array2DService.acceptData(arr);
		Array2DService.displayData(arr);
		Array2DService.displayData(arr1);
		int choice=0;
		do {
		System.out.println("1. add all numbers\n2. add rowwise\n3.columnwise addition");
		System.out.println("4. find max of all numbers\n 5. maximum rowwise\n6. find maximum columnwise");
		System.out.println("7. add 2 arrays\n8. multiply array\n9. find transpose of array");
		System.out.println("10. check identity matrix\n11. rotate matrix rows\n 12. rotate matrix columns");
		System.out.println("13. convert to 1D array\n 14. exit\nchoice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			int ans=Array2DService.addAllNumbers(arr);
			System.out.println("Addition of all Numbers: "+ans);
			break;
		case 2:
			int[] arradd=Array2DService.addRowwise(arr);
			System.out.println("Addition of Rowwise: ");
			/*for(int i=0;i<arradd.length;i++) {
				System.out.println(arradd[i]);
			}*/
			for(int val:arradd) {  
				System.out.println(val);
			}
			//Stream<Integer>.of(arradd).forEach(val->System.out.println(val));
			break;
		case 3:
			System.out.println("Addition of Columnwise: ");
			 arradd=Array2DService.addColumnwise(arr);
			/*for(int i=0;i<arradd.length;i++) {
				System.out.println(arradd[i]);
			}*/
			for(int val:arradd) {  
				System.out.print(val+"\t");
			}
			System.out.println(" ");
			break;
		case 4:
		    int max = Array2DService.findMax(arr);
		    System.out.println("Maximum of all numbers: " + max);
		    break;
		case 5:
		    int[] rowMax = Array2DService.findMaxRowwise(arr);
		    System.out.println("Maximum values row-wise: ");
		    for(int val : rowMax) {
		        System.out.println(val);
		    }
		    break;
		case 6:
		    int[] colMax = Array2DService.findMaxColumnwise(arr);
		    System.out.println("Maximum values column-wise: ");
		    for(int val : colMax) {
		        System.out.print(val+"\t");
		    }
		    System.out.println(" ");
		    break;

		case 7:
			int[][] addition=Array2DService.add2Darrays(arr,arr1);
			System.out.println("Addition of 2 Arrays: ");
			Array2DService.displayData(addition);
			break;
		case 8:
			int[][] multiply=Array2DService.multiplyArray(arr,arr1);
			System.out.println("Multiplication of 2 Arrays: ");
			if(multiply!=null) {
				Array2DService.displayData(multiply);
			}else {
				System.out.println("multiplication not possible");
			}
			break;
		case 9:
			int[][] temp=Array2DService.findTranspose(arr);
			System.out.println("Transpose Arrays: ");
			Array2DService.displayData(temp);
			break;
		case 10:
			boolean status=Array2DService.checkIdentity(arr);
			System.out.println("Identity Arrays: ");
			if(status)  ///status==true
				System.out.println("It is identity matrix");
			else
				System.out.println("It is not identity matrix");
			break;
		case 11:
			System.out.println("Enter number of rotation: ");
			int n=sc.nextInt();
			int[][] newarr=Array2DService.rotateRow(arr,n);
			Array2DService.displayData(newarr);
			break;
		case 12:
			System.out.println("Enter number of rotation for column: ");
			n=sc.nextInt();
			newarr=Array2DService.rotateColumn(arr,n);
			Array2DService.displayData(newarr);
			break;
		case 13:
			int[] arr2=Array2DService.convertTo1DArray(arr);
			System.out.println("Convert 2D To 1D Array: ");
			for(int val:arr2) {
				System.out.print(val+",");
			}
			System.out.println();
			break;
		case 14:
			System.out.println("Thank you for visiting.....");
			break;
		default:
			System.out.println("choice is wrong");
			break;
		}
		}while(choice!=14);

	}

}
