package com.anilnayak.logical;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number");
      int no = sc.nextInt();
      int sum = 0;
      while(no!=0) {
    	  sum+= no%10;
    	  no = no /10;
      }
      System.out.println(sum);
	}

}
