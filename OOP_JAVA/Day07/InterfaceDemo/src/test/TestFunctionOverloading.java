package test;

import beans.MyTestClass;

public class TestFunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTestClass ob = new MyTestClass();
		System.out.println(ob.max(12, 13, 33));
		System.out.println(ob.max(14, 20));
		System.out.println(ob.max(34.5f, 22.5f));
		System.out.println(ob.max("ash","cat"));
		System.out.println(ob.add(12, 34));
		System.out.println(ob.add(12, 34,5,4,6,7,8));
		
	}

}
