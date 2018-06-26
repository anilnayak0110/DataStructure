package com.anilnayak.logical;

import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		int[] oct = new int[1000];
		int i = 1, j = 0, rem, dec = 0, bin;
		Scanner in = new Scanner(System.in);
		System.out.print("Input a Binary Number: ");
		bin = in.nextInt();
		while (bin > 0) {
			rem = bin % 10;
			dec = dec + rem * i;
			i = i * 2;
			bin = bin / 10;
		}
		i = 0;
		while (dec != 0) {
			oct[i] = dec % 8;
			dec = dec / 8;
			i++;
		}
		System.out.print("HexaDecimal value: ");
		for (j = i - 1; j >= 0; j--) {
			
				System.out.print(oct[j] + "\n");
			
		}
	}

}
