package com.gfg;

import java.util.Scanner;

public class SquareHollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anumber of rows u want:");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=number;j++) {
				if(i==1 || i==number||j==1 ||j==number) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

}
