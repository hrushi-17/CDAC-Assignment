package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	
	static List<Student> slist;
	
	static{
		slist = new ArrayList<>();
		slist.add(new Student(100, "DevGPT", 95, 75, 89));
		slist.add(new Student(100, "Chinmay", 98, 72, 79));
		slist.add(new Student(100, "Ash", 78, 84, 74));
		slist.add(new Student(100, "Hrushi", 98, 77, 89));
	}

	@Override
	public boolean save(Student s) {
		slist.add(s);
		return true;
	}

	@Override
	public List<Student> displayAll() {
		// TODO Auto-generated method stub
		return slist;
	}

}
