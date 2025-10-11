package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> findAll();

	Employee findByID(int empid);

	Set<Employee> findByName(String ename);

	boolean updateBySal(int empid, double sal);

	boolean removeById(int empid);

	boolean removeBySal(double sal);

	Set<Employee> findBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	Set<Employee> sortByID();

	

	

	

	

}
