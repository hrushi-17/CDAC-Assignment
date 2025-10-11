package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}


	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int empid = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String ename = sc.next();
		System.out.println("Enter Employee Salary: ");
		double sal = sc.nextDouble();
		System.out.println("Enter Date (dd/mm/yyy): ");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Employee e = new Employee(empid, ename, sal, ldt);
		return edao.save(e);
	}


	@Override
	public Set<Employee> displayAll() {
		
		return edao.findAll();
	}


	@Override
	public Employee displayByID(int empid) {
		// TODO Auto-generated method stub
		return edao.findByID(empid);
	}


	@Override
	public Set<Employee> displayByName(String ename) {
		// TODO Auto-generated method stub
		return edao.findByName(ename);
	}


	@Override
	public boolean updateBySal(int empid, double sal) {
		// TODO Auto-generated method stub
		return edao.updateBySal(empid, sal);
	}


	@Override
	public boolean deleteByID(int empid) {
		// TODO Auto-generated method stub
		return edao.removeById(empid);
	}


	@Override
	public boolean deletedBySal(double sal) {
		// TODO Auto-generated method stub
		return edao.removeBySal(sal);
	}


	@Override
	public Set<Employee> displayBySal(double sal) {
		// TODO Auto-generated method stub
		return edao.findBySal(sal);
	}


	@Override
	public List<Employee> sortBySal() {
		// TODO Auto-generated method stub
		return edao.sortBySal();
	}


	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		return edao.sortByName();
	}


	@Override
	public Set<Employee> sortByID() {
		// TODO Auto-generated method stub
		return edao.sortByID();
	}


	


	



}
