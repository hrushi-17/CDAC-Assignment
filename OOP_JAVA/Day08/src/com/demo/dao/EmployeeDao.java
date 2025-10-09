package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(int eid);

	List<Employee> findByName(String ename);

	List<Employee> findBySalary(double sal);

	Employee updatedSal(double sal, int eid);

	boolean deleteById(int eid);

	boolean deleteBySal(double sal);

	List<Employee> sortedSalary();

	List<Employee> sortById();

	List<Employee> sortByName();

	
	

}
