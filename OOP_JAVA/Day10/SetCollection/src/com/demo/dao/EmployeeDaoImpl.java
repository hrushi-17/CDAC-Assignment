package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	static Set<Employee> eset;
	static {
		eset= new HashSet<>();
		eset.add(new Employee(105,"Ash",80000,LocalDate.of(2000,04,06)));
		eset.add(new Employee(103,"DevGPT",60000,LocalDate.of(2000,06,12)));
		eset.add(new Employee(101,"Hrushi",70000,LocalDate.of(2000,02,12)));
		eset.add(new Employee(102,"Chinmay",50000,LocalDate.of(2000,04,07)));
		eset.add(new Employee(104,"Chandra",40000,LocalDate.of(2000,07,06)));
		eset.add(new Employee(104,"Chandra",40000,LocalDate.of(2000,07,06)));
	}

	@Override
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		return eset.add(e);
	}

	@Override
	public Set<Employee> findAll() {
		// TODO Auto-generated method stub
		return eset;
	}

	@Override
	public Employee findByID(int empid) {
//		for(Employee e: eset) {
//			if(e.getEmpid()==empid) {
//				return e;
//			}
//		}
		
		Optional<Employee> ob = eset.stream()
								.filter(e->e.getEmpid()==empid)
								.findFirst();
		
		if(ob.isPresent()) {
			return ob.get();
		}
		return null;
	}

	@Override
	public Set<Employee> findByName(String ename) {
		Set<Employee> es = eset.stream()
							.filter(e->e.getEname().equals(ename))
							.collect(Collectors.toSet());
		
		if(es.size()>0) {
			return es;
		}
		
		return null;
	}

	@Override
	public boolean updateBySal(int empid, double sal) {
		
		Employee e = findByID(empid);
		
		if(e!=null) {
			e.setSal(sal);
			return true;
		}
		return false;
	}


	@Override
	public boolean removeById(int empid) {
		
		return eset.remove(new Employee(empid));
	}

	@Override
	public boolean removeBySal(double sal) {
		return eset.removeIf(e->e.getSal()>sal);
		
	}

	@Override
	public Set<Employee> findBySal(double sal) {
		Set<Employee> es = eset.stream()
							.filter(e->e.getSal()==sal)
							.collect(Collectors.toSet());
		return es;
	}

	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee> csal = (o1, o2)->{
			System.out.println("in sal comparator "+o1.getSal()+"--------"+o2.getSal());
			return (int) (o1.getSal()-o2.getSal());
		};
		List<Employee> elist = new ArrayList<>();
		for(Employee e :eset) {
			elist.add(e);
		}
		elist.sort(csal);
		return elist;
	}

	@Override
	public List<Employee> sortByName() {
		Comparator<Employee> c = (o1, o2)->{
			System.out.println("in name comparator "+o1.getEname()+"-------"+o2.getEname());
			return o1.getEname().compareTo(o2.getEname());
		};
		
		List<Employee> elist = new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(c);
		
		return elist;
	}

	@Override
	public Set<Employee> sortByID() {
		Set<Employee> tset = new TreeSet<>();
		for(Employee e: eset) {
			tset.add(e);
		}
		return tset;
	}

	


	


}
