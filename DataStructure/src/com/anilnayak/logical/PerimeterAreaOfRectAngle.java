package com.anilnayak.logical;

//Write a Java program to print the area and perimeter of a rectangle
public class PerimeterAreaOfRectAngle {

	public static void main(String[] args) {
		double height = 8.5;
		double weidth = 5.6;
		double perimeterOfRectAngle = 2 * (weidth + height);
		double areaOfRectAngle = (weidth * height);
		System.out.println("Perimeter of RectAngle ::::::" + perimeterOfRectAngle);
		System.out.println("Area of RectAngle :::::" + areaOfRectAngle);
	}

}
