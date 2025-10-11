package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
	
	StudentDao sdao;
	
	public StudentServiceImpl() {
		sdao = new StudentDaoImpl();
	}

	@Override
	public boolean addNewStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student ID: ");
		int sid = sc.nextInt();
		System.out.println("Enter the Student Name: ");
		String sname = sc.next();
		System.out.println("Enter the Student Mark 1: ");
		double m1 =sc.nextDouble();
		System.out.println("Enter the Student Mark 2: ");
		double m2 = sc.nextDouble();
		System.out.println("Enter the Student Mark 3: ");
		double m3 = sc.nextDouble();
		
		Student s = new Student(sid, sname, m1, m2, m3);
		
		return sdao.save(s);
	}

	@Override
	public List<Student> displayAll() {
		// TODO Auto-generated method stub
		return sdao.displayAll();
	}

}
