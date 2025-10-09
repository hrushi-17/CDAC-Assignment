package test;

public class TestStringData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Test";
		String s2 = "Test";
		String s3 = s2;
		String s4 = new String("Test");
		
		System.out.println("(s2==s3): "+(s2==s3));
		System.out.println("(s2==s3): "+(s2==s4));
		System.out.println("(s2.equals(s4)): "+(s2.equals(s4)));
		s1="Welcome";
		System.out.println("(s2==s1): "+(s2==s1));
		
		
		//all the methods are synchronized, so they are thread safe
		//useful in multithreaded program
		StringBuffer sbf = new StringBuffer("Hii");
		System.out.println(sbf.append(" Chinuu"));
		
		//useful in single threaded program, It is not thread safe
		StringBuilder sbd = new StringBuilder("Hii");
		System.out.println(sbd.append(" Rushi"));
		
		String s6 = "xxx,yyy,zzz-mmmm";
		String[] arr = s6.split(",");
		String str = String.join(":", arr);
		System.out.println(str);
	}

}
