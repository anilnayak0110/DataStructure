package com.anilnayak.logical;

import java.util.Scanner;

public class DisplayASCII {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any charecter");
        String s = sc.next();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++) {
        	int x = c[i];
        	 System.out.println("ASCII value is:::"+x);
        }
       
        
	}

}
