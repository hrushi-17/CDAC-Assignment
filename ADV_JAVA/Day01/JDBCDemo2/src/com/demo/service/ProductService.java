package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	boolean deleteById(int id);

	boolean modifyById(int id, int qty, double price);

	Product getById(int id);

	List<Product> getAllProducts();

	List<Product> sortByPrice();

	void closeMyConnetion();

}
