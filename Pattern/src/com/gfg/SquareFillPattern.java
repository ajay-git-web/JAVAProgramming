package com.gfg;

import java.util.Scanner;

public class SquareFillPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows u want:");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=number;j++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}

/*
op-
*****
*****
*****
*****
*****

*/