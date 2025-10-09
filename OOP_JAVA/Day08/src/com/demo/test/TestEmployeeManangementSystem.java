package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeManangementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService eservice = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("------------------------------------------------------------------");
			System.out.println("----Welcome to Employee Data Page----");
			System.out.println("1. Add New Employee \n2. Display All \n3. Search by Id ");
			System.out.println("4. Search by name \n5. Update sal \n6. Delete by Id \n7. Delete by Sal ");
			System.out.println("8. Search by sal \n9. Sort by Sal \n10. Sort by ID \n11. Sort by name \n12. Exit ");
			System.out.println("------------------------------------------------------------------");
			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				boolean status = eservice.addNewEmployee();
				if (status) {
					System.out.println("User Added Sucessfully");
				} else {
					System.out.println("User not Found");
				}
			}
			case 2 -> {
				List<Employee> elist = eservice.displayAll();
				elist.forEach(System.out::println);
				
			}
			case 3 -> {
				System.out.println("Enter the ID to Search: ");
				int eid = sc.nextInt();
				Employee e = eservice.searchById(eid);
				if(e!= null) {
					System.out.println( "User found: "+ e);
				}else {
					System.out.println("User not Found");
				}
			}
			case 4->{
				System.out.println("Enter the Employee Name: ");
				String ename = sc.next();
				List<Employee> elist = eservice.findByName(ename);
				if(elist!=null) {
					System.out.println("User found: "+elist);
				}
				else {
					System.out.println("User not foud");
				}
			}
			case 5->{
				System.out.println("Enter the Employee ID: ");
				int eid = sc.nextInt();
				
				System.out.println("Enter the Salary to be Updated: ");
				double sal = sc.nextDouble();
				Employee newSal = eservice.updatedSal(sal , eid);
				if(newSal !=null) {
					System.out.println("Updated Sal is: "+ newSal);
				}else {
					System.out.println("Salary cannot be updated!");
				}
				
			}
			case 6->{
				System.out.println("Enter ID to be Deleted: ");
				int eid=sc.nextInt();
				boolean status=eservice.deleteById(eid);
				if(status) {
					System.out.println("Deleted successfully");
				}else {
					System.out.println("ID not found");
				}
			}
			case 7->{
				
				System.out.println("Enter Salary of Employees to be Deleted: ");
				double sal = sc.nextDouble();
				boolean status = eservice.deletedBySal(sal); ;
				if(status) {
					System.out.println("Deleted successfully");
				}else {
					System.out.println("ID not found");
				}
			}
			case 8->{
				System.out.println("Enter the Employee Salary: ");
				double sal =  sc.nextDouble();
				List<Employee> elist = eservice.findBySalary(sal);
				if(elist!=null) {
					System.out.println("Salary found: "+ elist);
				}
				else {
					System.out.println("salary not found");
				}
				
			}
			case 9 ->{
				System.out.println("Sorted Employess are as Follows: ");
				System.out.println("---------------------------");
				List<Employee> elist = eservice.sortedSalary();
				elist.forEach(System.out::println);
			}
			
			case 10->{
				System.out.println("Sorted Employee by ID: ");
				List<Employee> elist = eservice.sortById();
				elist.forEach(System.out::println);
			}
			case 11->{
				System.out.println("Sorted Data by Name: ");
				List<Employee> snm = eservice.sortByName();
				snm.forEach(System.out::println);
			}
			default ->{
				System.out.println("Wrong Choice.......");
			}
			}
		} while (choice != 12);

	}

}
