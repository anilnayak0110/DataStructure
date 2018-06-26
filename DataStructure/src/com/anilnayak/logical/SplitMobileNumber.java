package com.anilnayak.logical;

public class SplitMobileNumber {

	public static void splitMobileNumber(int number) {
		int x = number;
		int i = 1;
		
		int arr[] = new int[100];
		while(x > 0) {
			arr[i++] = x % 10;
			x = x /10;		
		}
		for(int j = i-1;j>0;j--) {
			System.out.print(arr[j]+"  ");
		}
		
		
	}
	public static void main(String[] args) {
		splitMobileNumber(123456789);
	}

}
