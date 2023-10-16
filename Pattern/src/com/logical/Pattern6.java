package com.logical;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a rows what u want:");
		int number=sc.nextInt();
		for(int i=number;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}
	}

}

/*
12345
1234
123
12
1

*/