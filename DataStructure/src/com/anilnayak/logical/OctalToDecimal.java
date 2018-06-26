package com.anilnayak.logical;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Octal number");
        int octNum = sc.nextInt();
        int deciMalNo = 0;
        int rem = 0;
        int i = 0;
        while(octNum!=0) {
        	rem = octNum % 10;
        	deciMalNo = (int) (deciMalNo + rem * Math.pow(8, i++));
        	octNum = octNum / 10;
        }
        System.out.println(deciMalNo);
	}

}
