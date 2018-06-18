package com.anilnayak.datastructure;

class Node{
	int data;
	Node left,right;
	Node(int d){
		this.data = d;
		left = right = null;
	}
}
class Sum{
	int sum = 0;
}
public class BinaryTreeSumTree {
	static Node root;
	Sum summ = new Sum();

	public void printInOrder(Node node) {
		if(node==null) {
			return ;
		}
		printInOrder(node.left);
		System.out.print(node.data +" ");
		printInOrder(node.right);
	}
	void addGreaterUtil(Node node, Sum sum_ptr) { 
		// Base Case 
		if (node == null) { 
			return; 
			} 
		// Recur for right subtree first so that sum of all greater // nodes is stored at sum_ptr 
		addGreaterUtil(node.right, sum_ptr); 
		// Update the value at sum_ptr
		sum_ptr.sum = sum_ptr.sum + node.data; 
		// Update key of this node 
		node.data = sum_ptr.sum; 
		// Recur for left subtree so that the updated sum is added // to smaller nodes 
		addGreaterUtil(node.left, sum_ptr);
	}

	Node addGreater(Node node) { 
		addGreaterUtil(node, summ); 
		return node; 
		}

	public static void main(String[] args) {
		BinaryTreeSumTree tree = new BinaryTreeSumTree();
		root = new Node(5);
		root.left = new Node(2);
		root.right = new Node(13);
		System.out.println("Inorder traversal of given tree ");
		tree.printInOrder(root);
		
		Node node = tree.addGreater(root); 
		System.out.println("");
		System.out.println("Inorder traversal of modified tree "); 
		tree.printInOrder(node);


	}

}
