package com.anilnayak.logical;

public class ConvertSecondsToHHmmss {

	public static void main(String[] args) {
          int seconds = 7200;
          
          int ss = seconds % 60;
          int min = seconds / 60;
          int mm = min % 60;
          int hh = min / 60;
          System.out.println(hh +":"+mm+":"+ss);
          
          
          
          
	}

}
