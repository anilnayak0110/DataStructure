package com.anilnayak.logical;

import java.util.Scanner;

public class AreaOfPolygon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Side ");
		int side = sc.nextInt();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of Each Side ");
		int lengthOfEachSide = s.nextInt();
		
		System.out.println("The area of Polygon  is:::"+((side*(lengthOfEachSide*lengthOfEachSide))/(4*(Math.tan(Math.PI/side)))));

	}

}
