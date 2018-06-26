package com.anilnayak.logical;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int number = sc.nextInt();
     int rem = 0;
     int decimalNo = 0;
     int j = 1;
     while(number!=0) {
    	 rem = number % 10;
    	 decimalNo = decimalNo + rem * j;
    	 j = j * 2;
    	 number = number / 10;
     }
     System.out.println(decimalNo);
	}

}
