import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentService {
   static Student[] studarr;
   static int cnt;
   static {
	   studarr=new Student[100];
	   studarr[0]=new Student(12,"Rajan",98,97,new Date(2000-11-11));
	   studarr[1]=new Student(13,"Atharva",98,97,new Date(1997-11-11));
	   studarr[2]=new Student(12,"Ashu",98,97,new Date(1997-11-11));
	   cnt=3;
   }
public static boolean addNewStudent() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	int sid=sc.nextInt();
	sc.nextLine();
	System.out.println("enter name");
	String nm=sc.nextLine();
	System.out.println("enter marks1");
	float m1=sc.nextFloat();
	System.out.println("enter marks2");
	float m2=sc.nextFloat();
	System.out.println("enter birth date(dd/mm/yyyy)");
	String dt=sc.next();
	//conver string to java date
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	Date bdt=null;
	try {
		bdt=sdf.parse(dt);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Student s=new Student(sid,nm,m1,m2,bdt);
	if(cnt==studarr.length) {
		return false;
	}else {
		studarr[cnt]=s;
		cnt++;
		return true;
	}
	
}
	public static void displayAll() {
	/*for(Student s:studarr) {
		if(s==null)
			break;
		else
			System.out.println(s);
	}*/
	for(int i=0;i<cnt;i++) {
		System.out.println(studarr[i]);
	}
	
	
}
	
	public static Student findByID(int searchId) {
	    for (int i = 0; i < cnt; i++) {
	        if (studarr[i] != null && studarr[i].getId() == searchId) {
	            return studarr[i];
	        }
	    }
	    return null;
	}

	public static Student[] findBYName(String nm) {
	    Student[] stemp = new Student[cnt];
	    int matchCount = 0;
	    for (int i = 0; i < cnt; i++) {
	        if (studarr[i].getName().equalsIgnoreCase(nm)) {
	            stemp[matchCount] = studarr[i];
	            matchCount++;
	        }
	    }
	    if (matchCount > 0) {
	        Student[] result = new Student[matchCount];
	        System.arraycopy(stemp, 0, result, 0, matchCount);
	        return result;
	    }
	    return null;
	}
	public static boolean updateMarkById(int id, float m1, float m2) {
		// TODO Auto-generated method stub
		Student s = findByID(id);
		if(s!=null) {
			s.setM1(m1);
			s.setM2(m2);
			return true;
		}
		return false;
	}


	
	
	
}
