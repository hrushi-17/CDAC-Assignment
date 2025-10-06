import java.util.Date;

public class Student {

		private int id;
		private String name;
		private float m1;
		private float m2;
		private Date bdate;
		
		Student(){
			id = 0;
			name = null;
			m1 = 0.0f;
			m2 = 0.0f;
			bdate = null;
		}
		Student (int id , String name, float m1 , float m2 , Date bdate ){
			this.name = name;
			this.id = id;
			this.m1 = m1;
			this.m2 = m2;
			this.bdate = bdate;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setM1(float m1) {
			this.m1 = m1;
		}
		
		public void setM2(float m2) {
			this.m2 = m2;
		}
		
		public void setbDate(Date bdate) {
			this.bdate = bdate;
		}
		////////////////////////////////////////////////////
		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		
		public float getM1() {
			return m1;
		}
		
		public float getM2() {
			return m2;
		}
		
		public Date getbDate() {
			return bdate;
		}
		
//		public void display() {
//			System.out.println("ID: " + id + " Name: " + name + " M1 Marks: " + m1+ " M2 Marks: " + m2 +" Birth Date: "+bdate);
//		}
			
		public String toString () {
			System.out.println("I am Showcasing Data using toString Function!");
			return ("ID: " + id + " Name: " + name + " M1 Marks: " + m1+ " M2 Marks: " + m2 +" Birth Date: "+bdate);
		}
}



