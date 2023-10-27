package com.gfg;

import java.util.Scanner;

public class NumberChangingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		int count=1;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count=count+1;
			}System.out.println();
		}

	}

}

/*
output-
Enter a number of rows u want:
4
1 
2 3 
4 5 6 
7 8 9 10 

*/