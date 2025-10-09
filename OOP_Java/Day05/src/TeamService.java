import java.util.Scanner;
public class TeamService {
	
	static Team[] tarr;
	static int cnt;
	static {
		tarr = new Team [20];
		Player [] plist1 = new Player[15];
		plist1 [0] = new Player (18, "DevGPT" , "Coder");
		plist1 [1] = new Player (12, "Ash-code-07" , "SmartCoder");
		plist1 [2] = new Player (16, "Chinmay" , "Treasuerer");
		Player c= new Player (17, "Hrushi" , "Cricketer");
		tarr[0] = new Team(101, "Bchods" ,c ,plist1,3 );
		
		Player [] plist2 = new Player[15];
		plist2 [0] = new Player (18, "DevGPT" , "Batsman");
		plist2 [1] = new Player (12, "Ash-code-07" , "Batsman");
		plist2 [2] = new Player (16, "Chinmay" , "Batsman");
		Player c1= new Player (17, "Hrushi" , "Batsman");
		tarr[1] = new Team(102, "MI" ,c1 ,plist2,3 );
		
		cnt =2;
	}
	
	public static Boolean addNewTeam() {
		Scanner sc = new Scanner(System.in);
		if(cnt!=20) {
			//team details
			System.out.println("Enter Team ID: ");
			int tid = sc.nextInt();
			
			System.out.println("Enter Team Name: ");
			String tname = sc.nextLine();
		
			//captain
			
			System.out.println("Enter Captain Id: ");
			int pid = sc.nextInt();
			System.out.println("Enter Captain Name: ");
			String pname = sc.nextLine();
			System.out.println("Enter Captain speciality: ");
			String speciality = sc.nextLine();
			
			Player c = new Player(pid,pname,speciality);
			
			//loops for creating player list
			Player[] plist = new Player[15];
			plist[0] = c;
			int i=1;
			String ans ="y";
			do {
				
				System.out.println("Enter Player Id: ");
				pid = sc.nextInt();
				System.out.println("Enter Player Name: ");
				pname = sc.nextLine();
				System.out.println("Enter Player Speciality");
				speciality = sc.nextLine();
				
				plist[i]= new Player(pid, pname, speciality);
				i++;
				
				System.out.println("Do You Want to add new Player(y/n): ");
				ans =sc.nextLine();
				
			}while(ans.equals("y"));
			
			//add team object in the tarr at cnt position
			tarr[cnt] = new Team(tid,tname,c,plist,i);
			cnt++;
		}
		return false;
	}
	public static void displayAll() {
		for(Team t: tarr) {
			if(t!=null) {
				System.out.println(t);
			}
			else {
				break;
			}
		}
	}
	
	public static Team findById(int tid) {
		for(Team t: tarr) {
			if(t!=null) {
				if(t.getId()==tid) {
					return t;
				}
			}
			else {
				break;
			}
		}
		
		return null;
	}
	
	public static boolean addNewPlayer(int tid,int pid, String pname, String speciality) {
		Team t = findById(tid);
		if(t!=null) {
			Player p = new Player(pid, pname, speciality);
			int s = t.getSize();
			
			//add player in player list
			t.getPlist()[s] = p;		
			t.setSize(s+1);
			return true;
		}
		
		return false;
	}
	
	public static Team findTeamByPlayer(int pid) {
		
		for(Team t:tarr) {
			if(t!=null) {
				//retrieve player array from team
				Player[] plist = t.getPlist();
				for(Player p: plist) {
					if(p!=null) {
						if(p.getPid()==pid) {
							return t;
						}
					}
					else {
						break;
					}
				}
			}
			else {
				break;
			}
		}
		
		return null;
	}

}
