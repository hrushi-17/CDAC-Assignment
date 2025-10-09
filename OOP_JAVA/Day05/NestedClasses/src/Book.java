
public class Book {
	private int bid;
	private String bname;
	private Lesson l1;
	
	class Lesson{
		private int lid;
		private String lname;
		public Lesson() {
			lid = 0;
			lname =null;
		}
		public Lesson (int id , String lnm) {
			lid = id;
			lname = lnm;
		}
		public void m1() {
			System.out.println("In m1 method of Nested Class Lesson ");
		}
	}
	
	public Book () {
		bid = 0;
		bname = "";
		l1 =null;
	}
	public Book(int bid, String bname, int lid, String lname) {
		this.bid =bid;
		this.bname=bname;
		this.l1 = new Lesson (lid, lname);
	
	}
	public Lesson getL1(){
		return l1;
	}
	public String toString() {
		return bid +","+bname;
	}
}
