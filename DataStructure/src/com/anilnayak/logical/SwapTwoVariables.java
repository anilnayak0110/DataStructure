package com.anilnayak.logical;

public class SwapTwoVariables {

	public static void swapWithTempVariable(int x, int y) {

		int temp = 0;
		System.out.println("Before Swap the value od 'x' and 'y' is :::" + x + " , " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swap the value of 'x' and 'y' is::::" + x + " , " + y);
	}

	public static void swapWithoutTempVariable(int x, int y) {
		System.out.println("Before Swap the value od 'x' and 'y' is :::" + x + " , " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swap the value of 'x' and 'y' is::::" + x + " , " + y);
	}

	public static void main(String[] args) {

		swapWithTempVariable(10, 20);
		System.out.println("-----------------------------------------------------------");
		swapWithoutTempVariable(10, 20);

	}

}
