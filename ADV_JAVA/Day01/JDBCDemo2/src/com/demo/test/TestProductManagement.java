package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProductManagement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		ProductService pservice=new ProductServiceImpl();
		do {
			System.out.println("---------------------------------------------------");
			System.out.println("1. Add new product\n2. Delete product\n3. Modify product");
			System.out.println("4.Find by Id\n5. Display all\n6. Display in sorted order\n7. Exit");
			System.out.println("Choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=pservice.addNewProduct();
				if(status) {
					System.out.println("product added successfully");
				}else {
					System.out.println("Not added");
				}
			}case 2->{
				System.out.println("enter id");
				int id=sc.nextInt();
				boolean status=pservice.deleteById(id);
				if(status) {
					System.out.println("product deleted successfully");
				}else {
					System.out.println("Not deleted");
				}
			}
			case 3->{
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter qty");
				int qty=sc.nextInt();
				System.out.println("enter price");
				double price=sc.nextDouble();
				boolean status=pservice.modifyById(id,qty,price);
				if(status) {
					System.out.println("product updated successfully");
				}else {
					System.out.println("Not updated");
				}
			}
			case 4->{
				System.out.println("enter id");
				int id=sc.nextInt();
				Product p=pservice.getById(id);
				if(p==null) {
					System.out.println("not found");
				}else {
					System.out.println(p);
				}
			}
			case 5->{
				List<Product> plst=pservice.getAllProducts();
				plst.forEach(System.out::println);
			}
			case 6->{
				List<Product> plst=pservice.sortByPrice();
				plst.forEach(System.out::println);
			}
			case 7->{
				System.out.println("Thank you for visiting .....");
				sc.close();
				pservice.closeMyConnetion();
			}
			}
		}while(choice!=7);


	}

}
