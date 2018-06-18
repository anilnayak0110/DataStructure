package com.anilnayak.datastructure;

class TestNode{
	
	int data;
    TestNode left, right;
	public TestNode(int data) {
		this.data = data;
		left = right = null;
	}
	
}

public class ArrayToBST {
	static TestNode root;
	public TestNode sortedArrayToBST(int arr[], int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = (start+end)/2;
		
		TestNode node = new TestNode(arr[mid]);
		node.left = sortedArrayToBST(arr, start, mid-1);
		node.right = sortedArrayToBST(arr, mid+1, end);
		return node;
	}
	public void printInOrder(TestNode node) {
		if(node==null) {
			return ;
		}
		System.out.print(node.data+" ");
		printInOrder(node.left);
		printInOrder(node.right);
	}

	public static void main(String[] args) {
		ArrayToBST tree = new ArrayToBST();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        root = tree.sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        tree.printInOrder(root);
	}

}
