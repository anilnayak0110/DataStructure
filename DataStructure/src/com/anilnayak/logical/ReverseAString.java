package com.anilnayak.logical;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String");
      String inputString = sc.nextLine();
      char[] cArray = inputString.toCharArray();
      String reverseString = "";
      for(int i = cArray.length-1;i>=0;i--) {
    	  reverseString= reverseString + cArray[i];
      }
      System.out.println(reverseString);
	}

}
