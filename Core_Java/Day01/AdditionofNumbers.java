import java.util.Scanner;

class AdditionOfFirstNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n1 = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=n1;i++){
			sum = sum+i;
		}
		sc.close();
	}
}