package com.logical;

import java.util.Scanner;
/*
 op-
 Enter a number of rows u want:
5
     *
    ***
   *****
  *******
 *********
 *********
  *******
   *****
    ***
     * 
 
 */

public class Pattern9Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number = sc.nextInt();
		int count = 1;
		int cnt = number * 2 - 1;

		for (int i = 1; i <= number; i++) {
			for (int k = i; k <= number; k++)
				System.out.print(" ");
			for (int j = 1; j <= count; j++) {
				System.out.print("*");
			}
			count = count + 2;
			System.out.println();
		}

		for (int i = 1; i <= number; i++) {
			for (int k = 1; k <= i; k++)
				System.out.print(" ");
			for (int j = 1; j <= cnt; j++) {
				System.out.print("*");
			}
			cnt = cnt - 2;
			System.out.println();
		}

	}

}
