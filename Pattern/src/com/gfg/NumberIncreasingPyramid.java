package com.gfg;

import java.util.Scanner;

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
/*
output-
Enter a number of rows u want:
5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/