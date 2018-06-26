package com.anilnayak.logical;

import java.util.Scanner;

//Write a Java program that takes a number as input and prints its multiplication table upto 10
public class MultiplicationTable {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number");
      int number = sc.nextInt();
      for(int a =0;a<10;a++) {
    	 System.out.println(number +" * "+(a+1) +" = "+number*(a+1)); 
      }
	}

}
