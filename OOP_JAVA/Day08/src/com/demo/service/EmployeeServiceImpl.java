package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao edao;
	

	public EmployeeServiceImpl() {
		edao = new EmployeeDaoImpl();
	}


	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int eid = sc.nextInt();
		System.out.println("Enter Employee Name");
		String ename = sc.next();
		System.out.println("Enter Employee Salary");
		double sal = sc.nextDouble();
		System.out.println("Enter DOJ (DD/MM/YYYY)");
		String dt = sc.next();
		LocalDate ldt =LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Employee e = new Employee(eid,ename,sal,ldt);
		 return edao.save(e);
		
	}


	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}


	@Override
	public Employee searchById(int eid) {
		// TODO Auto-generated method stub
		return edao.findById(eid);
	}


	@Override
	public List<Employee> findByName(String ename) {
		// TODO Auto-generated method stub
		return edao.findByName(ename);
	}


	@Override
	public List<Employee> findBySalary(double sal) {
		// TODO Auto-generated method stub
		return edao.findBySalary(sal);
	}


	@Override
	public Employee updatedSal(double sal, int eid) {
		
		return edao.updatedSal(sal, eid);
	}


	@Override
	public boolean deleteById(int eid) {
		// TODO Auto-generated method stub
		return edao.deleteById(eid);
	}


	@Override
	public boolean deletedBySal(double sal) {
		// TODO Auto-generated method stub
		return edao.deleteBySal(sal);
	}


	@Override
	public List<Employee> sortedSalary() {
		// TODO Auto-generated method stub
		return edao.sortedSalary();
	}


	@Override
	public List<Employee> sortById() {
		// TODO Auto-generated method stub
		return edao.sortById();
	}


	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		return edao.sortByName();
	}


	


	
	
	

}
