package com.anilnayak.logical;
//Write a Java program to print the area and perimeter of a circle
public class PerimeterAreaOfCircle {

	public static void main(String[] args) {
        double radius = 7.5;
        
        double perimeterOfCircle = 2*Math.PI*radius;
        double areaOfCircle      = Math.PI*(radius*radius);
        System.out.println("Perimeter of Circle is :::::"+perimeterOfCircle);
        System.out.println("Area of Circle is :::::"+areaOfCircle);
	}

}
