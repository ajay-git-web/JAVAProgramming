package com.gfg;

import java.util.Scanner;

public class RevrseLeftHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows u want");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int k=0;k<i;k++)
			System.out.print(" ");
			for(int j=number;j>=i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}

}

/*

 *****
  ****
   ***
    **
     *
*/