import java.util.Scanner;

class TestPrintTable{
	public static void printTable(int n){
		for(int i=1; i<=10; i++){
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

	public static void main(String[] args){
		if(args.length < 0){
			System.out.println("Error: pass one parameter");
		}
		else{
			printTable (Integer.parseInt(args[0]));	
		}
	}
	
}