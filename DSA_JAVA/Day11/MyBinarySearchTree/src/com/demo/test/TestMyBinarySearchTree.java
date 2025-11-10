package com.demo.test;

import com.demo.trees.MyBinarySearchTree;

public class TestMyBinarySearchTree {

	public static void main(String[] args) {
		
		MyBinarySearchTree bst = new MyBinarySearchTree();
		
		bst.insertNode(40);
		bst.insertNode(16);
		bst.insertNode(50);
		bst.insertNode(34);
		bst.insertNode(15);
		bst.insertNode(42);
		bst.insertNode(22);
		bst.insertNode(36);
		
		System.out.println("----------INORDER TRAVERSAL----------");
		bst.inorder();
		
		System.out.println("----------PREORDER TRAVERSAL----------");
		bst.preorder();
		
		System.out.println("----------POSTORDER TRAVERSAL----------");
		bst.postorder();
		
		bst.deleteNode(15);
		System.out.println("----------INORDER TRAVERSAL----------");
		bst.inorder();
		
		bst.deleteNode(34);
		System.out.println("----------INORDER TRAVERSAL----------");
		bst.inorder();
		
		bst.deleteNode(42);
		System.out.println("----------INORDER TRAVERSAL----------");
		bst.inorder();
		
		System.out.println("----------SEARCH BINARY TREE RECURSSIVE----------");
		bst.serach(22);
		
		System.out.println("----------SEARCH BINARY TREE NON RECURSSIVE----------");
		bst.serach(36);

	}

}
