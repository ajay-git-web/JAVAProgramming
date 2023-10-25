package com.logical;

import java.util.Scanner;

public class Patternnumber19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = number; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 1; k < i; k++)
				System.out.print("  ");
			for (int j = number; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= number; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int k = number*2-i; k > i; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
