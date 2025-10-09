package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();
	
	List<Employee> displayAll();

	Employee searchById(int eid);

	List<Employee> findByName(String ename);

	List<Employee> findBySalary(double sal);

	Employee updatedSal(double sal, int eid);

	boolean deleteById(int eid);

	boolean deletedBySal(double sal);

	List<Employee> sortedSalary();

	List<Employee> sortById();

	List<Employee> sortByName();

	

	

	
}
