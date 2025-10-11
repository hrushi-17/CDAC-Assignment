package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.services.EmployeeService;
import com.demo.services.EmployeeServiceImpl;

public class TestEmployeeSetDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeService eservice = new EmployeeServiceImpl();
		int choice = 0;
		
		do {
			
			System.out.println("1. add new employee\n2. display all\n3. search by id");
			System.out.println("4. Search by name\n5. update sal\n6. delete by id\n7. delete by salary");
			System.out.println("8. search by salary \n9. sort by salary\n10. Sort By name\n11. Sort By id\n12. exit\n choice: ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1->{
				boolean status = eservice.addNewEmployee();
				if(status) {
					System.out.println("Data added succefully");
				}
				else {
					System.out.println("duplicate ID, not Added");
				}
			}
			
			case 2->{
				Set<Employee> eset = eservice.displayAll();
				eset.forEach(System.out::println);
			}
			
			case 3->{
				System.out.println("Enter the ID: ");
				int empid = sc.nextInt();
				Employee e = eservice.displayByID(empid);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("not found");
				}
			}
			case 4->{
				System.out.println("Enter the Name: ");
				String ename = sc.next();
				Set<Employee> eset= eservice.displayByName(ename);
				if(eset!=null) {
					eset.forEach(System.out::println);
				}
				else {
					System.out.println("not found");
				}
			}
			case 5->{
				System.out.println("Enter the ID: ");
				int empid = sc.nextInt();
				System.out.println("Enter the Updated Salary: ");
				double sal = sc.nextDouble();
				boolean status = eservice.updateBySal(empid, sal);
				if(status) {
					System.out.println("Updated Successfully");
				}
				else {
					System.out.println("not found");
				}
			}
			
			case 6->{
				System.out.println("Enter ID to deleted: ");
				int empid =  sc.nextInt();
				
				boolean status =  eservice.deleteByID(empid);
				
				if(status) {
					System.out.println("Deleted succefully");
				}
				else {
					System.out.println("not found");
				}
				
				
			}
			
			case 7->{
				System.out.println("Enter Salary to deleted: ");
				double sal = sc.nextDouble();
				
				boolean status = eservice.deletedBySal(sal);
				if(status) {
					System.out.println("Deleted succefully");
				}
				else {
					System.out.println("not found");
				}
				
				
			}
			
			case 8->{
				System.out.println("Enter Salary: ");
				double sal = sc.nextDouble();
				
				Set<Employee> eset = eservice.displayBySal(sal);
				
				if(eset!=null) {
					eset.forEach(System.out::println);
				}
				else {
					System.out.println("not found");
				}
				
			}
			
			case 9->{
				List<Employee> elist = eservice.sortBySal();
				elist.forEach(System.out::println);
			}
			
			case 10->{
				List<Employee> elist = eservice.sortByName();
				elist.forEach(System.out::println);
				
			}
			
			case 11->{
				Set<Employee> eset = eservice.sortByID();
				eset.forEach(System.out::println);
			}
			default->{
				System.out.println("wrong choice");
			}
			}
			
		}while(choice != 12);

	}

}
