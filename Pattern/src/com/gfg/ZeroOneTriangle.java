package com.gfg;

import java.util.Scanner;

public class ZeroOneTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anumber of rows u want: ");
		int number=sc.nextInt();
		int count;
		for(int i=1;i<=number;i++) {
			if(i%2!=0) 
				count=1;
			else
				count=0;
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count=1-count;
			}System.out.println();
		}

	}

}

/*

Enter anumber of rows u want: 
4
1 
0 1 
1 0 1 
0 1 0 1 

*/