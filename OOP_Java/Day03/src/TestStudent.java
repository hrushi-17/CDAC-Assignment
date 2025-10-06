import java.util.Date;

public class TestStudent {

	public static void main(String[] args) {
		System.out.println("THe Name of our Topper Student is : ");
		Student s1 = new Student (1 , "Chinmay", 89 , 87 , new Date(2003,11,11));
		Student s2 = new Student (2 , "Hrushikesh", 99 , 77 , new Date(1999,11,01));
			
//		s1.display();
//		s2.display();
		System.out.println(s1);
		System.out.println(s2); //This is toString Call 
		
		s1.setId(77);
		System.out.println("Updated ID: " + s1.getId());
	}

}
