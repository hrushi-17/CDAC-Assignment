import java.util.Scanner;

class CommandLineDemo{
	public static void main (String[] args){
	
		
		System.out.println("Number= "+args.length);
		
		if(args.length <=0){
			System.out.println("Error: Plz enter atlast 1 Parameter");
		}
		for(int i = 0; i<args.length; i++){
			System.out.println("Hello RUssi"+args[i]);
			}
		
	}
}