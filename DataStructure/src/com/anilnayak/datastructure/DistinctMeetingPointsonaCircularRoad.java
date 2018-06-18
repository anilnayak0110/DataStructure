package com.anilnayak.datastructure;

public class DistinctMeetingPointsonaCircularRoad {
	
	public int findGCD(int a, int b) {
		int c = a % b;
		while(c!=0) {
			a = b;
			b = c;
			c = a % b;
		}
		return b;
	}
	
	public int calculateNumberOfMeet(int a , int b) {
		int ans = 0;
		if(a>b) {
		 ans = a-b;	
		}
		else {
			ans = b-a;
		}
		if (a < 0)
	        a = a * (-1);
	 
	    if (b < 0)
	        b = b * (-1);
	 
	    return ans / findGCD(a, b);
		
	}

	public static void main(String[] args) {
         
		int a = 1, b = 1;
		DistinctMeetingPointsonaCircularRoad meetPoints = new DistinctMeetingPointsonaCircularRoad();
		System.out.println(meetPoints.calculateNumberOfMeet(a, b));
	}

}
