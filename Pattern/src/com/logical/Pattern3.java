package com.logical;

import java.util.Scanner;
/*
Pattern
1
12
123
1234
12345

*/
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want: ");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}
	}

}
