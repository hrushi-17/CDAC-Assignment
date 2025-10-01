import java.util.Scanner;

class PrimeNumArray{


    public static void main(String[] args){
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

        System.out.println("Prime Number of 2D Array is: ");
        for(int i=0;i<arr.length;i++){
            for(int j =0 ; j<arr[i].length; j++){
                if(isPrime(arr[i][j])){
                System.out.print(arr[i][j]+" \t");
                }
                else{
                    System.out.print("*\t");
                }
            }
        System.out.println("");
            
        }
        
        int [][] temp = new int [rows][columns];
       System.out.println("The only Prime No. Array is: ");  
        for(int i=0;i<arr.length;i++){
            for(int j =0 ; j<arr[i].length; j++){
                if(isPrime(arr[i][j])){
                	temp[i][j]=arr[i][j];
                System.out.print(temp[i][j]+", ");
                }
                else{
                    System.out.print(" ");
                }
            }
            
        }
    }
    

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}