package com.logical;

import java.util.Scanner;

//using count
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want :");
		int number=sc.nextInt();
		int count=1;
		for(int i=1;i<=number;i++) {
			for(int k=number;k>=i;k--)
				System.out.print(" ");
			for(int j=1;j<=count;j++) {
				System.out.print("*");
			}
			count=count+2;
			System.out.println();
		}
	}

}

/*

Enter a number of rows u want :
7
       *
      ***
     *****
    *******
   *********
  ***********
 *************
*/