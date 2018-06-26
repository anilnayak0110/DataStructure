package com.anilnayak.logical;

public class FibonicWithRecurssion {

	public static void fibonic(int num1,int num2) {
		int num3 = 0;
		if(num1==0) {
		System.out.println(num1+"\n"+num2);
		}
		num3 = num1 + num2;
		if(num3<=100) {
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			fibonic(num1, num2);
		}
	}
	public static void main(String[] args) {
		fibonic(0,1);
	}

}
