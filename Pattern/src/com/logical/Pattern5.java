package com.logical;

import java.util.Scanner;

/*
Pattern
1
22
333
4444
55555

*/
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want: ");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}System.out.println();
		}
	}

}
