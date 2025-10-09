import java.util.Scanner;

class Maxof3Numbers{
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the 3 Numbers: ");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();

	if((n1>n2) && (n1>n3)){
	System.out.println("This Number is Bigger: "+ n1);
	}else if((n2>n3) && (n2>n1)){
	System.out.println("This Number is Bigger: "+n2);
	}else{
	System.out.println("THis Number is Bigger: " +n3);
	}
	
}
}