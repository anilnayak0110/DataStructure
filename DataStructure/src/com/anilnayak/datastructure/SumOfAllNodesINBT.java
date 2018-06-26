package com.anilnayak.datastructure;

class SumNode{
	int key;
	SumNode left,right;
	public SumNode(int key) {
		this.key = key;
	    left = right = null;
	}
}
public class SumOfAllNodesINBT {
      
	public int sumNode(SumNode node) {
		
		if(node== null) {
			return 0;
		}
		return node.key + sumNode(node.left) + sumNode(node.right);
		
	}
	public static void main(String[] args) {
		SumNode node = new SumNode(1);
		node.left = new SumNode(1);
		node.right = new SumNode(3);
		node.left.left = new SumNode(4);
		node.left.right = new SumNode(5);
		node.right.left = new SumNode(6);
		node.right.right = new SumNode(7);
		node.right.left.right = new SumNode(8);
		SumOfAllNodesINBT n = new SumOfAllNodesINBT();
		System.out.println(n.sumNode(node));
		
		
	}

}
