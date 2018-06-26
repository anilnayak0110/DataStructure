package com.anilnayak.logical;

public class SumOfPrimenumber1to100 {

	public static void main(String[] args) {

         int sum = 0;
         for(int i=2;i<=100;i++) {
        	 if(isPrime(i)) {
        		 System.out.println("The Prime Numbers are::::"+i+",");
        		 sum = sum+i;
        	 }
         }
         System.out.println("The sum of all prime number is::::"+sum);
		
	}
	
	public static boolean isPrime(int number) {
		for(int j = 2; j<=number/2;j++) {
			if(number%j==0) {
				return false;
			}
		}
		return true;
	}

}
