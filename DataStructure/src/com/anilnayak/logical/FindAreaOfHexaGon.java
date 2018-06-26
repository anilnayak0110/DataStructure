package com.anilnayak.logical;

import java.util.Scanner;

public class FindAreaOfHexaGon {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no of Side ");
      int side = sc.nextInt();
      System.out.println("The Area of Hexagon :::::"+(6*(side*side))/(4*Math.tan(Math.PI/6)));
	}

}
