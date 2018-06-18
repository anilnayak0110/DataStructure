package com.anilnayak.datastructure;

import java.math.BigInteger;

public class FindTheLCMOfTwoLargeNumber {

	public static void main(String[] args) {

		String a = "36594652830916364940473625749407";
        String b = "448507083624364748494746353648484939";
		BigInteger s = new BigInteger(a);
        BigInteger s1 = new BigInteger(b);
		
        BigInteger mul = s.multiply(s1);
        
        BigInteger gcd = s.gcd(s1);
        
        BigInteger lcm = mul.divide(gcd);
        
        System.out.println(lcm);
	}

}
