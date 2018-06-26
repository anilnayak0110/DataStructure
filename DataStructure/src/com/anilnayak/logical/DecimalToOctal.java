package com.anilnayak.logical;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        int arr[] = new int[100];
        int i = 1;
        while(number!=0) {
        	arr[i++] = number % 8;
        	number  = number / 8;
        }
        for(int j = i-1;j>0;j--) {
        	System.out.print(arr[j]);
        }
	}

}
