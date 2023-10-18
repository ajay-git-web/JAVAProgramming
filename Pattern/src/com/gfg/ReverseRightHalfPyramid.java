package com.gfg;

import java.util.Scanner;

public class ReverseRightHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want: ");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=number;j>=i;j--) {
				System.out.print("* ");
			}System.out.println();
		}
	}

}
/*

* * * * * 
* * * * 
* * * 
* * 
* 

*/