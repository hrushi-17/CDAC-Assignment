package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudentManagmentSystem {

	public static void main(String[] args) {
		
		StudentService studservice = new StudentServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			
			System.out.println("1. Add New Student \n2. Display All ");
			System.out.println("3. Search by Id \n4. Search by name \n4. Search by Marks ");
			System.out.println("5. Update Marks \n6. Delete by Id \\n7. Delete by Marks \n9. Sort by ID \n10. Sort by Name \n11. Sort by Marks \n12. Exit ");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1->{
				boolean status = studservice.addNewStudent();
				if(status) {
					System.out.println("Student data added succesfully");
				}
				else {
					System.out.println("student not found");
				}
				
			}
			case 2->{
				System.out.println("Students Data: ");
				List<Student> slist = studservice.displayAll();
				slist.forEach(System.out::println);
			}
			
			}
			
			
			
		}while(choice!=10);
		

	}

}
