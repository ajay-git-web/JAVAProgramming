package com.logical;

import java.util.Scanner;

public class Patternnumber12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=i;k<number;k++)
				System.out.print("  ");
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}System.out.println();
		}
		
	}

}
/*
Enter a number of rows u want:
4
1      1
12    21
123  321
12344321

*/