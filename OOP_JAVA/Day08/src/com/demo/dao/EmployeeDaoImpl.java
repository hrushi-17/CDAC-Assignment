package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;
import com.demo.compare.MyIdComparator;
import com.demo.compare.MyNameComparator;

public class EmployeeDaoImpl implements EmployeeDao {

	static List<Employee> elist;
	static {
		
		
		elist = new ArrayList<>();
		elist.add(new Employee(102, "Rushi", 45678, LocalDate.of(2024, 11, 12)));
		elist.add(new Employee(105, "Amol", 55678, LocalDate.of(2023, 11, 12)));
		elist.add(new Employee(104, "Ayush", 35678, LocalDate.of(2020, 11, 12)));
		elist.add(new Employee(103, "DevGPT", 75678, LocalDate.of(2020, 11, 12)));
		elist.add(new Employee(101, "Chinmay", 145678, LocalDate.of(2020, 11, 12)));
		elist.add(new Employee(105, "Jhanty", 35678, LocalDate.of(2020, 11, 12)));
	}

	@Override
	public boolean save(Employee e) {
		elist.add(e);
		return true;
	}

	@Override
	public List<Employee> findAll() {

		return elist;
	}

	@Override
	public Employee findById(int eid) {
		int pos = elist.indexOf(new Employee(eid));
		if (pos != -1) {
			return elist.get(pos);
		}
		return null;
	}

	@Override
	public List<Employee> findByName(String ename) {
		List<Employee> temp = elist.stream().filter(emp -> emp.getEname().equals(ename)).collect(Collectors.toList());

		if (temp.size() > 0) {
			return temp;
		}
		return null;
	}

	@Override
	public List<Employee> findBySalary(double sal) {
		List<Employee> temp = elist.stream().filter(emp -> emp.getSal() == (sal)).collect(Collectors.toList());

		if (temp.size() > 0) {
			return temp;
		}
		return null;
	}

	@Override
	public Employee updatedSal(double sal, int eid) {
		Employee emp = findById(eid);
		emp.setSal(sal);

		return emp;
	}

	@Override
	public boolean deleteById(int eid) {

		Employee emp = findById(eid);
		elist.remove(emp);
		return true;
	}

	@Override
	public boolean deleteBySal(double sal) {
		List <Employee> emp = findBySalary(sal);
		elist.removeAll(emp);
		return true;
	}

	@Override
	public List<Employee> sortedSalary() {
		List<Employee> gsal = new ArrayList<>();
		for(Employee e :elist) {
			gsal.add(e);
		}
		gsal.sort(null);
		return gsal;
	}

	@Override
	public List<Employee> sortById() {
		List<Employee> leId = new ArrayList<>();
		for(Employee e: elist) {
			leId.add(e);
		}
		leId.sort(new MyIdComparator());
		return leId;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> nm = new ArrayList<>();
		for(Employee n : elist) {
			nm.add(n);
		}
		nm.sort(new MyNameComparator());
		return nm;
	}

}
