package com.demo.services;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	Set<Employee> displayAll();

	Employee displayByID(int empid);

	Set<Employee> displayByName(String ename);

	boolean updateBySal(int empid, double sal);

	boolean deleteByID(int empid);

	boolean deletedBySal(double sal);

	Set<Employee> displayBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	Set<Employee> sortByID();

	

	

	

}
