package com.anilnayak.logical;

import java.util.Scanner;

public class CountNoOfLetterSpaceInAString {

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String");
        String inpuString = sc.nextLine();
        int letter = 0;
        int spaces = 0;
        int number = 0;
        int other = 0;
        char[] cArray = inpuString.toCharArray();
        for(int i =0;i<inpuString.length();i++) {
        	if(Character.isLetter(cArray[i])) {
        		letter++;
        	}
        	else if(Character.isSpaceChar(cArray[i])) {
        		spaces++;
        	}
        	else if(Character.isDigit(cArray[i])){
        		number ++ ;
			}
			else{
				other ++;
			}
        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + letter);
		System.out.println("space: " + spaces);
		System.out.println("number: " + number);
		System.out.println("other: " + other);
	}

}
