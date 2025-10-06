import java.util.Scanner;

public class TestStudentArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. add new student\n2. display all\n3. search by id");
		System.out.println("4. search by name\n5. update marks\n6.exit\nchoice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean status=StudentService.addNewStudent();
			if(status) {
				System.out.println("Student added successfuly");
			}else {
				System.out.println("error: Not added");
			}
			
			break;
		case 2:
			StudentService.displayAll();
			break;
		case 3:
			int searchId = sc.nextInt();
		    Student found = StudentService.findByID(searchId);
		    System.out.println("Student found: " + found);
		    break;
		case 4:
		    sc.nextLine(); // Consume leftover newline
		    System.out.println("Enter student name to search:");
		    String nm = sc.nextLine();
		    Student[] nobj = StudentService.findBYName(nm);
		    if (nobj != null) {
		        System.out.println("Students with name '" + nm + "' found:");
		        for (Student s : nobj) {
		            System.out.println(s);
		        }
		    } else {
		        System.out.println("No student found with name: " + nm);
		    }
		    break;

		case 5:
		    System.out.println("Enter student ID to update marks:");
		    int id = sc.nextInt();
		    System.out.println("Enter new marks1:");
		    float m1 = sc.nextFloat();
		    System.out.println("Enter new marks2:");
		    float m2 = sc.nextFloat();

		    boolean updateM = StudentService.updateMarkById(id, m1, m2);
		    break;

		case 6:
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		default:
			System.out.println("wrong choice");
			
		}
		}while(choice!=6);

	}

}
