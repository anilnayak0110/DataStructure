package com.anilnayak.logical;

import java.nio.charset.Charset;

public class ListAvailableCharSet {

	public static void main(String[] args) {
         System.out.println("Available Charecter Sets are::::::");
         for(String s: Charset.availableCharsets().keySet()) {
        	 System.out.println(s);
         }
	}

}
