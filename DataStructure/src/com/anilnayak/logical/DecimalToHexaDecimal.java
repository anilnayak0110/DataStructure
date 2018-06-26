package com.anilnayak.logical;

import java.util.Scanner;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hexDecNum = "";
		int rem = 1;
		while (number > 0) {
			rem = number % 16;
			hexDecNum = hex[rem] + hexDecNum;
			number = number / 16;
		}
		System.out.println(hexDecNum);
	}

}
