import java.util.Scanner;

public class TestTeamArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. add new team\n2. display all team");
			System.out.println("3. search team by id\n4. add new player");
			System.out.println("5. search a player\n6. exit\nChoice");
			choice = sc.nextInt();
			switch(choice) {
				
			case 1:
				boolean status = TeamService.addNewTeam();
				if(status) {
					System.out.println("Team added succesfully");
				}
				else {
					System.out.println("Error: team not added");
				}
				break;
				
			case 2:
				System.out.println("All Cricket Team is as follows: ");
				TeamService.displayAll();
				break;
				
			case 3:
				System.out.println("Enter the Team ID: ");
				 int tid = sc.nextInt();
				 Team t = TeamService.findById(tid);
				 if(t != null) {
					 System.out.println(t);
				 }else {
					 System.out.println("Not Found");
				 }
				break;
				
			case 4:
				System.out.println("Enter Tid to add new Player: ");
				  tid = sc.nextInt();
				System.out.println("Enter Player id: ");
				int pid = sc.nextInt();
				System.out.println("Enter Player Name: ");
				String pname = sc.next();
				System.out.println("Enter Player Speciality: ");
				String sp = sc.next();
				
				status = TeamService.addNewPlayer(tid, pid, pname, sp);
				
				if(status) {
					System.out.println("New Player Added Sucessfully!");
				}else {
					System.out.println("Error: Not Found");
				}
				break;
				
			case 5:
				System.out.println("Enter Pid to Search for Player: ");
				pid = sc.nextInt();
				
				Team t1 = TeamService.findTeamByPlayer(pid);
				if(t1 != null) {
					System.out.println(t1);
				}else {
					System.out.println("Error: Not Found");
				}
				
				break;
				
			case 6:
				sc.close();
				System.out.println("Thank you for Visiting.........");
				break;
				
			default:
				System.out.println("Wrong Choice ..........");
				break;
			}
			
			
		}while(choice!=6);

	}

}
