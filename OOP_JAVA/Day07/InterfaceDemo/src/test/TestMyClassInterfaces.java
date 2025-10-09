package test;

import beans.MyClass;
import interfaces.I1;
import interfaces.I2;

public class TestMyClassInterfaces {

	public static void main(String[] args) {
		
		MyClass ob = new MyClass();
	    
		ob.m2(20);
		I1 b2 = new MyClass ();
		b2.m1();
		((MyClass)b2).m3();
		I2 b3 = new MyClass ();
		((MyClass)b3).m1();
		
		
	}
}
