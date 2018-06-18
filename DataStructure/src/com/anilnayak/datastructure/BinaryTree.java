package com.anilnayak.datastructure;

class MyNode{
	int data;
	MyNode left,right;
	
	MyNode(int data){
		this.data = data;
		left = right = null;
	}
}
public class BinaryTree {
	
	MyNode a, b;
	
	boolean areMirror(MyNode a, MyNode b) 
    {
       
        if (a == null && b == null)
            return true;
 
       
        if (a == null || b == null) 
            return false;

        return 
                areMirror(a.left, b.right)
                && areMirror(a.right, b.left);
    }

	public static void main(String[] args) {
		MyNode a = new MyNode(1);
		MyNode b = new MyNode(1);
        a.left = new MyNode(2);
        a.right = new MyNode(3);
        
       
        
       
 
        b.left = new MyNode(3);
        b.right = new MyNode(2);
       
		
		BinaryTree tree = new BinaryTree();
		
		if(tree.areMirror(a, b)==true) {
			System.out.println("Yes it is a Mirror of Binary tree");
		}
		else {
			System.out.println("No it is not a Mirror of Binary tree");
		}
		

	}

}