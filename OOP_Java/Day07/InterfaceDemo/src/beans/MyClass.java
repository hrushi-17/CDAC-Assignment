package beans;

import interfaces.I3;

public class MyClass implements I3 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("in m1 method");
	}

	@Override
	public void m2(int x) {
		// TODO Auto-generated method stub
		System.out.println("in m2 method"+x);
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("in m3 method");
	}

}
