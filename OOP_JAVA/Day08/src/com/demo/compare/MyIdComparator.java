package com.demo.compare;

import java.util.Comparator;

import com.demo.beans.Employee;

public class MyIdComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return (int)(((Employee) o1).getEid() - ((Employee) o2).getEid());
	}

}
