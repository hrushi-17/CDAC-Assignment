package beans;

import interfaces.MyComparable;

public class MyNewCompare implements MyComparable {

	@Override
	public int compare(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("in compare method;");
		return 10;
	}

}
